package com.section03;

import java.util.StringTokenizer;

public class Example11 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Java, C, Python, JSP, PHP", ",");
		//쉼표를 기준으로 토큰을 나눔
		while(st.hasMoreTokens()) {	//다음 토큰이 잇는지 검사 있으면 true
			System.out.println(st.nextToken());	//다음 토큰을 뽑아냄
		}
	}

}
