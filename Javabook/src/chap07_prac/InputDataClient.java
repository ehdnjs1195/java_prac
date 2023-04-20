package chap07_prac;

public class InputDataClient {

	public static void main(String[] args) {
		int person = 30;	//인원수를 정하여 초기화.
		
		InputData inData = new InputData(person);	//인원수를 넘겨주면서 객체를 생성함
		
		for(int i = 0; i < person; i++) {	//인원수만큼 반복문을 돌면서 
			String name = "홍길" + i;
			//점수를 랜덤으로 생성
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			inData.setData(i, name , kor, eng, mat);	//데이터를 넣어주면서 저장함.
		}
		
		for(int i = 0; i < person; i++) {	//반복하면서 출력
			System.out.println("번호: " + i + " 이름: " + inData.name[i] + " 국어: "+inData.kor[i] + 
					" 영어: " + inData.eng[i] + " 수학: "+inData.mat[i] + " 총점: " + inData.sum[i]+" 평균: " +inData.avg[i]);
		}
	}

}
