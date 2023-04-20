package chap07_prac;

public class Elevator {	//엘리베이터 기능을 할 클래스.
	int limit_up_floor = 10;	//최대 층수
	int limit_down_floor = 0;	//최소 층수
	int floor = 1;	//현재 층수
	String help;	//안내멘트를 담을 변수

	void up() {		//올라가는 기능
		if (floor == limit_up_floor) {
			help = "마지막 층 입니다.";
		} else {
			floor++;
			help = floor + "층 입니다.";
		}
	}

	void down() {	//내려가는 기능
		if (floor == limit_down_floor) {
			help = "처음층 입니다.";
		} else {
			floor--;
			help = floor + "층 입니다.";
		}
	}
}
