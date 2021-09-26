package OOP.university;

public class Student extends Person {
    private int grade;

    @Override
    public void SayHello() {
        System.out.println("Hello, I'm a student and I'm learning how to override methods");
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }




}