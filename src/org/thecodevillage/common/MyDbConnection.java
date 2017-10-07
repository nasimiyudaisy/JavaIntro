package src.org.thecodevillage.common;

import java.sql.*;

/**
 * Created by admin on 10/7/2017.
 */
public class MyDbConnection {
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

    public MyDbConnection(String name, String course, String regNo, String dateBirth, int javaMarks, int phpMarks, int pythonMarks) {
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

            PreparedStatement pstmt = con.prepareStatement("");
            ResultSet rs = pstmt.executeQuery("select * from tbl_students;");

            while (rs.next())
                System.out.println(rs.getInt("id") + rs.getString("name"));
            con.close();

        } catch (Exception e) {

            System.out.println(e);
            e.printStackTrace();

        }
        updateStudents();

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
    public static void updateStudents(){
        ResultSet rs=null;
        PreparedStatement pstmt=null;
        Connection conn=null;

        try {
            conn= MyDbConn.getDbConnection("jdbc:mysql://localhost:3306/student_db", "root", "");
            System.out.println("updating students:");
            String sql="SELECT * from tbl_students";
            pstmt = conn.prepareStatement(sql);
            int rs1 = pstmt.executeUpdate(" update tbl_students SET course ='IT' WHERE id in (2,3);");
            System.out.println("Result:" + rs1);
            conn.close();

        }catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        }

        // inserting students

    public static void insertStudents(src.org.thecodevillage.java.Student student) {
        try {
            Connection connection=MyDbConn.getDbConnection("jdbc:mysql://localhost:3306/student_db","root","");
            System.out.println("insert students:");
            String sql= "insert into tbl_students(name,course,reg_no, date_of_birth, java_marks, php_marks, python_marks) VALUES ('"+student.getName()+"','"+student.getCourse()+"','"+student.getRegNo()+"','"+student.getDateBirth()+"','"+student.getJavaMarks()+"','"+student.getPhpMarks()+"','"+ student.getPythonMarks()+"');";
            PreparedStatement psmt= connection.prepareStatement(sql);
            System.out.println("sql" + sql);

            int rs2=psmt.executeUpdate();
            connection.close();

        }catch(Exception k) {
            System.out.println(k);
            k.printStackTrace();
        }
    }
    // delete students
    public static void deleteStudent() {

    }


    }


