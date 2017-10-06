package src.org.thecodevillage.common;

import java.sql.*;
import java.util.ArrayList;

import src.org.thecodevillage.java.*;
import src.org.thecodevillage.java.Student;

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
        //insertStudent();
    }

    //list of students


    public ArrayList<Student> getMyList() {

        ArrayList<Student> myList = new ArrayList<>();
        Connection connection=getDbConnection("\"jdbc:mysql://localhost:3306/student_db", "root", "");
        String query = "SELECT * from tbl_students";
        Statement st;
        ResultSet rs;

        try {
            Statement statement = connection.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from tbl_students;");

            while (rs1.next())

                System.out.println(rs1.getInt("id") + rs1.getString("name") + rs1.getString("course")+ rs1.getInt("reg_no")+rs1.getString("date_birth")+rs1.getInt("java_marks")+rs1.getInt("php_marks")+rs1.getInt("python_marks"));
                  myList.add(new Student());

        } catch (Exception e) {

            System.out.println(e);
            e.printStackTrace();

        }
        return myList;

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

    public static void insertStudent(src.org.thecodevillage.java.Student student) {
        //String name=student.getName();
        try {
            Connection conn = getDbConnection("jdbc:mysql://localhost:3306/student_db", "root", "");
            System.out.println("insert students:");
            Statement stmt = conn.createStatement();
            int rs1 = stmt.executeUpdate("insert into tbl_students(name,course,reg_n0, date_of_birth, java_marks, php_marks, python_marks)VALUES (student.getName(),student.getRegNo(),student.getCourse(),student.getDateBirth(),student.getJavaMarks(),student.getPhpMarks(), student.getPythonMarks()");
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
