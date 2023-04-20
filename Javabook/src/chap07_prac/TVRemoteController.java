package chap07_prac;

public class TVRemoteController {//Tv를 조작하는 클래스
	int vol = 0;//볼륨
	int ch = 0; //채널

	public void volUp() { //볼륨 up
		vol++;
	}
	
	public void volDn() { //볼륨 down
		vol--;
	}
	
	public void channelUp() { //채널 up
		ch++;
	}
	
	public void channelDn() { //채널 down
		ch--;
	}
}
