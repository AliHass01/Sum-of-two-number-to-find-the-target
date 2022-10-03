import java.util.Arrays;

public class SearchTwoSum {
    public static void main(String[] args) {
        int [] array = {2,7,11,15};
        int target =9;

        System.out.println(Arrays.toString(sumTwo(array,target)));

    }

    public static int [] sumTwo(int[] arr, int target){

        for (int i =0; i<arr.length; i++){
            for (int j =i+1; i<arr.length; j++){
                if (arr[i]== target-arr[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
