package 클래스만들기;

public class 우리가족계좌정보출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		우리가족계좌정보 x = new 우리가족계좌정보();
		x.name1 = "홍길동";
		x.name2= "박길동";
		x.name3= "홍기사";
		x.bank1 = "튼튼적금";
		x.bank2 = "다음적금";
		x.money1 = 1000;
		x.money2 = 2000;
		x.money3 = 3000;
		System.out.println("우리 가족 계좌정보");
		System.out.println("-------------------------");
		System.out.println("이름\t"+"계좌이름\t"+"금액");
		System.out.println("-------------------------");
		System.out.println(x.name1+"\t"+x.bank1+"\t"+x.money1);
		System.out.println(x.name2+"\t"+x.bank1+"\t"+x.money2);
		System.out.println(x.name3+"\t"+x.bank2+"\t"+x.money3);
		System.out.print(x.name1+"은 ");
		x.in();
	
		System.out.print(x.name3+"은 ");
		x.out();
	}

}
