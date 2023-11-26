package PersonalPractice.Inheritance.one;

public class GraduateStudent extends Student {
    private String researchTopic;
    protected boolean isPartTime;

    public GraduateStudent(){
        super();
    }

//    public GraduateStudent(String name,int identificationNo,String department,String[] courses,String researchTopic,boolean isPartTime ){
//        super(name,identificationNo,department,courses);
//        this.researchTopic = researchTopic;
//        this.isPartTime = isPartTime;
//    }

    public void research(){
        System.out.println(getName() + " is researching " +  getResearchTopic());
    }
    public void setResearchTopic(String topic){
        this.researchTopic = topic;
    }
    public String getResearchTopic(){
        return this.researchTopic;
    }
    public boolean getIsPartTime(){
        return isPartTime;
    }
    public void setIsPartTime(){
       if(this.isPartTime){
           this.isPartTime = false;
       }
       else {
           this.isPartTime = true;
       }
    }
}
