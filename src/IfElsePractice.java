import java.util.Scanner;

public class IfElsePractice
{
    Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        // creating class object to call non-static method in static area
        IfElsePractice ifElsePractice = new IfElsePractice();

        //calling method using class object
        ifElsePractice.eligibleforvote();

    }
    public void eligibleforvote()
        {
        //acknowledge the user what to enter
        System.out.println("Please enter your age in int value");

        //Storing age in variable using scanner object
    int age = scanner.nextInt();
    if (age>=18)
            {
        System.out.println("You are eligible to vote as your age is :"+age);

            }else
                {
        System.out.println("You are not eligible to vote as your age is: "+age);



        }



    }

}
