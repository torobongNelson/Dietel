package HumanProblem;

import HumanProblem.ProblemType;

public class Problem {

    private String name;
    private boolean IsSolved;

    private ProblemType problemType;

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setIsSolved(boolean IsSolved){
        this.IsSolved = IsSolved;
    }
    public boolean getIsSolved(){



        return IsSolved;
    }

    public Problem(String name, ProblemType problemType){
        this.name = name;
        this.problemType = problemType;
    }

}
