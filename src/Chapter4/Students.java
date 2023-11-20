package Chapter4;

import java.util.Scanner;

public class Students {
        private String name;
        private double average;

        public Students(String name, double average){
            this.name = name;
            if(average > 0.0 && average <= 100.0){
//                if(average <= 100.0){
                    this.average = average;
//                }
            }
        }

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
        public  void setAverage(double average){
            if(average > 0.0){
                if(average <= 100.0){
                    this.average = average;

                }
            }
        }

        public  double getAverage(){
            return this.average;
        }
        public String getLetterGrade(){
            String letterGrade = "";
            if(average >= 90){
                letterGrade = "A";
            }else if (average >= 80){
                letterGrade = "B";
            }else if(average >= 70){
                letterGrade = "C";
            }else if(average >= 60){
                letterGrade = "D";
            }else if(average >= 40){
                letterGrade = "E";
            }else{
                letterGrade = "F";
            }
            return letterGrade;

        }


}
