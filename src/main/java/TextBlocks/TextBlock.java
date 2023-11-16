package TextBlocks;

public class TextBlock {

    final String expectedString =
    "SELECT \"first_name\", \"last_name\"\n" +
    "FROM \"user\"\n" +
    "WHERE \"city\" = 'London'\n" +
    "ORDER BY \"last_name\";\n";


    // A text block's opening delimiter is sequence of three double quotes followed by zero or more white spaces, and a
    // _mandatory_ new line. (It's a compilation error if the new line isn't present).
    final String sqlString = """
      SELECT "first_name", "last_name"
      FROM "user"
      WHERE "city" = 'London'
      ORDER BY "last_name";
      """; // A text block's closing delimiter is a sequence of three double quotes.
}
