package chap06;

public class Task6_5 {

	public static void main(String[] args) {
		//각 월의 일자를 switch문의 LOOP를 통해 출력한 형태.
		//쓰기는 간편하지만 어떤 코드인지 한번에 알아보기 어렵다.
		for (int i = 1; i < 13; i++) {
			System.out.print(i + "월 => ");
			
			LOOP:for(int j = 1; j < 32; j++) {
				System.out.print(j + ",");
				
				switch(i) {
					case 4: case 6: case 9: case 11:
						if(j == 30) break LOOP;
						break;
					case 2:
						if(j == 28) break LOOP;
						break;
				}
			}
			System.out.println();
		}
	}

}
