package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class FastInsert {

	public static void main(String[] args) {
		
		/*
		 * InputStreamReader는
		 * 1바이트 데이터를 2바이트 기반으로 변경해준다.
		 * 
		 */
		
//		Reader rd = new InputStreamReader(System.in);
//		BufferedReader bw = new BufferedReader(rd);
		
		try {
			BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("> ");
			String name = bw.readLine();
			
			System.out.println(name); //입력받은 결과

			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
