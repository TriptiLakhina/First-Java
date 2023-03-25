public class Personal {

    // global static class variables
    static String name = "Tripti";
    static String surname = "Lakhina";
    static int age = 37;
    static long mobilenumber = 7557768345L;
    static String address = "130 Reddal hill road WD196HZ";
    static int rollnumber = 35;
    static char grade = 'A';
    static boolean eligibility = true;
    static double amount = 12.90;

    // Main method
    public static void main(String[] args){
    System.out.println(name);                       //calling name
    System.out.println(age);                        //calling age
    System.out.println(mobilenumber);               //calling mobile number
    System.out.println(address);                    //calling address
    System.out.println(rollnumber);                 //calling roll number
    System.out.println(grade);                      //calling grade
    System.out.println(eligibility);                //calling eligibility
    System.out.println(amount);                     //calling amount
        System.out.println("Name="+name) ;
        System.out.println("Surname=" +surname); // write Surname in double quote, add the concotation + and then call the variable
    }

}
