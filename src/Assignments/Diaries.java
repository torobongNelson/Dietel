package Assignments;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class Diaries {
    private List<Diary> diaries = new ArrayList<>();


    public void add(Diary username,Diary password){
        diaries.add(username);
        diaries.add(password);
    }

    public Diary findByUsername(String username){
        if(!diaries.contains(username)){
            System.out.println("We couldn't find " + username);
        }
        int usernameIndex = diaries.indexOf(username);
        Diary foundUserName = diaries.get(usernameIndex);
       return foundUserName;
    }



    public void delete(String userName,String Password){
        Diary diary = findByUsername(userName);
        diaries.remove(diary);


//        for (int i = 0; i < diaries.size(); i++){
//            if(diaries.contains(userName) && diaries.contains(password) ){
//                int usernameIndex = diaries.indexOf(userName);



            }
        }




