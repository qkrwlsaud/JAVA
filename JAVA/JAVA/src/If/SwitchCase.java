package If;

public class SwitchCase {

	public static void main(String[] args) {
		int menuNum = 6;

		switch (menuNum) {

		case 1:
			System.out.println("1.Simple Java");
			
		case 2:
			System.out.println("2.Funny Java");
		case 3:
			System.out.println("3.Fantastic Java");
			
//		무조건 실행한다	
//		default:
//			System.out.println("d.The Best Programming Lanaguage");
		}
		
		System.out.println("Do you like coffee?");
	}

}
