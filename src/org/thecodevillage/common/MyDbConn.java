package src.org.thecodevillage.common;

import java.sql.*;

/**
 * Created by nasimiyu daisy on 9/29/2017.
 */
public class MyDbConn {
    static int rs1 = 0;

    public static void main(String[] args) {
        try {
            //Driver driver = new leDriver();
            //DriverManager.registerDriver(driver);
            Connection con = getDbConnection(
                    "jdbc:mysql://localhost:3306/student_db", "root", "");

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from tbl_students;");

            while (rs.next())
                System.out.println(rs.getInt("id") + rs.getString("name"));
            con.close();

        } catch (Exception e) {

            System.out.println(e);
            e.printStackTrace();


        }
        updateStudent();
        deleteStudent();
        insertStudent();
    }


    public static Connection getDbConnection(String url, String username, String password) {
        Connection con = null;

        try {
            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    url, username, password);

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return con;
    }
    //updating students

    public static void updateStudent() {

        try {
            Connection conn = getDbConnection("jdbc:mysql://localhost:3306/student_db", "root", "");
            System.out.println("updating students:");
            Statement stmt = conn.createStatement();
            int rs = stmt.executeUpdate(" update tbl_students SET course ='IT' WHERE id in (2,3);");
            System.out.println("Result:" + rs);
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    //inserting students

    public static void insertStudent() {
        //String name=student.getName(
        try {
            Connection conn = getDbConnection("jdbc:mysql://localhost:3306/student_db", "root", "");
            System.out.println("insert students:");
            Statement stmt = conn.createStatement();
            int rs1 = stmt.executeUpdate("insert into tbl_students(name,reg_no,course, date_of_birth, java_marks, php_marks, python_marks)VALUES ('Gloria', '65679','IT','1994-09-09',50,70,80);");
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();

        }
    }


    //delete students
    public static void deleteStudent() {

        try {
            Connection conn = getDbConnection("jdbc:mysql://localhost:3306/student_db", "root", "");
            System.out.println("delete students:");
            Statement stmt = conn.createStatement();
            int rs1 = stmt.executeUpdate(" delete from tbl_students WHERE id in (2,3);");
            System.out.println("Result:" + rs1);
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
