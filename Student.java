public class Student {

    private int rollno;
    private String name;
    private char grade;

    public Student(int rollno, String name, char grade) {
        this.rollno = rollno;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Roll No : " + rollno + ", Name : " + name + ", Grade : " + grade;
    }

    public int getRollNo() {
        return this.rollno;
    }

    public char getGrade() {
        return this.grade;
    }

    public String getName(){
        return this.name;
    }

    public void setRollNo(int rollno) {
        this.rollno = rollno;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setName(String name){
        this.name = name;
    }
    
}
