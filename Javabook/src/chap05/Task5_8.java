package chap05;

import java.sql.Time;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task5_8 {

	public static void main(String[] args) {
		int itemCount = 3;	//항목이 몇 개인지
		titlePrint();	//영수증 맨 위 타이틀 인쇄
		timeStamp();	//출려기간 인쇄
		headerPrint();	//헤더(상품명, 단가, 수량, 금액) 인쇄

		for (int i = 0; i < itemCount; i++) { //항목 갯수만큼 항목 인쇄
			itemPrint(i);
		}
		totalPrint(); //합계 세액 등을 인쇄
	}
	
	public static void titlePrint() {
		System.out.println("국민가게, 다이소");
		System.out.println("(주)아성다이소_분당서현저");
		System.out.println("전화:031-702-6016");
		System.out.println("본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.println("대표:박정부,신호섭 213-81-52063");
		System.out.println("매장:경기도 성남시 분당구 분다로53번길 11(서현동)");
		System.out.println("=============================================");
		System.out.println("소비자중심경영(CCM) 인증기업");
		System.out.println("ISO 9001 품질경영시스템 인증기업");
		System.out.println("=============================================");
		System.out.println("교환/환불 14일(3월12일)이내,");
		System.out.println("(전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.println("포장/가격 택 훼손시 교환/환불 불가");
		System.out.println("체크카드 취소 시 최대 7일 소요");
		System.out.println("=============================================");
	}

	public static void timeStamp() {
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
		System.out.println("[POS 1058231]      "+formatedNow);
		System.out.println("=============================================");
		
	}
	
	public static void headerPrint() {
		System.out.println("상품명                  \t\t단가  수량  금액");
		System.out.println("=============================================");
	}
	
	static int sum;
	public static void itemPrint(int i) {
		String[] item_name = { "퓨어에어 비말차단용마스크(최고급형)", "슬라이드식명찰(가로형)(100호)", "매직픕착 인테리어푸크(알루미늄타입)" };
		String[] item_code = { "1031615", "1008152", "1020800" };
		int[] item_price = { 3000, 1000, 1000 };
		int[] item_amount = { 1, 1, 1 };
		
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(item_name[i] + ((item_name[i].length() < 19)?"\t":" ") + "\t" + 
				df.format(item_price[i]) + " " + item_amount[i] + " " + df.format(item_price[i] * item_amount[i]));
		System.out.println("[" + item_code[i] + "]");
		
		sum += (item_price[i] * item_amount[i]);
	}
	public static void totalPrint() {
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("\t\t과세합계\t\t\t"+df.format(sum*0.9));
		System.out.println("\t\t보과세\t\t\t  "+df.format(sum*0.1));
		System.out.println("---------------------------------------------");
		System.out.println("판매합계                                  "+df.format(sum));
		
	}
}
