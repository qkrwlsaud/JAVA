package friend;

import java.util.ArrayList;
import java.util.Scanner;

/*수정 - 싱글톤 처리 2020.04.28
싱글톤 처리
생성자 접근 제어 지시자 : pirvate ⇒ 인스턴스 생성을 막음
공동으로 사용 할 인스턴스 생성 : static private
참조 변수 반환 메소드 : static public ⇒ 인스턴스 변수로 선언 
*/

/*
2020.05.01
배열에 저장 -> List 이용
*/

public class FriendInfoHandler { //데이터 입력 출력
	
	private static FriendInfoHandler handler = new FriendInfoHandler(100);
	
	public static FriendInfoHandler getInstance() {
		return handler;
	}
	
	//List 참조변수 ---------
	private ArrayList<Friend> myFriends;
	
	//Friend 타입의 정보를 저장 할 배열을 가짐
//	private Friend[] myFriends; //Friend 타입의 배열 선언, 외부 참조 불가능 
//	private int numOfFriends;   //저장된 친구의 정보 개수
	Scanner kb;
	
	//생성자 초기화: 저장 공간(사이즈) 크기를 받아서 배열을 생성 
	FriendInfoHandler(int num) {
//		this.myFriends=new Friend[num];
//		this.numOfFriends=0;
		kb=new Scanner(System.in);
	
		//ArrayList 인스턴스 생성 
		myFriends=new ArrayList<Friend>();
	}
	
	
	//친구 정보를 저장하는 기능
	//1_ 배열에 저장하는 기능
	void addFriendInfo(Friend f) {
//		myFriends[numOfFriends]=f; //배열에 저장 
//		numOfFriends++;
		myFriends.add(f);
	}
	
	//2_ 사용자에게 데이터를 받아서 사용자 요청에 맞는 인스턴스를 생성
	//HeighFriend UnivFriend 
	void addFriend(int choice) {
			
		// 기본정보 받기
		System.out.println("이름을 입력하세요");
		String name=kb.nextLine();
		System.out.println("전화번호를 입력하세요");
		String phoneNum=kb.nextLine();
		System.out.println("주소를 입력하세요");
		String addr=kb.nextLine();
		
		Friend friend=null;
		
		if(choice==1) {
			//1일 때 정보 받기 
			//HeighFriend 인스턴스 생성
			System.out.println("직업을 입력하세요");
			String work=kb.nextLine();
			friend=new HeighFriend(name, phoneNum, addr, work);
//			addFriendInfo(new HeighFriend(name, phoneNum, addr, work));
		}else if(choice==2) {
			//2일 때 정보 받기 
			//UnivFriend 인스턴스 생성 
			System.out.println("전공을 입력하세요");
			String major=kb.nextLine();
			System.out.println("학년을 숫자로 입력하세요");
			String grade=kb.nextLine();
//			Integer.parseInt(grade); //문자열을 받아서 정수형으로 반환해주는 static 메소드 
			friend=new UnivFriend(name, phoneNum, addr, major,Integer.parseInt(grade));
//			addFriendInfo(new UnivFriend(name, phoneNum, addr, major,Integer.parseInt(grade)));
		}
	
		//addFriendInfo 호출
		addFriendInfo(friend);
	}
	
	
	//친구 정보의 기본 정보 출력 가능
	void showAllSimpleData() {
		System.out.println("===== 친구의 기본정보를 출력합니다. =======");
//		for(int i=0;i<numOfFriends;i++) {
//			myFriends[i].showBasicInfo();
//			System.out.println("----------------------");
//		}
		
		for(int i=0;i<myFriends.size();i++) {
			myFriends.get(i).showBasicInfo();
			System.out.println("----------------------");
		}
		
	}
	
	//친구 정보의 상세 정보 출력 가능
	void showAllData() {
		System.out.println("==== 친구의 상세 정보를 출력합니다. ========");
//		for(int i=0;i<numOfFriends;i++) {
//			myFriends[i].showData();
//			System.out.println("----------------------");
//		}
		
		for(int i=0;i<myFriends.size();i++) {
			myFriends.get(i).showData();
			System.out.println("----------------------");
		}
		
	}
	
	
}
