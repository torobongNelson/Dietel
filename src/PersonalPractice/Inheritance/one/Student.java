package PersonalPractice.Inheritance.one;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    protected int identificationNo;

    private String department;

    private List<String> courses;

    public Student(String name,int identificationNo,String department ){
        //whatever value i provide at the point of instantiation my constructor sets it to my variable(properties)
        this.name = name;
        this.department = department;
        this.identificationNo = identificationNo;
        this.courses = new ArrayList<>();
    }

    public Student() {}

    public void attendLectures(){
        System.out.println(this.name + " is attending lectures today.");
    }
    public void study(){
        System.out.println(this.name + " is studying.");
    }

    public List<String> getCourses(){
        return this.courses;
    }

    public void setCourses(String course){
        courses.add(course);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
