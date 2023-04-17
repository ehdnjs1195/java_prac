package alarmClock;

public class Clock {

	public static void main(String[] args) {
		Functions f = new Functions();
		int[] num = new int[4];
		char fnd[];
		int[] n = f.num;
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0; j < 40; j++) {
				f.screen[i][j] = ' ';
			}
		}
		for (int i = 0; i < 500; i++) {
			
			f.ttl7490(0, i % 2);
			if (i % 2 == 0) {
				f.ttl7490(0, i % 2);
				f.dispFND(12, 0, f.ttl7447());
				
				f.dispFND(6, 0, f.ttl7447(f.ttl7490(1, f.ttl7490(0, i % 2)[3])));
				f.dispFND(0, 0, f.ttl7447(f.ttl7490(2, f.ttl7490(1, f.ttl7490(0, i % 2)[3])[3])));
				
				f.dispScreen();
			}

		}

	}

}
