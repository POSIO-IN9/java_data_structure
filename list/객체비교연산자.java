package data_structure.list;

import java.util.Arrays;
import java.util.Comparator;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData3 {
	public PhyscData3(String string, int i, double d) {
		// TODO Auto-generated constructor stub
	}
	String name;
	int height;
	double vision;

}
class CompHeight implements Comparator<PhyscData3>{

	@Override
	public int compare(PhyscData3 o1, PhyscData3 o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
 	public class 객체비교연산자 { // 클래스를 빼내 객체를 만들어 쓰는 연습
	static final Comparator<PhyscData3> HEIGHT_ORDER = new CompName();

	public static void main(String[] args) {
		PhyscData3[] data = {
				new PhyscData3("홍길동", 162, 0.3),
				new PhyscData3("홍동", 164, 1.3),
				new PhyscData3("홍길", 152, 0.7),
				new PhyscData3("김홍길동", 172, 0.3),
				new PhyscData3("길동", 182, 0.6),
				new PhyscData3("길동", 167, 0.2),
				new PhyscData3("길동", 167, 0.5),
		};
		Arrays.binarySearch(data, key, new CompHeight());
		showData("정렬전 객체 배열", data);
		Arrays.sort(data, HEIGHT_ORDER);
		
		showData("정렬후 객체 배열", data);
		PhyscData3 key = new PhyscData3("길동", 167, 0.2);
		Arrays.binarySearch(data, key, new CompHeight());
		int idx = Arrays.binarySearch(data, key, HEIGHT_ORDER); //객체를 던저주는 형태
		System.out.println("\nArrays.binarySearch(): result = " + idx);
	}

	private static void showData(String string, PhyscData3[] data) {
		// TODO Auto-generated method stub
		
	}

}
