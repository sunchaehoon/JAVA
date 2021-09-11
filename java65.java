package chap2;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String name) {
        studentName = name;
    }

    public static void main(String[] args) {
        Student studentAhn = new Student();
        Student studentSon = new Student();
        studentSon.studentName = "손흥민";
        studentAhn.studentName = "안연수";
        studentAhn.grade = 1;
        studentAhn.studentID = 1206;

        System.out.println(studentAhn.studentName);
        System.out.println(studentSon.studentName);
        System.out.println(studentAhn.getStudentName());
        System.out.println(studentAhn.grade);
        System.out.println(studentAhn.studentID);
    }
}
