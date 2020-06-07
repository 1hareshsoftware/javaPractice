//multiplication table//
import java.util.Scanner;
class MultiplicationTable
{
    public static void main (String [] args )
    {
        int n=10 , c;
        System.out.println("Enter an integer to print it's multiplication table");

        System.out.println("Multiplication table of "+n+" is :-");

        for (c=1; c<=10; c++)
            System.out.println(n+"*"+c+"="+(n*c));
    }
}