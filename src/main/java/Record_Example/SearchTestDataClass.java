package Record_Example;

import java.util.Objects;

public class SearchTestDataClass {
    private final String search;
    private final String searchDescription;
    private final String searchType;
    private final String searchResult;

    public SearchTestDataClass( String search, String searchDescription, String searchType, String searchResult ){
        if( search == null || searchDescription == null || searchType == null ){
            throw new IllegalArgumentException( "Search, searchDescription, and searchType cannot be null" );
        }
        this.search = search;
        this.searchDescription = searchDescription;
        this.searchType = searchType;
        this.searchResult = searchResult;
    }

    public String getSearch(){
        return search;
    }

    public String getSearchDescription(){
        return searchDescription;
    }

    public String getSearchType(){
        return searchType;
    }

    public String getSearchResult(){
        return searchResult;
    }

    @Override
    public String toString(){
        return "SearchTestData{" + "search=" + search + ", searchDescription=" + searchDescription + ", searchType=" + searchType + ", searchResult=" + searchResult + '}';
    }

    @Override
    public boolean equals(Object o){
        if( this == o ) return true;
        if( o == null || getClass() != o.getClass() ) return false;

        SearchTestDataClass that = (SearchTestDataClass) o;

        if( !search.equals( that.search ) ) return false;
        if( !searchDescription.equals( that.searchDescription ) ) return false;
        if( !searchType.equals( that.searchType ) ) return false;
        return searchResult.equals( that.searchResult );
    }


    @Override
    public int hashCode(){
        return Objects.hash( search, searchDescription, searchType, searchResult );
    }
}
