/*
    This class represents a column in an SQL Table

    @author Emma Hogan
    @version Fall 2020
 */
public class SQLColumn {

    public String col_info = new String[2];      // Column info (name and datatype) as in appears in the create table statement
    public String name;     // Name of the column
    public String datatype;    // Datatype for column
    public int num_chars;     // For char datatypes, this is the number inside the parentheses

    /**
     Construct a new SQLColumn.

     @param str The column info as it appears in create table statement (name and datatype)
     */
    public SQLColumn(String str) {
        col_info = str.split(" ");
        name = col_info[0];
        if(col_info[1].contains("char")){
            datatype = "char";

            col_info[1] = col_info[1].trim();
            char c = col_info[1].charAt(0);
            int i = 0;
            while(c != '('){
                i++;
                c = col_info[1].charAt(i);
            }
            i++;        // i is now equal to the index of the start of the number inside parentheses
            num_chars = Integer.parseInt(col_info[1].substring(i, col_info[1].length() - 1));
        } else {
            datatype = col_info[1];
        }
    }

}
