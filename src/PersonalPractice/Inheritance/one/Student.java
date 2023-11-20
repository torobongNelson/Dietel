package PersonalPractice.Inheritance.one;

public class Student {
    private String name;
    private int identificationNo;

    private String department;

    private String[] courses;

    public Student(String name,int identificationNo,String department,String[] courses ){
        this.name = name;
        this.department = department;
        this.identificationNo = identificationNo;
        this.courses = courses;
    }
    public void attendLectures(){
        System.out.println(this.name + " is attending lectures today.");
    }
    public void study(){
        System.out.println(this.name + " is studying.");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
