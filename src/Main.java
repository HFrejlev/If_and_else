import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        //The following code is an example of if statements

        //First I'll declare a couple of variables
        int a = 30;
        int b = 25;

        //In order to use if statements, I'll use the following example
        //This states that if the value of a is greater than the value of b, then the system will print the text.
        if (a > b) {
            System.out.println("a is greater than b - correct!");
        }

        //However, if the value is lesser, we can use the "else" statement.
        //This will print the "else" text if the value is lesser.
        if (a > b) {
            System.out.println("a is greater than b - correct!");
        } else {
            System.out.println("a is not greater - sorry!");
        }

        //A third example would be the use of "else if".
        //Else if is commonly used if we want to check if a second condition is true.
        //In this case a is NOT greater than 30, however it is equally the same. This triggers condition 2 (else if)
        if (a > 30) {
            System.out.println("a is greater than b - correct!");
        } else if (a==30) {
            System.out.println("Phew! A was the exactly the right amount!");
        } else {
            System.out.println("a is not greater - sorry!");
        }




    }
}






