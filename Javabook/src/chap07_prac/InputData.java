package chap07_prac;

public class InputData { // 데이터를 넣어주는 클래스
	int person; // 인원수
	String name[];// 이름
	int kor[];// 국어점수
	int eng[];// 영어점수
	int mat[];// 수학점수
	int sum[];// 합계
	double avg[];// 평균
	int pagePerPerson = 30; // 페이지당 사람 수
	int startPage;
	int endPage;

	InputData(int person) { // 인원수를 받아서 배열 초기화
		this.person = person;
		name = new String[person];
		kor = new int[person];
		eng = new int[person];
		mat = new int[person];
		sum = new int[person];
		avg = new double[person];
	}

	void setData(int i, String name, int kor, int eng, int mat) { // 데이터를 입력받아서 각 배열에 담아주기.
		this.name[i] = name;
		this.kor[i] = kor;
		this.eng[i] = eng;
		this.mat[i] = mat;
		this.sum[i] = kor + eng + mat;
		this.avg[i] = (kor + eng + mat) / 3;
	}

	//페이지 첫 번호 가져오기
	int getStartPage(int i) {
		return i * pagePerPerson;
	}

	//페이지 마지막 번호 가져오기
	int getEndPage(int i) {
		endPage = (i + 1) * pagePerPerson;
		if (person / pagePerPerson == i) {
			endPage = person % pagePerPerson + i * pagePerPerson;
		}
		return endPage;
	}

}
