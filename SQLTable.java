

/**
 This class represents an SQL Table

 @author Emma Hogan
 @version Fall 2020
 */
public class SQLTable {

    public String name;     // Name of the table
    public int num_cols;    // Number of columns in the table
    public SQLColumn[] columns;     // Columns
    private String[] column_strs;

    /**
     Construct a new Waypoint.

     @param name Table name
     @param num_cols Number of columns
     @param field_str The fields with their types as written in the SQL create table statement
     */
    public SQLTable(String name, String field_str) {
        this.name = name;
        column_strs = field_str.split(", ");
        num_cols = column_strs.length;
        for(int i=0; i<num_cols; i++){
            columns[i] = new SQLColumn(column_strs[i]);
        }
    }


    /**
     Return a String representation of the SQL Table

     @return a String representation of the SQL Table
     */
    public String toString() {
        String field_str = "";
        for(int i = 0; i < num_cols; i++){
            field_str += fields[i];
            field_str += " ";
        }
        return name + ": " + ;
    }



}
