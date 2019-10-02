public class RechercheDichotomiqueIterative {

	public static void main(String[] args) {

		int tableau[] = { 4, 6, 12, 54, 57, 67, 89, 111, 123, 201, 202, 234 };
		System.out.println(rechercheDichotomique(23, tableau));
	}

	public static int rechercheDichotomique(int search, int[] array) {

		int start = 0;
		int end = array.length - 1;

		while (start <= end) {

			int middle = (start + end) / 2;

			if (search < array[middle]) {
				end = middle - 1;
			}

			if (search > array[middle]) {
				start = middle + 1;
			}

			if (search == array[middle]) {
				return middle;
			}
		}
		return -1;

	}
}
