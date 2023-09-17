package tdd;

import Assignments.UnifiedTertiaryMatriculationExamination;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UnifiedTertiaryMatriculationExaminationTest {
    @Test
    public void TestThatUnifiedTertiaryMatriculationExaminationExist(){

        //given that i have U.T.M.E copies
        UnifiedTertiaryMatriculationExamination examination = new UnifiedTertiaryMatriculationExamination();
        //when i have U.T.M.E copies assert it is not null
        assertNotNull(examination);
    }
    @Test
    public void TestThatCalculateUTMECopiesBetweenOneToFourCopies(){
        //given the Copies exists
        UnifiedTertiaryMatriculationExamination examination = new UnifiedTertiaryMatriculationExamination();
        //when i call the method that calculates UTME copies
       double uTMEcopies = examination.calculateUTMECopiesPrice(4);
       //assert that i am expecting 8000 for four copies when i called method "calculateUTMECopiesPrice"
        assertEquals(8000, uTMEcopies);
    }
    @Test
    public void TestThatCalculateUTMECopiesBetweenFiveToNine(){
        //given the copies exists
        UnifiedTertiaryMatriculationExamination examination = new UnifiedTertiaryMatriculationExamination();
        //when i call the method that calculates UTME copies
        double uTMEcopies = examination.calculateUTMECopiesPrice(9);
        //assert that i am expecting 16200 for nine copies when i called method "calculateUTMECopiesPrice"
        assertEquals(16200,uTMEcopies);
    }
    @Test
    public void TestThatCalculateUTMECopiesBetweenTenToTwentyNine(){
        //given the copies exists
        UnifiedTertiaryMatriculationExamination examination = new UnifiedTertiaryMatriculationExamination();
        //when i call the method that calculates UTME copies
        double uTMEcopies = examination.calculateUTMECopiesPrice(29);
        //assert that i am expecting 46400for 29 copies when i called method "calculateUTMECopiesPrice"
        assertEquals(46400,uTMEcopies);

    }
    @Test
    public void TestThatCalculateUTMECopiesBetweenThirtyT0FourtyNine(){
        //given the copies exists
        UnifiedTertiaryMatriculationExamination examination = new UnifiedTertiaryMatriculationExamination();
        //when i call the method that calculates UTME copies
        double uTMEcopies = examination.calculateUTMECopiesPrice(49);
        //assert that i am expecting 73500 for 49 copies when i called method "calculateUTMECopiesPrice"
        assertEquals(73500,uTMEcopies);
    }
    @Test
    public void TestThatCalculateUTMECopiesBetweenFiftyT0NinetyNine(){
        //given that the copies exists
        UnifiedTertiaryMatriculationExamination examination = new UnifiedTertiaryMatriculationExamination();
        //when i call the method that calculates UTME copies
        double uTMEcopies = examination.calculateUTMECopiesPrice(99);
        //assert that i am expecting 73500 for 49 copies when i called method "calculateUTMECopiesPrice"
        assertEquals(128700,uTMEcopies);
    }
    @Test
    public void TestThatCalculateUTMECopiesBetweenOneHundredToHundredAndNinetyNine(){
        //given that the copies exists
        UnifiedTertiaryMatriculationExamination examination = new UnifiedTertiaryMatriculationExamination();
        //when i call the method that calculates UTME copies
        double uTMEcopies = examination.calculateUTMECopiesPrice(199);
        //assert that i am expecting 238800 for 49 copies when i called method "calculateUTMECopiesPrice"
        assertEquals(238800,uTMEcopies);
    }
    @Test
    public void TestThatCalculateUTMECopiesBetweenTwoHundredToFourHundredAndNinetyNine(){
        //given that the copies exists
        UnifiedTertiaryMatriculationExamination examination = new UnifiedTertiaryMatriculationExamination();
        //when i call the method that calculates UTME copies
        double uTMEcopies = examination.calculateUTMECopiesPrice(499);
        //assert that i am expecting 548900 for 49 copies when i called method "calculateUTMECopiesPrice"
        assertEquals(548900,uTMEcopies);

    }
    @Test
    public void TestThatCalculateFiveHundredUTMECopies(){
        //given that the copies exists
        UnifiedTertiaryMatriculationExamination examination = new UnifiedTertiaryMatriculationExamination();
        //when i call the method that calculates UTME copies
        double uTMEcopies = examination.calculateUTMECopiesPrice(500);
        //assert that i am expecting 500000 for 500 copies when i called method "calculateUTMECopiesPrice"
        assertEquals(500000,uTMEcopies);




    }





    }



