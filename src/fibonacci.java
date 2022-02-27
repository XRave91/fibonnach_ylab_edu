import java.util.HashMap;

public class fibonacci {
    private final HashMap<Integer, Long> cachedFibonacci = new HashMap<>();
    public fibonacci(){
        cachedFibonacci.put(1, 0L);
        cachedFibonacci.put(2, 1L);
    }
    HashMap getHash(){//TODO delete this
        return cachedFibonacci;
    }
    public long iterativeCalculation(int position){//todo
        long result;
        result= cachedFibonacci.getOrDefault(position,-1L);
        if(result!=-1){
            return result;
        }
        result= 1L;
        for (int i=position;i>0;i--){
            result= cachedFibonacci.getOrDefault(position,-1L);
            if(result!=-1){
                return result;
            }
        }
        return 0;
    }
    private long get(int position,int step){ //function that take care on callstack overflow nessesary only for BigInteger
        long result=-1L;
        try {
            result=recursiveCalculation(position);
        } catch (StackOverflowError e) {
            System.out.println("overflow "+position+" step "+step);
            step+=1;
            result=get(position/(step),step);
        } catch (LongOverflow e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    long get(int position){//
        return get(position,1);
    }
    long recursiveCalculation(int position) throws StackOverflowError, LongOverflow{//todo join with get(,)???
        long result = cachedFibonacci.getOrDefault(position, Long.valueOf(-1));
        if (result==-1) {
            result = recursiveCalculation(position - 2) + recursiveCalculation(position - 1);
            cachedFibonacci.put(position, result);
        }
        if(result<0){
            throw new LongOverflow("long is overflowed max number is "+ cachedFibonacci.get(position - 1)+" on position="+position);
        }
        return result;
    }
}
