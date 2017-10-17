//package database;
//import java.sql.*;
//
///**
// *
// * @author Cheng Zhu
// * create table can create a new database and connect to it. So this class is optional.
// *
// *
// */
//public class connectdb {
//
//    public static void connect() {
//        Connection conn = null;
//        try {
//            try {
//                Class.forName("org.sqlite.JDBC");
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//            // db parameters
//            String url = "jdbc:sqlite:E:/Gradute/FSD/StarHotel.db";
//            // create a connection to the database
//            conn = DriverManager.getConnection(url);
//
//            System.out.println("Connection to SQLite has been established.");
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//    }
//    public static void main(String[] args) {
//        connect();
//    }
//}