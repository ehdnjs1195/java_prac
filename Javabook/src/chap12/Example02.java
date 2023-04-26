package chap12;

import java.io.File;
import java.io.FileOutputStream;

public class Example02 {

	public static void main(String[] args) {
		String str = "Hello! Java Programming";
		try {
			File file = new File("example02.txt");
			if(!file.exists())
				file.createNewFile();
			
			FileOutputStream fos = new FileOutputStream(file);
			
			byte[] b = str.getBytes();	//str을 byte화 하기
			fos.write(b);	//fos를 통해 byte[]을 통해 쓰기
			fos.close();	//메모리를 아끼기위해서 닫아주기.
			System.out.println("파일쓰기 성공");
		} catch(Exception e) {
			e.getMessage();
		}
	}

}
