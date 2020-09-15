package algorithm_study;

public class SelectionSort01 { // 선택 정렬을 이용해 주어진 배열 정렬하기(오름차순)

	public static void main(String[] args) {

		int i, j; // 반복 탐색을 위한 변수
		int min, index = 0; // 최솟값을 위한 변수와 그 위치
		int temp; // 스왑을 위한 변수

		int array[] = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 }; // 원소의 갯수가 10개인 배열

		// 주어진 배열 출력
		System.out.print("주어진 배열: ");
		for (i = 0; i < 10; i++) {
			System.out.printf("%d ", array[i]);
		}

		// 선택정렬을 이용해 정렬
		for (i = 0; i < 10; i++) {
			min = 9999; // (원소들보다) 큰 값을 넣어준다.
			for (j = i; j < 10; j++) {
				if (min > array[j]) {
					min = array[j];
					index = j;
				}
			}
			// 스와핑하기
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}

		// 새로 정렬된 배열 출력
		System.out.print("\n새로 정렬된 배열: ");
		for (i = 0; i < 10; i++) {
			System.out.printf("%d ", array[i]);
		}

	}

}

/*
 * 선택 정렬의 시간복잡도
 * 
 * 10개의 원소를 가진 배열을 정렬하려면 다음과 같은 횟수의 계산이 필요하다. 
 * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1
 * 이러한 등차 수열을 계산하는 공식은 다음과 같다. => N*(N+1)/2
 * 10*(10+1)/2=55
 * 따라서 원소의 갯수가 10개인 배열은 총 55번의 연산을 수행하게 된다. 
 * 
 * 따라서 선택정렬의 복잡도는 O(N^2)와 같다. 
 * 
 * */
