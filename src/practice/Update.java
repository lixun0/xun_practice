package practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Update {
    public boolean update(String name,double price,int pagination){
        boolean flag = false;
        Connection conn = null;
        Statement st = null;
        String driver =null;
        String url = null;
        String sql = null;
        try{
            driver="com.mysql.jdbc.Driver";
            url = "jdbc:mysql://localhost:3306/t1?user=root&password=root&useUnicode=true&characterEncoding=UTF-8";
            sql = "update tb1 set price = "+price+",pagination = "+pagination+" where name = '"+name+"'";
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
