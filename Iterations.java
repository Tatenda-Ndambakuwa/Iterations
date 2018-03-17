import java.util.Scanner;
/**
 This program
 */

public class randomNumbers
{
    public static void main(String[] args)
    {
        String name="Tatenda ";
        System.out.println(name);
        System.out.println("Mentorship Section 2");
        System.out.println("Lab Assignment 5");

        Scanner in= new Scanner(System.in);
        boolean play = true;

        while(play){
            System.out.print("Guess a number:");
            int guess = 0;
            int random= (int) (Math.random() * 100) +1;
            int count = 0;

            while(guess !=random) 
            {
                guess= in.nextInt();
                //character: test nextInt is char displaying wrong input, play again.
                count ++;
                if (guess>random) 
                {
                    System.out.println("too high");
                } 
                 else if (guess<0 )
                {
                    System.out.println("quit");
                    break;
                }
                else if (guess< random)
                {
                    System.out.println("too low");
                }
            
                else
                {
                    System.out.println("Guess is correct, game over.");
                }

            } //end while guess loop

            if (guess==random)
            {
                System.out.println("you win"+ count + "guesses.");
            } // end if
            
            System.out.println("want to play again? If no, enter 'N', otherwise we'll keep playing");

            char again = in.next().charAt(0);
            if (again== 'N' || again == 'n')
            {
                play = false;
            } // end if

        } // end while game loop

    } // public static void

} // public class randomNumbers
