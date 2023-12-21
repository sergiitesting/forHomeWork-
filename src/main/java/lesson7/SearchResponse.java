package lesson7;
import java.util.List;

public class SearchResponse {
    private List<DataItem> data;
    private Pagination pagination;

    public List<DataItem> getData() {
        return data;
    }

    public void setData(List<DataItem> data) {
        this.data = data;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

}
class DataItem implements Comparable<DataItem>{
    private String name;
    private String slug;
    private Integer cookingTime;

    DataItem(String name, String slug, Integer cookingTime) {
        this.name = name;
        this.slug = slug;
        this.cookingTime = cookingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(Integer cookingTime) {
        this.cookingTime = cookingTime;
    }

    @Override
    public int compareTo(DataItem d) {
        return Integer.compare(this.cookingTime, d.cookingTime);
    }

    @Override
    public String toString(){
        return "Name is: " + this.name + " slug is: " + this.slug + " cooking time is: " + this.cookingTime;
    }
}
class Pagination {
    private int limit;
    private int offset;
    private int total;


    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
//Response example:
//        {
//        "data": [
//        {
//        "name": "Test1",
//        "slug": "TestSlug1",
//        "cookingTime": "123"
//        },
//        {
//        "name": "Test2",
//        "slug": "TestSlug2",
//        "cookingTime": "35"
//        }
//        ],
//        "pagination": {
//        "offset": 20,
//        "limit": 10,
//        "total_count": 50
//        }
//        }
