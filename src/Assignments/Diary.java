package Assignments;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class Diary{
    private String  username;
    private String password;
    private int totalNumberOfEntry;

    private boolean isLocked;
    private ArrayList<Entry> entries;



    public Diary(String  username,String password){
        entries = new ArrayList<>();
        this.username = username;
        this.password = password;
    }

    public void unlockDiary(String password){
        //todo check that password is correct
        if(this.password != password){
            System.out.println("Password is incorrect");
            exit(0);
        }
        this.isLocked = false;
    }

    public void lockDiary() {
        this.isLocked = true;
    }

    public boolean isLocked() {
        return this.isLocked;//returns the state
    }
    public void createEntry(String title,String body){
        totalNumberOfEntry ++;
        Entry entry = new Entry(1,title,body);
        entries.add(entry);


}

    public int getTotalNumberOfEntry() {
        return entries.size();
    }

    public void deleteEntry(int id) {
        Entry entry = findEntryById(id);
        entries.remove(entry);
        totalNumberOfEntry --;
    }

    private Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if(entry.getId() == id){
                return entry;
            }
        }
        return null;
    }
}
