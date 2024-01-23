import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Number ");
        int Number = Integer.parseInt(scanner.next());
        if(Number % 5 == 0 && Number % 3 == 0)
            System.out.println("FizzBuzz");
        else
            if (Number % 5 == 0)
            System.out.println("fizz");
         else
             if (Number % 3 == 0)
            System.out.println("Buzz");
        else{
            System.out.println(Number);

        }

    }
}