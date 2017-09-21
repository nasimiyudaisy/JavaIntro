package src.org.thecodevillage.common;

/**
 * Created by admin on 9/19/2017.
 */
public class Student {
    private String name;
    private String course;
    private String regNo;
    private String dateBirth;
    private int marks;
    private String total;
    int javaMarks;
    int phpMarks;
    int pythonMarks;
    private String grade;
    private int average;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getSchool() {
        return school;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){

        return name;
    }



    public void setCourse (String course) {
        this.course = course;
    }

    public String getCourse () {
        return course;
    }

    private String college;

    public void setCollege(String college){
        this.college=college;
    }

    public String getCollege(){
        return college;
    }
    private String school;



    public void setSchool(String Name)
    {
        this.school=school;
    }
    public String getSchool(String Name){
        return school;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
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


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

}






