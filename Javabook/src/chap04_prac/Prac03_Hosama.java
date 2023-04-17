package chap04_prac;

public class Prac03_Hosama {
	public static void main(String[] args) {
		int i,j;
		
		for(i = 1; i <= 9; i ++) {
			System.out.print("**************");
			if(i % 3 == 0) {
				System.out.println("");
				System.out.print("구구단 "+ (i-2) +"단");
				System.out.print("        ");
				System.out.print("구구단 "+ (i-1) +"단");
				System.out.print("        ");
				System.out.print("구구단 "+ (i) +"단");
				System.out.println("");
				System.out.println("******************************************");
				
				for(j = 1; j <= 9; j ++) {
					System.out.print((i-2)+" * "+j+" = "+((i-2)*j));
					System.out.print("\t");
					System.out.print((i-1)+" * "+j+" = "+((i-1)*j));
					System.out.print("\t");
					System.out.print((i)+" * "+j+" = "+(i*j));
					System.out.println("");
				}
				System.out.println("");
			}
		}
	}
}
