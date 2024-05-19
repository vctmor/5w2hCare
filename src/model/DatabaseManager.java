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
                
                int urgency = rs.getInt(3);                
                double budget = rs.getDouble(7);
                LocalDate starDate = rs.getDate(8).toLocalDate();
                LocalDate endDate = rs.getDate(9).toLocalDate();
                int status = rs.getInt(10);
                
                actions.add(new Action(urgency, budget, starDate, endDate, status));
            }    
                
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return actions;
    }
    
}
