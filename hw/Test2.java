import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
	try {//if not exception
	    System.out.print("Please input a digit:");//Cancel auto line break
	    Scanner Input = new Scanner(System.in);
	    int InputData = Input.nextInt();
	    /*Becasuse a double digit divided by two equals zero
	    So There judge variable divided by two whether equals zero
	    Some decimals divided by two equals zero,too
	    But variable InputData's type is int
	    Fill decimals will result lost of accuracy
	    Avoided affair
	    */
	    if(InputData % 2 == 0) {
	        System.out.println("Double");
	    }
	    else { //If not equals zero
	        System.out.println("Single");
	    }
	    Input.close();//Release memory space
	}
	catch(Exception e) {//Detect Exception
	    System.out.println("Error:No a digit.");
	}
    }
}
    
