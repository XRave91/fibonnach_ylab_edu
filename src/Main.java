import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        var fibonacciGetter = new fibonacci();
        Scanner console = new Scanner(System.in);
        int userinput;
        while(true){
            System.out.println("which number from Fibonacci sequence you needed");
            try {
                userinput = console.nextInt();
            }
            catch (InputMismatchException e){
                userinput=0;
                console.nextLine();
            }
            //System.out.println(fibonacciGetter.recursiveCalculation(userinput));
            if ((userinput<1)||(userinput>Integer.MAX_VALUE)){
                System.out.println("number must be between 1 and "+Integer.MAX_VALUE);
                continue;
            }
            System.out.println(fibonacciGetter.get(userinput));
        }

    }

}
