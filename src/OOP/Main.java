package OOP;
import OOP.university.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------");
        System.out.println("PersonClass:");
        Person person = new Person();
        person.SayHello();
        person.setName("Antoni");
        person.setAge(25);
        System.out.println("My name is " + person.getName());
        System.out.println("I'm " + person.getAge());
        System.out.println("----------");

        System.out.println("PracownikUczelniClass:");
        PracownikUczelni pracownikUczelni = new PracownikUczelni();
        pracownikUczelni.SayHello();
        pracownikUczelni.setName("Adam");
        pracownikUczelni.setAge(35);
        System.out.println("My name is " + pracownikUczelni.getName());
        System.out.println("I'm " + pracownikUczelni.getAge());
        pracownikUczelni.visitUniversity();
        pracownikUczelni.getSalary();
        System.out.println("----------");

        System.out.println("ProfesorClass:");
        Profesor profesor = new Profesor();
        profesor.SayHello();
        profesor.setName("Michal");
        profesor.setAge(45);
        System.out.println("My name is " + profesor.getName());
        System.out.println("I'm " + profesor.getAge());
        profesor.visitUniversity();
        profesor.getSalary();
        profesor.giveGrade();
        profesor.makeTest();
        System.out.println("----------");

        System.out.println("PracownikAdministracjiClass:");
        PracownikAdministracji pracownikAdministracji = new PracownikAdministracji();
        pracownikAdministracji.SayHello();
        pracownikAdministracji.setName("Roman");
        pracownikAdministracji.setAge(54);
        System.out.println("My name is " + pracownikAdministracji.getName());
        System.out.println("I'm " + pracownikAdministracji.getAge());
        pracownikAdministracji.visitUniversity();
        pracownikAdministracji.getSalary();
        pracownikAdministracji.talkingWithStudent();
        pracownikAdministracji.talkingWithProfesor();
        pracownikAdministracji.sendEmail();
        System.out.println("----------");

        System.out.println("StudentClass:");
        Student student = new Student();
        student.SayHello();
        student.setName("Andrzej");
        student.setAge(22);
        System.out.println("My name is " + student.getName());
        System.out.println("I'm " + student.getAge());
        student.setGrade(5);
        System.out.println("My grade is: " + student.getGrade());
        System.out.println("----------");
    }
}