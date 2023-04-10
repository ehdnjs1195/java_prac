package alarmClock;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions f = new Functions();
		
	    char[][] fnd = {{1, 1, 1, 1, 1, 1, 0}, 
	            {0, 1, 1, 0, 0, 0, 0}, 
	            {1, 1, 0, 1, 1, 0, 1}, 
	            {1, 1, 1, 1, 0, 0, 1}, 
	            {0, 1, 1, 0, 0, 1, 1}, 
	            {1, 0, 1, 1, 0, 1, 1}, 
	            {1, 0, 1, 1, 1, 1, 1}, 
	            {1, 1, 1, 0, 0, 0, 0}, 
	            {1, 1, 1, 1, 1, 1, 1}, 
	            {1, 1, 1, 0, 0, 1, 1}};
	    
	    for(int i=0; i<10; i++) {
	    	f.dispFND(fnd[i]);
	    }
	    
	}
	
	
}
