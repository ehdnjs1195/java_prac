package alarmClock;

public class Clock {

	public static void main(String[] args) {
		Functions f = new Functions();
		int[] num = new int[4];
		char fnd[];
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0; j < 40; j++) {
				f.screen[i][j] = ' ';
			}
		}
		int i = 0;
		for (; ;) {
			
			f.ttl7490(0, i % 2, 0, 0);
			if (i % 2 == 0) {
				f.ttl7490(0, i % 2, 0, 0);
				f.dispFND(34, 0, f.ttl7447());
				
				f.ttl7490(1, f.num[3], 0, 0);
				f.dispFND(28, 0, f.ttl7447());
				
				if(f.num[2] == 1 && f.num[1] == 1) {
					f.ttl7490(1, f.num[3], 1, 0);
					f.dispFND(28, 0, f.ttl7447());
				}
				f.ttl7490(2, f.num[2], 0, 0);
				f.dispFND(22, 0, f.ttl7447());

				f.ttl7490(3, f.num[3], 0, 0);
				f.dispFND(16, 0, f.ttl7447());
				
				if(f.num[2] == 1 && f.num[1] == 1) {
					f.ttl7490(3, f.num[3], 1, 0);
					f.dispFND(16, 0, f.ttl7447());
				}
				
				f.ttl7490(4, f.num[2], 0, 0);
				f.dispFND(10, 0, f.ttl7447());
				
				f.ttl7490(5, f.num[3], 0, 0);
				f.dispFND(4, 0, f.ttl7447());
				
				f.dispScreen();
			}
			
			i++;
		}

	}

}
