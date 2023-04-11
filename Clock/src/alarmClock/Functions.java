package alarmClock;

public class Functions {
	public void dispFND(char[] fnd) {
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
		
		for (int i = 0; i < seg.length; i++) {
			System.out.println(seg[i]);
		}
		System.out.println("");
	}
	
	public char[] ttl7447(int[] num) {
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

	public char[] ttl7490(int clk) {
		
		
		return ;
	}
}
