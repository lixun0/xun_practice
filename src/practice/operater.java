package practice;


import java.sql.*;

public class operater {
    public static boolean add(String name, int number) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = database.getConnection();
            stmt = conn.createStatement();
            String sql = "insert into person(name,number) values('"+name+"',"+number+")";
            stmt.execute(sql);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        } finally {
            database.close(conn, stmt);
        }
    }

    public boolean delete(Integer id) {
        boolean flag = false;
        Connection conn = null;
        Statement st = null;
        String driver = null;
        String url = null;
        String sql = null;
        try {
            driver = "com.mysql.jdbc.Driver";
            url = "jdbc:mysql://localhost:3306/t1?user=root&password=root&useUnicode=true&characterEncoding=UTF-8";
            sql = "delete from Person where id = "+id.toString();
            Class.forName(driver);
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();
            int i = st.executeUpdate(sql);
            if (i >= 1) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean change(int id,String name, int number) {
        boolean flag = false;
        Connection conn = null;
        Statement st = null;
        String driver = null;
        String url = null;
        String sql = null;
        try {
            driver = "com.mysql.jdbc.Driver";
            url = "jdbc:mysql://localhost:3306/t1?user=root&password=root&useUnicode=true&characterEncoding=UTF-8";
            sql = "update person set name = '"+name+"',number="+number+"where id = "+id;

            Class.forName(driver);
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();
            int i = st.executeUpdate(sql);
            if (i >= 1) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public static void show(int id, String name) throws ClassNotFoundException {

        String driver = null;
        try {
            driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/t1?user=root&password=root&useUnicode=true&characterEncoding=UTF-8";
            Connection conn = DriverManager.getConnection(url);
            Class.forName(driver);
            Statement st = conn.createStatement();
            String sql;
            if (id != -1) {
                sql = "" + id;
                System.out.println(sql);
            } else {
                sql = "";
            }
            ResultSet rs = st.executeQuery(sql);
            System.out.println("查找成功！您查找的结果为：\n");
            while (rs.next()) {//如果对象中有数据，就会循环打印出来
                System.out.println("");
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}