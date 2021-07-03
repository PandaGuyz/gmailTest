package RestassureProjTest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	
	@Test
	public void func1() {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		//relaxedHTTPSValidation : for ssl ceriti
		//urlEncodingEnabled : to avoid any encryption
		//there can exist pathParam() too
		String response =
				given().
						relaxedHTTPSValidation().urlEncodingEnabled(false).log().all().
						queryParam("key", "qaclick123").
						header("Content-Type", "application/jason").
		//				body("watevr payload").
				when().
						post("maps/api/place/add/json").
				then().
						assertThat().statusCode(200).
//						body("msg", equalTo("Address successfully updated")).
						extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		String placeId = js.getString("place_id");
		//so json can parsed like course[2].titel if its nested
		//to knw the size.. js.getInt("course.size()") //get it into some variable and traverse like array.
		Assert.assertEquals(placeId, "pacific ocean");
		System.out.println(placeId);
		
		/* in the abv body can be read from external file too.
		 * body(GenerateStringFromResource("C:\\User:\\shwetha\\AddBookDetails.json"));
		 * 
		 * public static String GenerateStringFromResource(String filepath){
		 * return new String(Files.readAllBytes(Path.get(filepath)))
		 * }
		 */
		
		
		/*Session filters
		 * we can get the session from first api. store it and use it in next api.
		 * Create obj :  SessionFilter session=new SessionFilter();
		 * and pass filter(session) in given part
		 * given().log().all().filter(session).when().post().then().extract().response().asString();
		 * So in next api, use same session obj . SYntax and placement is same .
		 * 
		 * All these things can also be done via extracint and parsing response of first api where session will be sent
		 * and save into variable and use in subsequent apis. But it is the better way to approach and with minimal code and reusibility.
		 */
		
		/*when my response xml is of html type but we are doing it in json then write below in when()
		 * when().expect().defaultParser(Parser.JSON)
		 * expect() and defaultPasrse are required.
		 * 
		 */
		
		/*OAuth2' : book my show and gmail authentication
		 * FIrst we need to get the code bw bookmyshow and gmail
		 * Once we get the code we need to pass it to get the token
		 * Using this token we can access further api
		 * client id, redirect uri,granttype, scope need to be sent to get code:
		 * client_id, client secret, grant_type as autorization_code, redirect_uri and code which is tocken (here client secret also we are sending)
		 * 
		 */
		
		/*For pojo
		 * deserialization. parsing the response using pojo
		 * do getter and setter method.
		 * Higher level is of çlass type and lower level is of string type. 
		 * You need to divide the json from higher level to lower level till its of type string.
		 * 
		 * so it will be like obj1.getcourse().getApi().get(1).getcoursetitle
		 * here course will have webautomation, api, appium
		 * and api will have array of coursetitle, and price
		 * Hence courses will have list of api
		 * 
		 * .
		 * hence getApi().get(1).getcoursetitle.
		 * 
		 * FOr serialization. (sending the pojo object into body)
		 * call the setters 
		 * 
		 */
			
	}

}
