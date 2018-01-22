package practice;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;



public class Insert {
    public boolean addBooks(book books) {
        Connection conn = null;
        //Statement对象
        Statement st = null;
        //结果集对象
        ResultSet rs = null;
        //驱动
        String driver = "com.mysql.jdbc.Driver";
        //连接数据库的URL
        String url = "jdbc:mysql://localhost:3306/t1?user=root&password=root&useUnicode=true&characterEncoding=UTF-8";
        String sql = "insert into tbl_book (name,pagination,price ) values('" + books.getName() + "','" + books.getPrice() + "','" + books.getPagination() + "')";
        boolean flag = false;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();
            int i = st.executeUpdate(sql);
            if (i == 1) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }
}

