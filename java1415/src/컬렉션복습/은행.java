package 컬렉션복습;

import java.util.ArrayList;

public class 은행 {

	public static void main(String[] args) {
		//5개의 계좌 생성
		// 동적 메모리 할당, 객체 생성시 마다 객체별로 멤버 변수가 복사가 되어 변수가 생성
		계좌 account1 = new 계좌("홍길동", "정기적금", 1000);
		//System.out.println(account1);
		계좌 account2 = new 계좌("김길동", "정기예금", 2000);
		//System.out.println(account2);
		계좌 account3 = new 계좌("서길동", "정기적금", 3000);
		//System.out.println(account1);
		계좌 account4 = new 계좌("박길동", "정기예금", 4000);
		//System.out.println(account2);
		계좌 account5 = new 계좌("민길동", "정기예금", 5000);
		//System.out.println(account2);
		//계좌 account3 = new 계좌();
		//account 정보를 저장 할 리스트 생성
		ArrayList<계좌> list = new ArrayList<>();
		//리스트에 account 저장
		list.add(account1);
		list.add(account2);
		list.add(account3);
		list.add(account4);
		list.add(account5);
		//파일출력 메서드 생성
		파일로저장2 file = new 파일로저장2();
		//list 전달
		file.save2(list);

	}

}
