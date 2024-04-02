package data_structure.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
	


public class String_1 {
	
//	public static Comparator<T> COMPARATOR = new Comp();
	
	    public static void removeElement1(String[] arr, String item) {
		

	    }
	    
	    static void getList(List<String> list) {
			list.add("서울");	list.add("북경");
			list.add("상해");	list.add("서울");
			list.add("도쿄");	list.add("뉴욕");


			list.add("런던");	list.add("로마");
			list.add("방콕");	list.add("북경");
			list.add("도쿄");	list.add("서울");

			list.add(1, "LA");
	    }
	    static void showList(String topic, List<String> list) {

	    }
	    static void sortList(List<String> list) {
	    	Collections.sort(null);
	    	 //방법1
	    	list.sort(null);
	    	//방법 2 리스트를 스트링 배열로 전환
 	    }
	    
	    static String[] removeDuplicateList(List<String> list) {
		    String cities[] = new String[0];
		    cities = list.toArray(cities);
		    //list를 배열 cities[]로 변환
		    //for문으로 도시가 중복인 것을 체크 = compareTo를 사용해서 중복 제거
		    removeElement1(cities, city);
		    
		    return cities;
	    }
		public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<>();
			getList(list);
			showList("입력후", list);
			//sort - 오름차순으로 정렬, 내림차순으로 정렬, 중복 제거하는 코딩

//		    Collections.sort(list);

//배열의 정렬
			sortList(list);
		    System.out.println();
		    showList("정렬후", list);
// 배열에서 중복제거
		    System.out.println();
		    System.out.println("중복제거::");
		  
		    String[] cities = removeDuplicateList(list);
	        ArrayList<String> lst = new ArrayList<>(Arrays.asList(cities));
		    showList("중복제거후", lst);
		}
	}



