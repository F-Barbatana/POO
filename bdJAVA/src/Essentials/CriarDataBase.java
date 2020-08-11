package Essentials;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CriarDataBase {
    public static void main(String[] args) {
        createDataBase();
        
    }




    public static void createDataBase(){
        String sql = "CREATE TABLE \"product\" (\n" +
                "\t\"code\"\tINTEGER NOT NULL,\n" +
                "\t\"name\"\tTEXT,\n" +
                "\t\"price\"\tREAL,\n" +
                "\t\"quantity\"\tINTEGER,\n" +
                "\tPRIMARY KEY(\"code\")\n" +
                ")";
        try (Connection conn = DriverManager.getConnection(("jdbc:sqlite:product.db"));
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
