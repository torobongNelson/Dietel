package Chapter4;

public class Citizens {
    private String name;
    private int Earnings;

    public Citizens(String name, int earnings) {
        this.name = name;
        Earnings = earnings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEarnings() {
        return Earnings;
    }

    public void setEarnings(int earnings) {
        Earnings = earnings;
    }


}
