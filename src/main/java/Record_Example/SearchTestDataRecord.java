package Record_Example;

import java.util.logging.Logger;

public record SearchTestDataRecord(String search, String searchDescription, String searchType, String searchResult) {
    // creates final instance variables
    // creates getters for each instance variable
    // creates toString()
    // creates equals()
    // creates hashCode()

    // cannot create instance variable that are not defined in the canonical constructor
    //    private final int id;


    // can create static variables
    public static final String SEARCH = "search";

    // can define instance methods
    public boolean isSearch() {
        return search.equals(SEARCH);
    }

    // can define static methods
    public static SearchTestDataRecord createSearchTestDataRecord() {
        return new SearchTestDataRecord("", "", "", "");
    }

    // what is canonical?
    // canonical constructor - a constructor that takes all the record's components as arguments

    // Default canonical constructor
//    public SearchTestData(String search, String searchDescription, String searchType, String searchResult) {
//        this.search = search;
//        this.searchDescription = searchDescription;
//        this.searchType = searchType;
//        this.searchResult = searchResult;
//    }

    // Custom canonical constructor
//    public SearchTestData(String search, String searchDescription, String searchType, String searchResult) {
//        if (search == null || searchDescription == null || searchType == null) {
//            throw new IllegalArgumentException("Search, searchDescription, and searchType cannot be null");
//        }
//        this.search = search;
//        this.searchDescription = searchDescription;
//        this.searchType = searchType;
//        this.searchResult = "No results found";
//    }

    // Compact constructor - specific to records
    public SearchTestDataRecord {
        if (search == null || searchDescription == null || searchType == null) {
            throw new IllegalArgumentException("Search, searchDescription, and searchType cannot be null");
        }
    }
}
