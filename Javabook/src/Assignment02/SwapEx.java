package Assignment02;

public class SwapEx {

	public static void main(String[] args) {
		int x = 10, y = 20, tmp = 0;
		
		System.out.println("x와 y의 값을 확인합니다.");
		System.out.println("x값: "+x);
		System.out.println("y값: "+y+"\n");
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x와 y값을 변경합니다.");
		System.out.println("x값: "+x);
		System.out.println("y값: "+y);

	}

}
