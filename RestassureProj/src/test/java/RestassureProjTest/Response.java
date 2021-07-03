package RestassureProjTest;

import java.util.List;

public class Response {

    private int page;
    private int perPage;
    private int total;
    private int totalPages;
    private Data[] dataList;    //this is of type list as response has this as list
    private Support support;

    public Response(int page, int perPage, int total, int totalPages, Data[] dataList, Support support) {
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
        this.dataList = dataList;
        this.support = support;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public Data[] getDataList() {
        return dataList;
    }

    public void setDataList(Data[] dataList) {
        this.dataList = dataList;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }
}

