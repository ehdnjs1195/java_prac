package chap06;

public class Task6_9 {

	public static void main(String[] args) {
		String str = "Ko2re4a0Po4ly4te2chn9ic3";
		char[] ch = new char[str.length()];
		String result = "";
		
		ch = str.toCharArray();	//str문자열을 배열로 저장.
		for(int i = 0; i < ch.length; i++) { //ch길이만큼 반복하면서
			//영어 소문자이거나 대문자이면 result에 더해지도록
			if((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122)) 
				result += ch[i];
		}
		
		System.out.println("result: " + result);
	}

}
