package chap07_prac;

public class Tv {

	public static void main(String[] args) {
		TVRemoteController rm = new TVRemoteController();
		for (int i = 0; i < 10; i++) {
			rm.channelUp();
			System.out.println("MSG: 현재 채널: " +rm.ch );
		}
		for (int i = 0; i < 10; i++) {
			rm.channelDn();
			System.out.println("MSG: 현재 채널: " +rm.ch );
		}
		for (int i = 0; i < 5; i++) {
			rm.volUp();
			System.out.println("MSG: 현재 볼륨: " + rm.vol);
		}
		for (int i = 0; i < 5; i++) {
			rm.volDn();
			System.out.println("MSG: 현재 볼륨: " + rm.vol);
		}
		
	}

}
