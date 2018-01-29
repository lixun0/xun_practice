package practice;

import java.sql.*;

public class Select {
    public static void show(int id,String name) throws ClassNotFoundException {
        String  driver = null;
            try {
                driver="com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/t1?user=root&password=root&useUnicode=true&characterEncoding=UTF-8";
                Connection conn = DriverManager.getConnection(url);
                Class.forName(driver);
                Statement st = conn.createStatement();
                String sql;
                if (id != -1)
                {
                    sql = "select id,name,pagination,price from tb1"+" where id="+id;
                    System.out.println(sql);
                }
                else
                {
                    sql = "select id,name,pagination,price from tb1"+" where name='"+name+"'";
                }
                ResultSet rs = st.executeQuery(sql);
                System.out.println("查找成功！您查找的结果为：\n");
                while(rs.next()){//如果对象中有数据，就会循环打印出来
                    System.out.println("编号："+rs.getInt("id")+" 书名："+rs.getString("name")+",页码："+rs.getString("pagination")+",价格："+rs.getFloat("price"));
                }
                rs.close();
                st.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

