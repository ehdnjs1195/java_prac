package chap04_prac;

public class Prac03 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("*****************************************");
			System.out.println("구구단 "+(3*i+1)+"단 \t" + "구구단 "+(3*i+2)+"단 \t"+ "구구단 "+(3*i+3)+"단");
			System.out.println("*****************************************");
			for(int j=1; j<10; j++) {
				System.out.println((3*i+1)+" * "+j+" = "+(3*i+1)*j+"\t" +(3*i+2)+" * "+j+ " = "+(3*i+2)*j+"\t"+(3*i+3)+" * "+j+" = "+(3*i+3)*j);
			}
			
			
		}
	}

}
