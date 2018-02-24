package stjoyj1.assignment1.edu;

/*

Page 177 , Project #3 " palindrome checking", using java.util.Stack
*Java Program that uses a stack to test whether an input string is a palindrome*
Feb 23rd 2018 Joseph St-Joy

 */

//import javax.swing.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import static java.lang.System.in;


public class assignment1 {


public static void main(String[] args)
{
    Scanner myscanner = new Scanner(in);
    String mystrngchar;

    do
    {
        System.out.print("Please type in a Palindrome for Checking (Press Enter To Stop program): ");
        mystrngchar = myscanner.nextLine( );
        if (is_palindrome(mystrngchar))
            System.out.println("Congratulations it  is a palindrome.");
        else
            System.out.println("Sorry Try again It is not a palindrome.");
    }
    while (mystrngchar.length( ) != 0);
}


    public static boolean is_palindrome(String input)
    {
        Queue<Character> q = new LinkedList<>();
        Stack<Character> s = new Stack<>( );
        Character anyword;
        int Dissimilarity = 0;
        int k;

        for (k = 0; k < input.length( ); k++)
        {
            anyword = input.charAt(k);
            if (Character.isLetter(anyword))
            {
                q.add(anyword);
                s.push(anyword);
            }
        }

        while (!q.isEmpty( ))
        {
            if (q.remove( ) != s.pop( ))
                Dissimilarity++;
        }


        return (Dissimilarity == 0);
    }


   /* public static void main(String[] args) {
        JFrame frame = new JFrame("Palindrome");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new assignment1());
        frame.pack();
        frame.setVisible(true);
        frame.setSize(900,200);
//if we had to make a panel to input
*/
    }







