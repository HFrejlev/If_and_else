package Switch;

public class Switch {

    //If/else/else if are all both great tools. However, they can be a lot of work for more conditions
    //Switch is a good alternative if you wanna check if a certain condition is met.

    //In this example we have the variable of 3.
    /*Instead of typing if, else or else if a lot of times, we'll just use the switch method to evaluate
      the value and see if it matches any of the cases */

    public static void main (String[] args) {

        int rank = 3;
        switch (rank) {
            case 1:
                System.out.println("Amateur");
                break;
            case 2:
                System.out.println("Seasoned amateur");
                break;
            case 3:
                System.out.println("Getting there");
                break;
            case 4:
                System.out.println("You are the man!");
        }
    }
}

