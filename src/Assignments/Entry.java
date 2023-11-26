package Assignments;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private String entryBody;
    private LocalDateTime dateCreated;


    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setId(int id){
        this.title = title;
    }
    public int getId(){
        return id;
    }
    public void setEntryBody(String entryBody ){
        this.entryBody = entryBody;
    }
    public String getEntryBody(){
        return entryBody;
    }

    public Entry( int id,String title, String entryBody) {
        this.id = id;
        this.entryBody = entryBody;
        this.title = title;
    }
}




