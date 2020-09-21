
public class SelectionSort02 {

	public static void main(String[] args) {// 선택 정렬을 이용해 주어진 배열 정렬하기(내림차순)

		int array[] = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };

		// 주어진 배열 출력
		System.out.print("주어진 배열: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", array[i]);
		}

		// 정렬하기
		int temp;
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			int max = 0;
			for (int j = i; j < array.length; j++) {
				if (max < array[j]) {
					max = array[j];
					index = j;
				}
			}
			temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}

		// 주어진 배열 출력
		System.out.print("\n정렬된 배열: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", array[i]);
		}

	}

}
