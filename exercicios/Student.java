package exercicios;

public class Student extends People {
    private String course;

    public Student(int age, String name, String course) {
        super(age,name);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public void view(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Course: " + getCourse());
    }


    public static void main(String[] args) {
        Student p = new Student(18, "Patrick","Physical" );
        p.view();

    }
}
