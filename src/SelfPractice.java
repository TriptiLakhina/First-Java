public class SelfPractice {

    //static global variables
    static int a = 4;
    static int b = 9;
    static int c = 29;
    static int d = 77;
    static int answer;

    //Main method
    public static void main(String[]args){
        addition();
        addition1();
        addition3();
        multiplication();
        random();
        System.out.println(a+b);
    }

    //no return type no parameters user defined method

    static void addition(){
     answer = a+b;
     System.out.println(answer);

    }

    static void addition1(){
       answer = c+d;
       System.out.println(answer);

    }

    static void addition3(){
        answer = a+b+c+d;
        System.out.println(answer);

    }

static void multiplication(){
        answer = a*b*c*d;
        System.out.println(answer);
}

static void random(){
        answer = a+b*c-d;
        System.out.println(answer);
}


}
