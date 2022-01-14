package AntrianBankAdmin;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Admin {
    static Scanner input = new Scanner(System.in);
    static Connection connect = null;
    static boolean granted;
    public static void main(String[] args) throws SQLException, IOException, InterruptedException {
    boolean granted = false;
    boolean status = false;

        try {
            DBGetStatus();
        do {
        System.out.println("\t\t======================================================");
        System.out.println("\t\t\t\t\t Admin Panel");
        System.out.println("\t\t======================================================");
        System.out.println("\t\t\t1. Login");
        System.out.println("\t\t\t2. Logs");
        System.out.println("\t\t\t3. Logs");
        System.out.println();
        menuDBStatus();
        System.out.print("\t\t\tInput : ");
        int userInput = input.nextInt();
            if (userInput == 1) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                userAdminChecker();
                Thread.sleep(2000);
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else if (userInput == 2){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                ShowLogs();
                Thread.sleep(2000);
            } else if (userInput == 3){
                System.out.println("Byeeee");
                break;
            }
        } while (status = true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cek Koneksi Database anda", "Connection Failed", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void ShowLogs() throws SQLException {
        if (DBStatusCheck() == true) {
            String QueryShowAllLogs = "select * from quebanklogs";
            Statement statement = connect.createStatement();
            ResultSet resultSetLogs = statement.executeQuery(QueryShowAllLogs);
            System.out.println("\t\t\tNama"+"\tKeperluan"+"\tNoAntri"+"\tDate");
            while (resultSetLogs.next()) {
                System.out.println("\t\t\t"+resultSetLogs.getString(1)+"\t"+
                resultSetLogs.getString(2)+"\t\t"+
                resultSetLogs.getString(3)+"\t"+
                resultSetLogs.getString(4));
            }
            
        } else {
            System.out.println("\t\t\tTolong login dahulu");
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
                System.out.println("\t\tCek password dan username anda");
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

    public static void DBGetStatus() throws SQLException {
        connect = DriverManager.getConnection("jdbc:mysql://192.168.1.7:3306/quebank", "irfan", "root");
            if ( connect != null) {
                System.out.println("\t\t\t\t\tConnection Success");
                
            } else{
                System.out.println("Tolong check database dan koneksi anda");
            }
        }

        public static void menuDBStatus() {
            if (granted == true) {
                System.out.println("\t\t\tLogin Berhasil");
            } else {
                System.out.println("\t\t\tAnda Belum Login");
            }
        }
    }