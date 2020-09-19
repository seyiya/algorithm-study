

public class QuickSort01 {	//퀵 정렬을 이용해 주어진 배열 정렬하기(오름차순)
	
	//퀵 정렬을 수행하는 함수
	public void quickSort(int[] array, int start, int end) {
		
		// start : 정렬을 수행하는 부분집합의 첫 수
		// end: 정렬을 수행하는 부분집합의 마지막 수
		
		if(start>=end) {//원소가 1개인 경우
			return;
		}
		
		//피벗값(기준값) 잡아주기
		int key = start; //키는 부분집합의 첫번째 원소로 설정
		int i = start +1; // 오른쪽으로 하나씩 이동하며 값을 찾음. (기준값을 빼고 해야하므로 1을 더한다)
		int j = end; //왼쪽으로 하나씩 이동하며 값을 찾음 
		int temp; //값을 바꾸기 위한 임시변수
		
		while(i<=j) {//엇갈릴 때까지 반복
			
			while(i<=end && array[i]<=array[key]) {// 키값보다 큰 값을 만날때까지 오른쪽으로 한칸씩 이동
				i++;
			}
			while(j>start && array[j]>=array[key]) {// 키값보다 작은 값을 만날때까지 왼쪽으로 한칸씩 이동
				j--;
			}
			if(i>j) {//현재 엇갈린 상태면 키 값과 교체
				temp = array[j];
				array[j]=array[key];
				array[key]=temp;
			} else {
				temp = array[j];
				array[j]=array[i];
				array[i]=temp;
			}
			
		}
		
		quickSort(array,start,j-1);
		quickSort(array,j+1,end);
		
	}

	public static void main(String[] args) {
		
		int i, j, temp;
		int array[] = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 }; // 원소의 갯수가 10개인 배열
		int number=10;
		
		// 주어진 배열 출력
		System.out.print("주어진 배열: ");
		for (i = 0; i < number; i++) {
			System.out.printf("%d ", array[i]);
		}

		// 퀵 정렬을 이용해 정렬
		// 소스상으로 깔끔하게 구현하기 위해 재귀 함수를 사용하는 경우가 많다. 
		QuickSort01 qsort = new QuickSort01();
		qsort.quickSort(array,0,number-1);
		
		for(i=0;i<number;i++) {
			System.out.printf("%d ",array[i]);
		}
		
		// 새로 정렬된 배열 출력
		System.out.print("\n새로 정렬된 배열: ");
		for (i = 0; i < number; i++) {
			System.out.printf("%d ", array[i]);
		}
	}

}

/*
 * 퀵 정렬의 시간복잡도
 * 

 * 
 * */