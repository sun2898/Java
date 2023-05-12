package day16.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx2 {

	public static void main(String[] args) {
		
		/*
		 * flush() - 중간까지 진행된 내용의 파일을 쓰고 싶을 때 사용한다.
		 */
		Scanner scan = new Scanner(System.in);
		
		String path = "C:\\Users\\sssoc\\Desktop\\course\\work\\file\\test2.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			System.out.print("> ");
			String word1 = scan.next();
			bw.write(word1);
			bw.flush(); // 버퍼에 있는 내용을 내보낸다.
			
			System.out.print("> ");
			String word2 = scan.next();
			bw.write(word2);
			
			System.out.print("텍스트 출력완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
