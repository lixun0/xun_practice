package practice;

import java.sql.*;

public class Books {
    private String name;
    private String price;
    private String id ;
     private String pagination ;
    Books(String name,String price,String id){
         this.id = null;
         this.name = name;
         this.price = price;
         this.pagination = pagination;
    }
     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String Name) {
          this.name = name;
     }

     public String getPagination() {
          return pagination;
     }

     public void setPrice(String Sex) {
          this.price = price;
     }

     public String getPrice() {
          return price;
     }

     public void setPagination(String Age) {
          this.pagination = pagination;
     }
     private static Connection getConn() {
          String driver = "com.mysql.jdbc.Driver";
          String url = "jdbc:mysql://localhost:3306/samp_db";
          String username = "root";
          String password = "";
          Connection conn = null;
          try {
               Class.forName(driver);
               conn = (Connection) DriverManager.getConnection(url, username, password);
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          } catch (SQLException e) {
               e.printStackTrace();
          }
          return conn;
     }
     private static int insert(Books books) {
          Connection conn = getConn();
          int i = 0;
          String sql ="s "  ;
          PreparedStatement pstmt;
          try {
               pstmt = (PreparedStatement) conn.prepareStatement(sql);
               pstmt.setString(1, books.getName());
               pstmt.setString(2, books.getPagination());
               pstmt.setString(3, books.getPrice());
               i = pstmt.executeUpdate();
               pstmt.close();
               conn.close();
          } catch (SQLException e) {
               e.printStackTrace();
          }
          return i;
     }
     private static int update(Books books) {
          Connection conn = getConn();
          int i = 0;
          String sql = "update books set price='" + books.getPagination() + "' where Name='" + books.getName() + "'";
          PreparedStatement pstmt;
          i = getI(conn, i, sql);
          return i;
     }
     private static Integer getAll() {
          Connection conn = getConn();
          String sql = "select * from books";
          PreparedStatement pstmt;
          try {
               pstmt = (PreparedStatement)conn.prepareStatement(sql);
               ResultSet rs = pstmt.executeQuery();
               int col = rs.getMetaData().getColumnCount();
               System.out.println("============================");
               while (rs.next()) {
                    for (int i = 1; i <= col; i++) {
                         System.out.print(rs.getString(i) + "\t");
                         if ((i == 2) && (rs.getString(i).length() < 8)) {
                              System.out.print("\t");
                         }
                    }
                    System.out.println("");
               }
               System.out.println("============================");
          } catch (SQLException e) {
               e.printStackTrace();
          }
          return null;
     }
     private static int delete(String name) {
          Connection conn = getConn();
          int i = 0;
          String sql = "delete from students where Name='" + name + "'";
          PreparedStatement pstmt;
          i = getI(conn, i, sql);
          return i;
     }

     private static int getI(Connection conn, int i, String sql) {
          PreparedStatement pstmt;
          try {
               pstmt = (PreparedStatement) conn.prepareStatement(sql);
               i = pstmt.executeUpdate();
               System.out.println("resutl: " + i);
               pstmt.close();
               conn.close();
          } catch (SQLException e) {
               e.printStackTrace();
          }
          return i;
     }

}
