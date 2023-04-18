package chap06;

import java.util.Scanner;

public class Task6_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input[] = new int[6];
		int lotto[] = makeLotto();
		int win = 0;

		System.out.println("로또 번호를 입력하세요");
		boolean checkInput = true;
		do {
			for (int i = 0; i < input.length; i++) {
				input[i] = s.nextInt();
			}
			checkInput = isOverlap(input);	//입력값이 중복되면 true가 되도록 하여 다시 반복.
			if(checkInput) System.out.println("중복 값을 입력할 수 없습니다. 다시 입력해주세요.");
		} while (checkInput);
		
		System.out.print("로또 당첨 번호: ");
		for (int i = 0; i < lotto.length; i++)
			System.out.print(lotto[i] + " ");

		win = checkLotto(input, lotto);
		System.out.println("\n추첨 결과: " + ((win != 0)? win +"등입니다." : "꽝 입니다."));
		
	}
	//로또번호 생성하는 메서드
	public static int[] makeLotto() {
		int lotto[] = new int[7];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
		}
		if(isOverlap(lotto)) makeLotto();
		return lotto;
	}
	//입력받은 배열에 겹치는 숫자가 있는지 검사하는 메서드
	public static boolean isOverlap(int num[]) { //겹치는 게 있으면 true 반환.
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if(num[i] == num[j]) return true;
			}
		}
		return false;
	}
	//Lotto번호와 입력한 번호가 일치하는 지 검사하는 메서드
	public static int checkLotto(int input[], int lotto[]) {
		int cnt = 0;
		int bonus = 0;
		int win = 0;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if(lotto[i] == input[j]) {
					cnt ++;
					if(i == 6) bonus = 1;	//lotto의 7번째 번호가 맞으면 bonus 번호 맞춤.
				}
			}
		}
		if(cnt == 3) win = 5;
		else if (cnt == 4) win = 4;
		else if (cnt == 5) win = 3;
		else if (cnt == 6 && bonus == 1) win = 2;
		else if (cnt == 6) win = 1;
		
		return win;
	}
}
