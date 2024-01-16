package lesson7;

public class SearchRequest {
    private SortRequest sortRequest;
    private Pagination pagination;

    public SortRequest getSortRequest() {
        return sortRequest;
    }

    public void setSortRequest(SortRequest sortRequest) {
        this.sortRequest = sortRequest;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}

class SortRequest {
    private String sortingField;

    public String getSortingField() {
        return sortingField;
    }

    public void setSortingField(String sortingField) {
        this.sortingField = sortingField;
    }
}
//Request Example:
//        {
//        "pagination": {
//        "limit": 10,
//        "offset": 20
//        },
//        "sort": {
//        "field": "Vegan",
//        "direction": "asc"
//        }
//        }

