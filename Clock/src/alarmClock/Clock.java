package alarmClock;

public class Clock {

	public static void main(String[] args) {
		Functions f = new Functions();
		int[] num = new int[4];
		char fnd[];

		for (int i = 0; i < 100; i++) {
			f.ttl7490(0, i % 2);
			if (i % 2 == 0) {
				f.dispFND(f.ttl7447(f.ttl7490(0, i % 2)));
				f.dispFND(f.ttl7447(f.ttl7490(1, f.ttl7490(0, i % 2)[3])));
			}

		}

	}

}
