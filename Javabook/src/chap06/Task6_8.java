package chap06;

public class Task6_8 {

	public static void main(String[] args) {
		int iNumVal = 1001034567;
		String sNumVal = String.valueOf(iNumVal);
		String sNumVoice = "";

		System.out.println("==> " + sNumVal + "[" + sNumVal.length() + "자리]");

		String[] units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		String[] unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };	//index가 4이면 만, 8이면 억

		int i, j;

		i = 0;
		j = sNumVal.length() - 1;	//자리수를 카운트 해줄 변수

		while (true) {
			if (i >= sNumVal.length()) break;	// iNumVal의 길이보다 커지면 반복문 탈출
			
			//각 자리를 하나씩 꺼내서 인덱스로 넣어주어 한글로 출력
			System.out.println(sNumVal.substring(i, i+1) + "[" + units[Integer.parseInt(sNumVal.substring(i, i+1))] + "]");	
			
			//한 자리씩 잘라서 숫자와 자리수를 붙여주기 위한 조건문
			if(sNumVal.substring(i , i+1).equals("0")) { //잘라낸 숫자가 0인지 검사하고
				if(unitX[j].equals("만") || unitX[j].equals("억")) { //만과 억의 자리가 0이면
					sNumVoice = sNumVoice + "" + unitX[j]; //숫자를 안 불러주기 때문에 units는 빼주기.	
				} 
			} else {	// 그 외에는 
				sNumVoice = sNumVoice	//기존의 sNumVoice에
						+ units[Integer.parseInt(sNumVal.substring(i, i+1))]	//떼어낸 숫자의 한글과
						+ unitX[j];												//떼어낸 자리의 한글을 붙여주기
			}
			i++;	//i를 1 증가하여 다음 숫자로 이동
			j--;	//j를 1 감소하여 다음 자리수로 이동

		}
		System.out.println("\n" + sNumVal + "[" + sNumVoice + "]");	//최종 출력
	}

}
