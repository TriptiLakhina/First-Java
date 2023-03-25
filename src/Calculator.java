public class Calculator {

    //global static/class variables
    static int a=10;
    static int b=5;
    static int answer;

    //main method
    public static void main(String[] args){
        addition();                     //calling addition
        subtraction();                  //calling subtraction
        multiplication();               //calling multiplication
        division();                     //calling division
    }

    //no return type no parameter user defined method
    static void addition(){
        answer=a+b;
        System.out.println(answer);
    }
    static void subtraction(){
        answer=a-b;
        System.out.println(answer);
    }
    static void multiplication(){
        answer=a*b;
        System.out.println(answer);
    }
    static void division(){
        answer=a/b;
        System.out.println(answer);
    }

}