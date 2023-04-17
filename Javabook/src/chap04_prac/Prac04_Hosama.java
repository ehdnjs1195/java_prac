package chap04_prac;

public class Prac04_Hosama {
	public static void main(String[] args) {
		int i,j;
		
		for(i = 1; i <= 9; i ++) {
			System.out.print("**********\t");
			if(i % 3 == 0) {
				System.out.println("");
				System.out.print("구구단 "+ (i/3) +"단");
				System.out.print("        ");
				System.out.print("구구단 "+ (i/3+3) +"단");
				System.out.print("        ");
				System.out.print("구구단 "+ (i/3+6) +"단");
				System.out.println("");
				System.out.println("**********\t**********\t**********\t");
				
				for(j = 1; j <= 9; j ++) {
					System.out.print((i/3)+" * "+j+" = "+((i/3)*j));
					System.out.print("\t");
					System.out.print((i/3+3)+" * "+j+" = "+((i/3+3)*j));
					System.out.print("\t");
					System.out.print((i/3+6)+" * "+j+" = "+((i/3+6)*j));
					System.out.println("");
				}
				System.out.println("");
			}
		}
	}
}
