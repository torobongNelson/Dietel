import Assignments.Diary;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DiaryTest {
    Diary myDiary;
    @BeforeEach
    void setup(){
        myDiary = new Diary("Terri","2023");
    }


    @Test
    public void testThatICanLockDiary(){
        assertFalse(myDiary.isLocked());

        myDiary.lockDiary();

        assertTrue(myDiary.isLocked());
    }

   @Test
   public void testThatICanUnLockDiary(){
        myDiary.unlockDiary("2023");
        assertFalse(myDiary.isLocked());
    }
    @Test
    public void testThatDiaryIsLocked(){
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void testThatEntryCanBeCreatedInDiary(){
        myDiary.unlockDiary("2023");
        myDiary.createEntry("My SemiColon journey", "Dear Diary,its been yonks since i told you about how i have been really!");
        assertEquals(1,myDiary.getTotalNumberOfEntry());
    }
    @Test
    public void testThatMoreThanOneEntryCanBeCreated(){
        myDiary.unlockDiary("2023");
        myDiary.createEntry("My SemiColon journey", "Dear Diary,its been yonks since i told you about how i have been really!");
        myDiary.createEntry("My love story", "Dear Diary,can we skip this part?");
        myDiary.createEntry("My Birth story", "Dear Diary,...");
        assertEquals(3,myDiary.getTotalNumberOfEntry());
    }

    @Test
    public  void testThatEntryCanBeDeleted(){
        myDiary.unlockDiary("2023");
        myDiary.createEntry("My SemiColon journey", "Dear Diary,its been yonks since i told you about how i have been really!");
        myDiary.createEntry("My love story", "Dear Diary,can we skip this part?");
        myDiary.createEntry("My Birth story", "Dear Diary,...");
        assertEquals(3,myDiary.getTotalNumberOfEntry());
        myDiary.deleteEntry(1);
        assertEquals(2,myDiary.getTotalNumberOfEntry());
    }
}
