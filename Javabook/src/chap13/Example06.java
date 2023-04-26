package chap13;

import java.util.HashMap;
import java.util.Iterator;

public class Example06 {

	public static void main(String[] args) {
		HashMap<Integer, String> cats = new HashMap<>();
		cats.put(1, "페르시안");
		cats.put(2, "샴");
		System.out.println(cats);
		cats.put(3, "러시안블루");
		System.out.println(cats);
		cats.put(3, "래그돌");	//기존의 3번째 자리의 value가 변함
		System.out.println(cats);
		cats.remove(1);
		System.out.println(cats);
		System.out.println(cats.size());
		System.out.println(cats.get(2));
		System.out.print("(Key, Value)=");
		
		Iterator<Integer> keys = cats.keySet().iterator();	//반복해서 돌려서 그 내용을 keys에 넣어줌.
		
		while(keys.hasNext()) {	//값이 있으면 뽑아내도록 while문.
			int key = keys.next();
			System.out.print(" (" + key + ", " + cats.get(key) + ") ");
		}
	}

}
