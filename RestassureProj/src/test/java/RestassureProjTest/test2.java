package RestassureProjTest;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class test2 {
	
	@Test
	public void func2() {
		RestAssured.baseURI="https://reqres.in";
		//relaxedHTTPSValidation : for ssl ceriti
		//urlEncodingEnabled : to avoid any encryption
		//there can exist pathParam() too
		String responseString =
				given().
						relaxedHTTPSValidation().urlEncodingEnabled(false).log().all().
						queryParam("page", "2").
						header("Content-Type", "application/json").

				when().
						get("/api/users").
				then().
						assertThat().statusCode(200).
//						body("msg", equalTo("Address successfully updated")).
						extract().response().asString();
		
		JsonPath js = new JsonPath(responseString);
		String totalVar = js.getString("total");
		//so json can parsed like course[2].titel if its nested
		//to knw the size.. js.getInt("course.size()") //get it into some variable and traverse like array.
		Assert.assertEquals(totalVar, "12");
		System.out.println(totalVar);

		// Using Gson to parse
		Gson gson = new Gson();
		Response response1 = gson.fromJson(responseString, Response.class);
		System.out.println(response1.getPage());
		System.out.println(response1.getSupport().getUrl());
		System.out.println(response1.getDataList());



		// Fetching the response in class object

		Response responseObject =
				given().
						relaxedHTTPSValidation().urlEncodingEnabled(false).log().all().
						queryParam("page", "2").
						header("Content-Type", "application/json").
				when().
						get("/api/users").
						as(Response.class);



		System.out.println(responseObject.getPage());
		System.out.println(responseObject.getSupport().getUrl());
		System.out.println(responseObject.getDataList());



	}

}
