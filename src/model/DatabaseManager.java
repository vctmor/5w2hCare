import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import model.DAO;

public class DatabaseManager {

    private static final DAO dao = new DAO();
    private static final Connection conn = dao.connect();

    public static List<Action> getAllActions(){
        
        List<Action> actions = new ArrayList<>();

        System.out.println(conn);

        return actions;
    }
    
}
