public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        int[] result = new int[2];
        boolean found = false;
        
        for(int i = 0; i < list.length; i ++ ) {
            result[0] = i;
        	int toFind = sum - list[i];
            for(int k = 0; k < list.length; k++) {
                if(list[k] == toFind) {
                    result[1] = k;
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        return found ? result : null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 14);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
        	System.out.println("Indices array is null");
        }
    }
}
