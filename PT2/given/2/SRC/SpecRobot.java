

public class SpecRobot extends Robot {
    private int step;

    public SpecRobot() {
    }

    public SpecRobot(int step) {
        this.step = step;
    }

    public SpecRobot(String label, int type, int step) {
        super(label, type);
        this.step = step;
    }

    @Override
    public String toString() {
        return super.toString() + "," + step;
    }
    
    public void setData() {
        this.label = label.substring(0, 1) + step + label.substring(1);
    }
    
    public int getValue() {
        for (int i = 0;i<label.length();i++) 
            if (label.charAt(i)=='A' && type < 3) return step;
        return step + 2;
    }
}
