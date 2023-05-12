package day12.api.lang.sb;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		//StringBuilder - 단일 쓰레드 환경에서 사용
		//StringBuffer - 멀티 쓰레드 환경에서 사용
		
		String str = new String("Java ");
		StringBuilder sb = new StringBuilder("Java ");
		
		System.out.println(str + "program"); 
		System.out.println(sb.append("program")); 
		
		System.out.println(str); // 원본 문자열은 변경되지않음 
		System.out.println(sb);  // 원본 문자열이 변경 됨
		
		//builder의 메서드
		//append() - 문자열 끝에 추가 (붙일 수 있는 타입은 다양함)
		sb.append("ming");
		System.out.println(sb); //Java programming
		
		//insert() - 문자열 중간에 추가
		sb.insert(5, "study ");
		System.out.println(sb); //Java study programming
		
		//replace() - 문자열 변경(이상, 미만)
		sb.replace(5, 10, "book");
		System.out.println(sb); // Java book programming
		
		//delete() - 문자열 삭제(이상, 미만)
		sb.delete(5, 10);
		System.out.println(sb); //Java programming
		
		//deleteCharAt()
		sb.deleteCharAt(0);
		System.out.println(sb); //ava programming
		
		//reverse() - 문자열 거꾸로 출력
		sb.reverse();
		System.out.println(sb); //gnimmargorp ava
		
		//문자열로 형변환 (StringBuilder와 String 타입은 다르므로 변환을 해주어야한다.)
		String result = sb.toString();
		System.out.println(result);
		
	}
}
