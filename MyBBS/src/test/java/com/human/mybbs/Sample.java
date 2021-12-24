package com.human.mybbs;

import java.util.HashMap;

public class Sample {

	public static void main(String[] args) {
		/**
		 * Map
		 * 1. 	키와 값을 하나의 쌍으로 저장하는 방식 key - value 구성(인덱스가 없습니다.)
		 * 2. 	배열을 사용하지 않습니다.
		 * 3.	key는 중복이 불가능. 예를들어 영어단어를 key 로 설계, 한글을 value 설계한다면
		 * 		같은 영어단어를 중복되어 입력이 불가 합니다.
		 * 		그러나 리스트는 객체로 영어와 한글을 만들고 인덱스를 중심으로 입력하기 때문에
		 * 		중복된 영어단어 입력이 가능하다.
		 * 4.	요소의 순서가 없이 저장 됩니다. 키는 중복이 불가능하지만,요소는 중복이 가능 합니다.
		 * 		왜냐면 키를 중심으로 저장하기 때문입니다.
		 * 5.	hash map 의 특징
		 * 		해시알고리즘을 사용하기 때문에 검색속도가 매우 빠르다는 특징을 가지고 있습니다.
		 * 		검색에 중점을 두고서 사전을 만든다면 list보다는 map이 더 좋습니다.
		 *  
		 */
		HashMap<String, Integer> h = new HashMap<String, Integer>();//<key,value>
		h.put("사과", 100);
		h.put("바나나", 200);
		
		//확장된 반복문
		for(String key : h.keySet()) {
			System.out.println(key+"/"+h.get(key));
		}
	}

}
