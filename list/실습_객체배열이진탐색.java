package data_structure.list;

import java.awt.RenderingHints.Key;
import java.util.Arrays;
import java.util.Comparator;

abstract class PhyscData2 implements Comparable<PhyscData2>{
	String name;
	int height;
	double vision;
}

class comp implements Comparator<PhyscData2>{ 
	// 컴페러터는 따른 메스드를 건들지 않는다. 메서드는 해당 추상메서드를 구현하면 된다
	public int compare(PhyscData2 p1, PhyscData2 p2) { // 추상 메서드
		if (p1.name.compareTo(p2.name) > 0) return 1;
		else if (p1.name.compareTo(p2.name)<0) return -1;
		else {
			return 0;
		}
}

	@Override
	public String toString() {
		return null;
		
	}
	public int compareTo(PhyscData2 p) { //클래스의 내부메서드 임으로
		if (vision > p.vision)
			return 1;
		else if (vision < p.vision)
			return -1;
		
			
		
	}
	public int equals(PhyscData2 p) {
		return 0;
		
	}

	
}

public class 실습_객체배열이진탐색 {
	static void sortData(PhyscData2[] arr, F) {
		// 확장형 for문으로 인덱스가 없어서 swap() 처리 안됨
		for (int i = 0; i < arr.length; i++) {
			for(int j = i +1; j <arr.length; j++) {
				if (arr[i].compareTo(arr[j])>0) {
					swap(arr, i ,j);
				}
			}
		}
	}
	
	private static void swap(PhyscData2[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		PhyscData2[] data = {
				new PhyscData2("홍길동", 162, 0.3),
				new PhyscData2("나동", 164, 1.3),
				new PhyscData2("최길", 152, 0.7),
				new PhyscData2("김홍길동", 172, 0.3),
				new PhyscData2("박동", 182, 0.6),
				new PhyscData2("이동", 167, 0.2),
				new PhyscData2("길동", 167, 0.5),
		};
		if(data[0].compareTo(data[1])> 0)
			System.out.println();
		Arrays.binarySearch(data, Key, new Comp());
		showData("정렬전", data);
		sortData(data);
		showData("정렬후", data);
		reverse(data);
		showData("역순 재배치후", data);
		Arrays.sort(data);//사용된다 그 이유는?
		showData("Arrays.sort() 정렬후", data);
		
		PhyscData2 key = new PhyscData2("길동", 167, 0.2);
		int resultIndex = linearSearch(data, key);
		System.out.println("\nlinearSearch(<길동,167,02>): result = " + resultIndex);
		
		key = new PhyscData2("박동", 182, 0.6);
		/*
		 * 교재 109~113
		 */
		resultIndex = binarySearch(data, key);//comparable를 사용
		System.out.println("\nbinarySearch(<박동,182,0.6>): result = " + resultIndex);
		key = new PhyscData2("이동", 167, 0.6);
		/*
		 * 교재 115 Arrays.binarySearch에 의한 검색
		 */
		resultIndex = Arrays.binarySearch(data, key);//comparable를 사용
		System.out.println("\nArrays.binarySearch(<이동,167,0.6>): result = " + resultIndex);
	}
	
}

