package databases;

import java.io.IOException;
import java.sql.SQLException;

public class UnitTestConnectDB {

    public void connectionTest() {

        try {
            ConnectDB.mongoDatabase();
            System.out.println("mysql database connected successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}