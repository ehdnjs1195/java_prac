package alarmClock;

public class Functions {
	public void dispFND(char[] fnd) {
		char[][] seg = new char[5][5];
		for(int i=0; i<5; i++) 
			for(int j=0; j<5; j++)
				seg[i][j] = ' ';
		
		if(fnd[0] == 1) for(int j=0; j<5;j++) seg[0][j] = '#';
		if(fnd[1] == 1) for(int j=0; j<3;j++) seg[j][4] = '#';
		if(fnd[2] == 1) for(int j=0; j<3;j++) seg[2+j][4] = '#';
		if(fnd[3] == 1) for(int j=0; j<5;j++) seg[4][j] = '#';
		if(fnd[4] == 1) for(int j=0; j<3;j++) seg[2+j][0] = '#';
		if(fnd[5] == 1) for(int j=0; j<3;j++) seg[j][0] = '#';
		if(fnd[6] == 1) for(int j=0; j<5;j++) seg[2][j] = '#';
		
		for(int i=0; i<seg.length; i++) {
			System.out.println(seg[i]);
		}
		System.out.println("");
	}
	
	public void ttl7447(char[] fnd) {
		
	}

}
