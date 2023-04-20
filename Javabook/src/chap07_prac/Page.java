package chap07_prac;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Page {
	LocalDateTime now = LocalDateTime.now();
	String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
	
	//각 페이지의 머리부분 출력
	void printHead(int i) {
		System.out.println("\t\t성적집계표");
		System.out.println("PAGE: " + (i + 1) + "\t\t\t\t출력일자: " + formatedNow);
		System.out.println("============================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("============================================================");
	}

	//현제페이지 출력단
	void printCurrSummary(int AllSum[], int currSum[], int AllAvg[], int currAvg[], int end) {
		System.out.println("============================================================");
		System.out.println("현재페이지");
		System.out.print("합계\t\t");
		for(int j = 0; j < 5; j++) {
			System.out.print(currSum[j]+"\t");
			AllSum[j] += currSum[j];	//누적 합계
			AllAvg[j] = AllSum[j] / end;//누적 평균
		}
		System.out.println();
		System.out.print("평균\t\t");
		for(int j = 0; j < 5; j++)
			System.out.print(currAvg[j]+"\t");
		System.out.println();
	}
	
	//누적페이지 출력단
	void printAllSummary(int AllSum[], int AllAvg[]) {
		System.out.println("============================================================");
		System.out.println("누적페이지");	
		System.out.print("합계\t\t");
		for(int j = 0; j < 5; j++) 
			System.out.print(AllSum[j]+"\t");
		System.out.println();
		System.out.print("평균\t\t");
		for(int j = 0; j < 5; j++)
			System.out.print(AllAvg[j]+"\t");
		System.out.println();
		System.out.println();
	}
}
