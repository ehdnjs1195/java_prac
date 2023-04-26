package chap12;

import java.io.File;
import java.io.FileWriter;

public class Example03 {

	public static void main(String[] args) {
		try {
			File file = new File("example03.txt");
			if(!file.exists()) //파일이 존재하지 않으면
				file.createNewFile(); //생성.
			FileWriter myWriter = new FileWriter(file);
			
			myWriter.write("Hello!!\n");
			myWriter.write("Java Programming\n");
			myWriter.close();
			System.out.println("파일 쓰기 성공");
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
