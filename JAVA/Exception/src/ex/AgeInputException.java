package ex;

//예외 클래스
public class AgeInputException extends Exception {

	//생성자로 초기화 
	public AgeInputException() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}

}
