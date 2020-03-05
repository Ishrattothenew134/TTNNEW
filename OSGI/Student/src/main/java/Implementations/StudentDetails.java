package Implementations;

public class StudentDetails {
    private int id;
    private String name;
    private int marks;
    private int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentDetails(int id , String name,int age,int marks){
        id=this.id;
        age=this.age;
        name=this.name;
        marks=this.marks;

    }
    public StudentDetails(){}

    public void getStudentDetails(){
        System.out.println(getId());
        System.out.println(getAge());
        System.out.println(getMarks());
        System.out.println(getName());
    }

}
