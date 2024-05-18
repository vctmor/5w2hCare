package model;

//import.model.Action;
import model.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class DatabaseManager {

    private static final DAO dao = new DAO();
    private static final Connection conn = dao.connect();    

    public static List<Action> getAllActions(){

        String query = "select * from action";
        
        List<Action> actions = new ArrayList<>();

        try (Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {

                int ri = rs.getInt(1);
                String name = rs.getString(2);
                LocalDate starDate = rs.getDate(8).toLocalDate();
                LocalDate endDate = rs.getDate(9).toLocalDate();
                
            }    
                
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return actions;
    }
    
}
