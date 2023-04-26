package com.section03;

public class Example06 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Programming"); 	//추가
		System.out.println(sb);
		sb.insert(6, "Java "); 		//6번째에 삽입
		System.out.println(sb);
		sb.replace(1, 4, "Good");	//1~4 교체
		System.out.println(sb);
		sb.delete(1, 5);			//1~5 삭제
		System.out.println(sb);
		sb.reverse();				//뒤집기
		System.out.println(sb);
	}

}
