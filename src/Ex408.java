import java.util.Scanner;
public class Ex408 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		String choice = "q";
		
		do {
			System.out.println("영화를 선택하세요. q는 종료.");
			choice = s.next();
		} while (choice != "q");
		
	}

}
