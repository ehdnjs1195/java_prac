package chap07_prac;

import java.text.DecimalFormat;

public class InputDataClient02 {

	public static void main(String[] args) {
		int person = 200; // 인원수를 정하여 초기화.

		InputData inData = new InputData(person); // 인원수를 넘겨주면서 객체를 생성함
		Page p = new Page(); //페이지 출력을 담당할 클래스
		
		DecimalFormat df = new DecimalFormat("000");

		// 인원수에 맞게 임의값 데이터 입력
		for (int i = 0; i < person; i++) { // 인원수만큼 반복문을 돌면서
			String name = "홍길" + df.format(i + 1);
			// 점수를 랜덤으로 생성
			int kor = (int) (Math.random() * 100);
			int eng = (int) (Math.random() * 100);
			int mat = (int) (Math.random() * 100);
			inData.setData(i, name, kor, eng, mat); // 데이터를 넣어주면서 저장함.
		}
		
		int AllSum[] = new int[5];
		int AllAvg[] = new int[5];
		
		// 출력부분.
		for (int i = 0; i <= person / inData.pagePerPerson; i++) { // 30명당 한 페이지
			p.printHead(i);
			
			int currSum[] = new int[5];
			int currAvg[] = new int[5];
			int start = inData.getStartPage(i);	//출력할 페이지의 첫번째 순서
			int end = inData.getEndPage(i);		//출력할 페이지의 마지막 순서
			for (int j = start; j < end; j++) { // 반복하면서 출력
				System.out.println(df.format(j + 1) + "\t" + inData.name[j] + "\t" + inData.kor[j] + "\t"
						+ inData.eng[j] + "\t" + inData.mat[j] + "\t" + inData.sum[j] + "\t" + inData.avg[j]);
				currSum[0] += inData.kor[j]; 			//현재페이지 합계
				currSum[1] += inData.eng[j];
				currSum[2] += inData.mat[j];
				currSum[3] += inData.sum[j];
				currSum[4] += inData.avg[j];
				currAvg[0] = currSum[0] / (end - start);//현제페이지 평균
				currAvg[1] = currSum[1] / (end - start);
				currAvg[2] = currSum[2] / (end - start);
				currAvg[3] = currSum[3] / (end - start);
				currAvg[4] = currSum[4] / (end - start);
			}
			
			//현제페이지 출력단
			p.printCurrSummary(AllSum, currSum, AllAvg, currAvg, end);
			
			//누적페이지 출력단
			p.printAllSummary(AllSum, AllAvg);
		}
	}
}
