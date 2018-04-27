import org.junit.Test
import java.sql.ResultSet
import java.sql.DriverManager


/**
 * Created by Wiki on 2018/4/27.
 */

fun main(args: Array<String>) {
    //连接SQLite的JDBC
    Class.forName("org.sqlite.JDBC")
    //建立一个数据库名example.db的连接，如果不存在就在当前目录下创建之
    val conn = DriverManager.getConnection("jdbc:sqlite:src/main/resources/example.db")
    val stat = conn.createStatement()
    // //创建一个表,包含id、name两个字段
    stat.executeUpdate("create table user(id int,name varchar(20));")
    // 插入一行数据
    stat.executeUpdate("insert into user values(1,'Wiki1');")
    stat.executeUpdate("insert into user values(2,'Wiki2');")
    //查询所有数据
    val rs = stat.executeQuery("select * from user;")
    while (rs.next()) { //将查询到的数据打印出来
        print("id = " + rs.getString("id") + " ")
        println("name = " + rs.getString("name"))
    }
    rs.close()
    conn.close()
}