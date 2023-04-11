package alarmClock;

public class Clock {

	public static void main(String[] args) {
		Functions f = new Functions();
		int[] num = new int[4];
		char fnd[];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				num[j] = ((i >> j) & 1);
			}
			fnd = f.ttl7447(num);
			f.dispFND(fnd);
		}
		
	}

}
