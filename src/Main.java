import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        var fibbonachiGetter = new fibbonachi();
        Scanner console = new Scanner(System.in);
        int userinput ;
        while(true){
            System.out.println("which number from Fibonacci sequence you needed");
            userinput = console.nextInt();
            System.out.println(fibbonachiGetter.recursiveCalculation(userinput));
        }

    }

}
