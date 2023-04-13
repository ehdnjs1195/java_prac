package chap04_prac;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Prac08 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now);
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss"));
//		System.out.println(formatedNow);
		String s;
		
		DecimalFormat df = new DecimalFormat("###,###");
		int price = 180000;
		 
		System.out.printf("%17s\n", "매출전표(카드회사용)");
		System.out.printf("%s%20s\n", "맛꼬방치킨", "안도원");
		System.out.printf("%s%16s\n", "124-25-54620", "063-632-6614");
		System.out.printf("전북 남원시 농고길 11 (도봉동)\n");
		System.out.println();
		System.out.printf("%s%19s\n", "하나기업카드", "신용승인(1)");
		System.out.println("거래일시:" + formatedNow);
		System.out.printf("%s%8s\n", "4336-9200-****-982*", "일시불");
		System.out.printf("가맹점No 00921293692\n");
		System.out.println("매입사 하나카드(디우데이타)");
		System.out.println("승인번호 40860059");
		System.out.println("-----------------------------");
		System.out.printf("%s%20s%s\n", "판매금액: ",  df.format((int) (0.9 * price)), "원");
		System.out.printf("%s%19s%s\n", "부 가 세: ", df.format((int) (0.1 * price)), "원");
		System.out.printf("%s%20s%s\n", "합   계: ", df.format(price), "원");
		System.out.println("-----------------------------");

	}

}

