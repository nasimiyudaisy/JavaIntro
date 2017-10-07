package src.org.thecodevillage.common;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import src.org.thecodevillage.java.*;
import src.org.thecodevillage.java.Student;

/**
 * Created by nasimiyu daisy on 9/29/2017.
 */
public class MyDbConn {
    static int rs1 = 0;

    String name;
    String course = "";
    String regNo = "";
    String dateBirth = "";
    int javaMarks;
    int phpMarks;
    int pythonMarks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public int getJavaMarks() {
        return javaMarks;
    }

    public void setJavaMarks(int javaMarks) {
        this.javaMarks = javaMarks;
    }

    public int getPhpMarks() {
        return phpMarks;
    }

    public void setPhpMarks(int phpMarks) {
        this.phpMarks = phpMarks;
    }

    public int getPythonMarks() {
        return pythonMarks;
    }

    public void setPythonMarks(int pythonMarks) {
        this.pythonMarks = pythonMarks;
    }

    public MyDbConn(String name, String course, String regNo, String dateBirth, int javaMarks, int phpMarks, int pythonMarks) {
        this.name = name;
        this.course = course;
        this.regNo = regNo;
        this.dateBirth = dateBirth;
        this.javaMarks = javaMarks;
        this.phpMarks = phpMarks;
        this.pythonMarks = pythonMarks;
    }

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

        ArrayList<Student> myList=new ArrayList<>();
        myList=getMyList();
    }

    //list of students


    public static ArrayList<Student> getMyList() {

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

            Student student=new Student();
            student.setName(rs1.getString("name"));
            student.setCourse(rs1.getString("course"));
            student.setRegNo(rs1.getString("reg_no"));
            student.setDateBirth(rs1.getString("date_of_birth"));
            student.setJavaMarks(rs1.getInt("java_marks"));
            student.setPhpMarks(rs1.getInt("php_marks"));
            student.setPythonMarks(rs1.getInt("python_marks"));
            myList.add(student);


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
            String sql= "insert into tbl_students(name,course,reg_no, date_of_birth, java_marks, php_marks, python_marks) VALUES ('"+student.getName()+"','"+student.getCourse()+"','"+student.getRegNo()+"','"+student.getDateBirth()+"','"+student.getJavaMarks()+"','"+student.getPhpMarks()+"','"+ student.getPythonMarks()+"');";
            System.out.println("sql" + sql);
            int rs1 = stmt.executeUpdate(sql);

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
