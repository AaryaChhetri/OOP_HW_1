import models.Student;


public class Main {


    public static void main(String[] args) {

        int[] marks1 = {100,20,39,48,62};
        int[] marks2 = {78,56,11,98,62};
        int[] marks3 = {100,100,99,98,82};
        Student student_1 = new Student("Aarya Chhetry",18,marks3);
        Student student_2 = new Student("Yograj Pokhrel",17,marks3);
        Student student_3 = new Student("Raj Dhakal",17,marks3);


        student_1.display_info();

    }
}