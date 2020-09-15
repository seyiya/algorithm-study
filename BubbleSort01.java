package algorithm_study;

public class BubbleSort01 { // 버블 정렬을 이용해 주어진 배열 정렬하기(오름차순)

	public static void main(String[] args) {

		int i, j, temp;

		int array[] = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 }; // 원소의 갯수가 10개인 배열

		// 주어진 배열 출력
		System.out.print("주어진 배열: ");
		for (i = 0; i < 10; i++) {
			System.out.printf("%d ", array[i]);
		}

		// 버블정렬을 이용해 정렬
		for (i = 0; i < 10; i++) { // 전체 원소의 갯수만큼 반복하기
			for (j = 0; j < 9 - i; j++) { // 이미 정렬된 값을 제외하기 위해 9-i까지 반복한다.
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		// 새로 정렬된 배열 출력
		System.out.print("\n새로 정렬된 배열: ");
		for (i = 0; i < 10; i++) {
			System.out.printf("%d ", array[i]);
		}

	}

}

/*
 * 버블 정렬의 시간복잡도
 * 
 * 10개의 원소를 가진 배열을 정렬하려면 다음과 같은 횟수의 계산이 필요하다. 
 * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 
 * 이러한 등차 수열을 계산하는 공식은 다음과 같다. => N*(N+1)/2 10*(10+1)/2=55 
 * 따라서 원소의 갯수가 10개인 배열은 총 55번의 연산을 수행하게 된다.
 * 
 * 따라서 버블정렬의 복잡도는 O(N^2)와 같다.
 * 
 * 복잡도는 선택정렬과 동일하지만, 
 * 버블 정렬의 경우 계속해서 자리를 바꾸는 연산(스왑)을 수행하기에, 
 * 비교후 마지막에만 자리를 바꾸는 선택
 * 정렬보다 수행시간이 더 오래걸린다.
 * 
 */
