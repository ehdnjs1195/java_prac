package chap07;

public class MemberChain {
	String firstName;
	String country;
	int age;

	public MemberChain() {	
		this("홍길순");
	}

	public MemberChain(String mName) {
		this(mName, 20);
	}

	public MemberChain(String mName, int mAge) {
		this(mName, mAge, "대한민국");
	}

	public MemberChain(String mName, int mAge, String county) {
		System.out.println("이름: " + mName + " 나이: " + mAge + " 나라: " + county);
	}
}
