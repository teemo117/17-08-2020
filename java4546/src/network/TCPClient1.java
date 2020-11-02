package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient1 {

	public static void main(String[] args) throws Exception {
		//100번 서버와 접속하기
		for (int i = 0; i < 100; i++) {
			Socket socket = new Socket("localhoㅇst", 9100);
			System.out.println("client1 서버와 연결됨");
			//브릿지 역할, 서버에서 보내준 데이터 read 해서 print하기
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data = input.readLine();
			System.out.println("받은 데이터 : " +  data);
		}
		System.exit(0);
	}

}
