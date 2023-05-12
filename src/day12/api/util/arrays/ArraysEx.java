package day12.api.util.arrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		
		int[] arr = {3, 1, 2, 5, 8, 6, 11};
		
		//정렬기능
		Arrays.sort(arr); //[1, 2, 3, 5, 6, 7]
	
		
		//배열을 문자열로
		System.out.println(Arrays.toString(arr));
		
		//탐색 - binarySearch를 사용하기 위해서는 정렬이 되어 있어야 한다.
		int result = Arrays.binarySearch(arr, 12); // 배열명, 찾을값
		System.out.println(result); //음수가 나오면 배열에 없는 값이라는 뜻
		
//		int result2 = Arrays.binarySearch(arr, 3);
//		System.out.println(result2); // 3이 존재하는 배열의 인덱스 값 : 2
//		
//		
//		//배열복사 - copyOf(복사할 배열의 이름, 새로운 배열의 길이)
//		int[] newArr = Arrays.copyOf(arr, arr.length);
//		System.out.println(Arrays.toString(newArr));
//		System.out.println(arr==newArr);
//		
//		int[] newArr2 = Arrays.copyOf(arr, arr.length * 2);
//		System.out.println(Arrays.toString(newArr2));
//		
//		//배열크기지정 복사 - copyOfRange(원본배열, 시작인덱스(이상), 끝인덱스(미만))
//		int[] newArr3 = Arrays.copyOfRange(newArr, 1, 3);
//		System.out.println(Arrays.toString(newArr3)); // [2, 3]
//		
//		//배열의 원소비교 - 주소값의 비교가 아닌 요소들의 값과 순서가 같은지 판별
//		if(Arrays.equals(arr, newArr)) {
//			System.out.println("원소값이 일치함");
//		}
		
		
		
	}
}
