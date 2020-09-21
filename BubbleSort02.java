
public class BubbleSort02 {// 버블 정렬을 이용해 주어진 배열 정렬하기(내림차순)

	public static void main(String[] args) {

		int array[] = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };
		
		// 주어진 배열 출력
		System.out.print("주어진 배열: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", array[i]);
		}
		
		// 정렬하기
		int temp;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-1-i;j++) {
				if(array[j]<array[j+1]) {
					temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		// 새로 정렬된 배열 출력
		System.out.print("\n새로 정렬된 배열: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", array[i]);
		}
}

}
