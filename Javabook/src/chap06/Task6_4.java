package chap06;

public class Task6_4 {

	public static void main(String[] args) {
		//코드는 짧아졌지만 가독성이 나빠진 케이스1
		for(int i = 1; i < 13; i++) {
			System.out.print(i + "월 => ");
			
			for(int j = 1; j < 32; j++) {
				System.out.print(j + ",");
				
				if(i == 4 || i == 6 || i == 9 || i == 11) {
					if(j == 30) break;
				}
				if(i == 2) {
					if(j == 28) break;
				}
			}
			System.out.println();
		}
		
		
		//코드는 짧아졌지만 가독성이 나빠진 케이스2
		for(int i = 1; i < 13; i ++) {
			System.out.print(i + "월 => ");
			
			for(int j = 1; j < 32; j++) {
				System.out.print(j + ",");
				
				if((i == 4 || i == 6 || i == 9 || i == 11) && j == 30) break;
				if(i == 2 && j == 28) break;
			}
			System.out.println();
		}
	}

}
