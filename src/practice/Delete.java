package practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {
    public boolean delete(String name){
        boolean flag = false;
        Connection conn = null;
        Statement st = null;
        String driver =null;
        String url = null;
        String sql = null;
        try{
            driver="com.mysql.jdbc.Driver";
            url = "jdbc:mysql://localhost:3306/t1?user=root&password=guo941102&useUnicode=true&characterEncoding=UTF-8";
            sql = "delete from tbl_book where name = '"+name+"'";
            Class.forName(driver);
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();
            int i = st.executeUpdate(sql);
            if(i>=1){
                flag=true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
