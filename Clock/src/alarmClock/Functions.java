package alarmClock;

public class Functions {
	final int X = 5;
	final int Y = 40;
	static char[][] screen = new char[5][40];
	static int[] num = new int[4];
	
	public void dispScreen() {
		
		
		for(int i = 0; i < screen.length; i++) {
			System.out.println(screen[i]);
		}
		System.out.println();
	}
	
	public void dispFND(int x, int y, char[] fnd) {
		char[][] seg = new char[5][5];
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5; j++)
				seg[i][j] = ' ';

		if(fnd[0] == 1) for(int j=0; j<5;j++) seg[0][j] = '#';
		if(fnd[1] == 1) for(int j=0; j<3;j++) seg[j][4] = '#';
		if(fnd[2] == 1) for(int j=0; j<3;j++) seg[2+j][4] = '#';
		if(fnd[3] == 1) for(int j=0; j<5;j++) seg[4][j] = '#';
		if(fnd[4] == 1) for(int j=0; j<3;j++) seg[2+j][0] = '#';
		if(fnd[5] == 1) for(int j=0; j<3;j++) seg[j][0] = '#';
		if(fnd[6] == 1) for(int j=0; j<5;j++) seg[2][j] = '#';
		
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				screen[y + i][x + j] = seg[i][j];
			}
		}
		
	}
	
	public char[] ttl7447() {
		char[][] fnd = {
				{1, 1, 1, 1, 1, 1, 0}, //0
	            {0, 1, 1, 0, 0, 0, 0}, //1
	            {1, 1, 0, 1, 1, 0, 1}, //2
	            {1, 1, 1, 1, 0, 0, 1}, //3
	            {0, 1, 1, 0, 0, 1, 1}, //4
	            {1, 0, 1, 1, 0, 1, 1}, //5
	            {1, 0, 1, 1, 1, 1, 1}, //6
	            {1, 1, 1, 0, 0, 0, 0}, //7
	            {1, 1, 1, 1, 1, 1, 1}, //8
	            {1, 1, 1, 0, 0, 1, 1}};//9
		int n = 0;
		for (int i = 0; i < 4; i++) {
			n |= (num[i] << i);
		}
		return fnd[n];
	}
	
	static int[] oldclk = {0,0,0,0,0,0};
	static int[] number = {0,0,0,0,0,0};
	public void ttl7490(int dev, int clk) {

		
		if(oldclk[dev] == 1 && clk == 0) {
			if(++number[dev] == 10) number[dev] = 0;
		}
		
		oldclk[dev] = clk;
		for (int i = 0; i < 4; i++) {
			num[i] = ((number[dev] >> i) & 1);
		}
		
	}
}
