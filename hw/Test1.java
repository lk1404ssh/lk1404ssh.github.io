import java.util.Scanner;
    
public class Test1 {
	public static void main (String[] args) {
	Scanner Input = new Scanner(System.in);
	String InputData = Input.nextLine();
	switch(InputData) {
		case "nee":
	    	System.out.println("nee");
	    	break;
		default:
	    	System.out.println("lee");
		}
	}
}
