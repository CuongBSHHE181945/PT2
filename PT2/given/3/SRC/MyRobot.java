
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class MyRobot implements IRobot {
    
    public static Comparator compareObj = new Comparator (){
    @Override
    public int compare(Object e1, Object e2){
            Robot r1 = (Robot)e1;
            Robot r2 = (Robot)e2;
            int d = r2.step-r1.step;
            if (d<0) return 1;
            if (d==0) return r1.label.compareTo(r2.label);
            return -1;
        }
    };
    
    public boolean ifContainAB(String s) {
        for (int i=0;i<s.length();i++)
            if (s.charAt(i)=='A' || s.charAt(i)=='B') return true;
        return false;
    }
    
    public int indexMax(List<Robot> t) {
        int max = t.get(0).getStep();
        int index = 0;
        for (int i=1;i<t.size();i++){
            if (t.get(i).getStep()>max){
                index =i;
                max = t.get(i).getStep();
            }           
        }
        return index;
    }
    
    public int f1(List <Robot> t) {
        int result = 0;
        for (int i = 0;i<t.size();i++) {
            String check = t.get(i).getLabel();
            if (ifContainAB(check)==false) result += t.get(i).getStep();
        }
        return result;
    }
    
    public void f2(List<Robot> t) {
        int pos = indexMax(t);
        t.remove(pos);
    }
    
    public void f3(List<Robot> t) {
        Collections.sort(t.subList(1, 4), MyRobot.compareObj);
    }
}
