package network;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	
	public static void main(String[] args) throws Exception {
		
		// 1. 연결 요청만 담당하는 서버용 socket이 필요 , ip주소,port
		//객체를 사용하는법 ㅊ
		//prototype(프로토타입) 방법 < - > singleton(싱글톤)
		//필요할때마다 객체 생성 < - > 하나만 객체 생성  주소를 재사용
		int i = 1;
		//포트번호 9100인 server 생성
		ServerSocket server = new ServerSocket(9100);
		//서버 켜지면 print문 출력
		System.out.println("TCP 서버 시작됨");
		System.out.println("클라이언트의 요청을 기다리는 중");
		while (true) { //클라이언트의 요청이 들어오면
			Socket socket = server.accept();//클라이언트 접속 및 확인
			System.out.println("서버와의 연결 성공 : " + i +"명 들어옴");
			//클라이언트가 접속하면 i 증가하기
			i++;
			//프린트해주기
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			out.println("i am a java programmer!!!");
		}
	}

}
