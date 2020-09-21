
public class InsertionSort02 {// 삽입 정렬을 이용해 주어진 배열 정렬하기(내림차순)

	public static void main(String[] args) {

		int array[] = {11,1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };

		// 주어진 배열 출력
		System.out.print("주어진 배열: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}

		// 정렬하기
		int temp, j;
		for (int i = 0; i < array.length - 1; i++) {
			j = i;
			while (j>=0 && array[j] < array[j + 1]) {
				temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
				j--;
			}
		}

		// 새로 정렬된 배열 출력
		System.out.print("\n새로 정렬된 배열: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}

	}

}
