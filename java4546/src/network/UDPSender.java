package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args)throws Exception{
		//보내는 쪽은 포트를 적지 않는다. 어차피 패킷에 작성하기 때문
		DatagramSocket socket = new DatagramSocket();
		String str = "i am a android programmer";
		byte[] data = str.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		
		DatagramPacket packet = new DatagramPacket(data,data.length,ip,7100);
		socket.send(packet);
		socket.close();
		
	}

}
