public class RechercheDichotomiqueRecursive {
	
	public static void main(String[] args) {

		int tableau[] = { 4, 6, 12, 54, 57, 67, 89, 111, 123, 201, 202, 234 };
		System.out.println(rechercheDichotomique(111, tableau, 0, tableau.length - 1));
	}
	
	public static int rechercheDichotomique(int search, int[] array, int start, int end){
		
		int middle = (start + end)/2;
		
		if(end < start){
			 return -1;
		} 
		
		
		if (search < array[middle]){
			return rechercheDichotomique(search, array, start, middle - 1);
		}
		
		if (search > array[middle]){
			return rechercheDichotomique(search, array, middle + 1, end);
		}
		
		if (search == array[middle]){
			return middle;
		}
		
		return -1;
}
}
