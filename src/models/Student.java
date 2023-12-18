package models;

public class Student {
    String name;
    int age;
    int[] marks;

    int grade = 12;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void display_info(){
        String name = this.name;
        int grade = this.grade;
        int age = this.age;
        int[] marks = this.marks;
        int no_of_subjects = marks.length;
        double total_marks = 0;
        for (int i = 0; i < no_of_subjects; i++){
            total_marks += marks[i];
        }
        double obtained_marks = total_marks;
        double total_attainable_marks = marks.length * 100;
        double percentage = ((obtained_marks)/(total_attainable_marks)) * 100;


        System.out.println("RESULT");
        System.out.println("Name:"+" "+ name);
        System.out.println("Age:"+" "+ age);
        System.out.println("Grade:"+" "+ grade);

        System.out.println("Marks: ");
        for (int i = 0; i < no_of_subjects; i++) {
            System.out.println("Subject" + (i + 1) + ":" + marks[i]);
        }


        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

    }
}
