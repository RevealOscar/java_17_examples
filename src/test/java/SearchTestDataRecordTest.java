import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import Record_Example.SearchTestDataRecord;
import Record_Example.SearchTestDataClass;

public class SearchTestDataRecordTest {

    @Test
    public void test() {
        Logger.getLogger(SearchTestDataRecordTest.class.getName()).info("SearchTestDataRecordTest.test() started");
        // Regular class
        final var searchTestDataClass = new SearchTestDataClass("search", "searchDescription", "searchType", "searchResult");
        Logger.getLogger(SearchTestDataRecordTest.class.getName()).info("searchTestDataClass: " + searchTestDataClass);
        Logger.getLogger(SearchTestDataRecordTest.class.getName()).info("searchTestDataClass.getSearch(): " + searchTestDataClass.getSearch());
        Logger.getLogger(SearchTestDataRecordTest.class.getName()).info("searchTestDataClass.getSearchDescription(): " + searchTestDataClass.getSearchDescription());
        Logger.getLogger(SearchTestDataRecordTest.class.getName()).info("searchTestDataClass.getSearchType(): " + searchTestDataClass.getSearchType());
        Logger.getLogger(SearchTestDataRecordTest.class.getName()).info("searchTestDataClass.getSearchResult(): " + searchTestDataClass.getSearchResult());

        Logger.getLogger(SearchTestDataRecordTest.class.getName()).info("\n\n\n\n");
        // Record
        final var searchTestDataRecord = new SearchTestDataRecord("search", "searchDescription", "searchType", "searchResult");
        Logger.getLogger(SearchTestDataRecordTest.class.getName()).info("searchTestDataRecord: " + searchTestDataRecord);
        Logger.getLogger(SearchTestDataRecordTest.class.getName()).info("searchTestDataRecord.getSearch(): " + searchTestDataRecord.search());
        Logger.getLogger(SearchTestDataRecordTest.class.getName()).info("searchTestDataRecord.getSearchDescription(): " + searchTestDataRecord.searchDescription());
        Logger.getLogger(SearchTestDataRecordTest.class.getName()).info("searchTestDataRecord.getSearchType(): " + searchTestDataRecord.searchType());
        Logger.getLogger(SearchTestDataRecordTest.class.getName()).info("searchTestDataRecord.getSearchResult(): " + searchTestDataRecord.searchResult());

        searchTestDataRecord.isSearch();
//        // Record with default values
//        Logger.getLogger(SearchTestDataRecordTest.class.getName()).info("SearchTestDataRecordTest.test() started");
    }
}
