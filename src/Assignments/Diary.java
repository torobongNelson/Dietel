package Assignments;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class Diary{
    private String  username;
    private String password;
    private int totalNumberOfEntries;

    private boolean isLocked;
    private List<Entry> entries;



    public Diary(String  username,String password){
        entries = new ArrayList<>();
        this.username = username;
        this.password = password;
    }

    public boolean unlockDiary(String password){
        //todo check that password is correct
        if(this.password != password){
            System.out.println("Password is incorrect");
            exit(0);
        }
        return false;
    }

    public void lockDiary() {
        this.isLocked = true;
    }

    public boolean isLocked() {
        return this.isLocked;//returns the state
    }


    public void createEntry(String title,String body){
        Entry entry = new Entry(1,title,body);
        entries.add(entry);
        totalNumberOfEntries ++;
    }

    public int getTotalNumberOfEntries() {
        return entries.size();
    }


    public void deleteEntry(int id) {
        Entry entry = findEntryById(id);
        entries.remove(entry);
        totalNumberOfEntries --;
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if(entry.getId() == id){
                return entry;
            }
        }
        return null;
    }

    public void updateEntry(int id, String title, String body){
        Entry entry = findEntryById(id);
        entry.setTitle(title);
        entry.setEntryBody(body);

        entries.set(id,entry);
    }
}
