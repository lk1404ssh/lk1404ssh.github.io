import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		if(randomNumber < 50) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
