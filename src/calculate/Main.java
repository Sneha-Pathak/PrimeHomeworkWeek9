package calculate;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
        char yn;
        do
        {
            //getting value using scanner
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first Number : ");
            int a = scanner.nextInt();
            System.out.print("Enter second Number : ");
            int b = scanner.nextInt();

            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter one of symbol +,-,*, / : ");
            String s = sc.nextLine();

            //Convert string to char
            char symbol = s.charAt(0);

            cal.calculateResult(a,b,symbol);
            System.out.print("“Would you like to do more calculation Please enter “Y” or “N” : ");
            String x = sc.nextLine();
            yn = x.charAt(0);

        }while (yn == 'Y' || yn == 'y');
    }
}
