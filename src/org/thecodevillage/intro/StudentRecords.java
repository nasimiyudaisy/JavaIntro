package src.org.thecodevillage.intro;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by nasimiyu daisy on 9/27/2017.
 */
public class StudentRecords {


    String record;
    String name;
    String course = "";
    String college = "";
    String regNo = "";
    String dateBirth = "";
    int javaMarks;
    int phpMarks;
    int pythonMarks;

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
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

    StudentRecords(String record, String name, String course, String college, String regNo, String dateBirth, int javaMarks, int phpMarks, int pythonMarks) {

        this.record = record;
        this.name = name;
        this.course = course;
        this.college = college;
        this.regNo = regNo;
        this.dateBirth = dateBirth;
        this.javaMarks = javaMarks;
        this.phpMarks = phpMarks;
        this.pythonMarks = pythonMarks;
    }

        public static void main(String [] args) {

            LinkedList<StudentRecords> list = new LinkedList<>();
            list.add(new StudentRecords("record1", "Daisy", "IT", "Jkuat", "sc200-1453/2014","29sep",59,88,67));
            list.add(new StudentRecords("record2", "Elkanah", "IT", "Jkuat", "sc200-1567/2014","4nov",80,65,50));
            list.add(new StudentRecords("record3", "Hilda", "IT", "Jkuat", "sc200-1986/2014","23dec",65,45,88));
            list.add(new StudentRecords("record4", "Juyne", "IT", "Jkuat", "sc200-1435/2014","20oct",90,77,49));
            list.add(new StudentRecords("record5", "Nicholas", "IT", "Jkuat", "sc200-1345/2014","28july",88,64,60));


            


            Scanner input = new Scanner(System.in);
            System.out.println("enter record no to display content on the list:" +list);
            String rec= input.next();
            for (StudentRecords records:list) {
                if (records.getRecord(). equals(rec)){
                    System.out.println(records.getRecord()+"\t" +records.getName()+"\t" +records.getCourse()+"\t"+ records.getCollege()
                    +"\t" +records.getRegNo()+"\t"+ records.getDateBirth()+"\t"+records.getJavaMarks()+"\t"+records.getPythonMarks()+"\t"+records.getPhpMarks());
                }
            }
    }




    }

