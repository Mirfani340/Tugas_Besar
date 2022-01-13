package AntrianBankAdmin;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Admin {
    static Scanner input = new Scanner(System.in);
    static Connection connect = null;
    static boolean granted;
    public static void main(String[] args) throws SQLException, IOException, InterruptedException {
    boolean granted = false;
    boolean status = false;

        dbGetStatus();
        do {
        System.out.println("\t\t======================================================");
        System.out.println("\t\t\t\t\t Admin Panel");
        System.out.println("\t\t======================================================");
        System.out.println("\t\t\t1. Login");
        System.out.println("\t\t\t2. Logs");
        System.out.println();
        System.out.print("\t\t\tInput : ");
        int userInput = input.nextInt();
            if (userInput == 1) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                userAdminChecker();
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else if (userInput == 2){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                ShowLogs();
            }
        } while (status = true);
    }

    public static void ShowLogs() throws SQLException {
        if (DBStatusCheck() == true) {
            String QueryShowAllLogs = "select * from quebanklogs";
            Statement statement = connect.createStatement();
            ResultSet resultSetLogs = statement.executeQuery(QueryShowAllLogs);

            while (resultSetLogs.next()) {
                System.out.println("\t\t\t"+resultSetLogs.getString(1)+"\t"+
                resultSetLogs.getString(2)+"\t"+
                resultSetLogs.getString(3)+"\t"+
                resultSetLogs.getString(4));
            }
            
        } else {
            System.out.println("Tolong login dahulu");
            return;
        }
    }

    public static boolean userAdminChecker() throws SQLException {
        System.out.print("\t\t\tUsername :");
        String userInpuUsername = input.next();
    
        System.out.print("\t\t\tPassword :");
        String userInputPassword = input.next();
    
        Statement statement = connect.createStatement();
        String QueryStringUserChecker = "select * from userAdmin";
        ResultSet resultSet = statement.executeQuery(QueryStringUserChecker);

        while (resultSet.next()) {
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            if (userInpuUsername.equals(username) && userInputPassword.equals(password)) {
                System.out.println("\t\t\t\t\tAccess Granted");
                granted = true;
            } else {
                System.out.println("Wrong ");
            }
        }
        return false;
    }

    public static boolean DBStatusCheck() {
        if (granted == true) {
            return true;
        }
        return false;
    }

    public static void dbGetStatus() throws SQLException {
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/quebank", "root", "mirfani340");
        if ( connect != null) {
            System.out.println("\t\t\t\t\tConnection Success");
            
        } else{
            System.out.println("Tolong check database dan koneksi anda");
        }
    }
}