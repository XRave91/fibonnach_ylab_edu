import java.util.HashMap;

public class fibbonachi {

    private HashMap<Integer, Long> cachedFibbonachi = new HashMap<>();
    long recursiveCalculation(int position){
        if (position<=1){
            return 0;
        }
        if (position==2){
            return 1;
        }
        long result =cachedFibbonachi.getOrDefault(position, Long.valueOf(0));
        if (result==0) {
            result = recursiveCalculation(position - 2) + recursiveCalculation(position - 1);
            cachedFibbonachi.put(position, result);
        }else{
            System.out.println("use cached");
        }
        return result;
    }
}
