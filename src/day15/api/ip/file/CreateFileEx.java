package day15.api.ip.file;

import java.io.File;

public class CreateFileEx {
	
	public static void main(String[] args) {
		
		/*
		 * File클래스
		 * 외부경로에 폴더,단순한 파일을 생성 혹은 삭제할 수 있다.
		 */
		
		
		String path = "C:\\Users\\sssoc\\Desktop\\course\\work\\file\\20230504";
		
		try {

			File file = new File(path);
			//생성
			if(!file.exists()) {

				file.mkdir(); //makedirectory
				System.out.println("폴더생성완료");
			} else {
				System.out.println("이미 폴더가 존재합니다.");
			}
			
			 if(file.exists()==true) {
				 file.delete();
				 System.out.println("폴더가 삭제되었습니다.");
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
