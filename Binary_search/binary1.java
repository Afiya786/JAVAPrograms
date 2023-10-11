package Binary_search;

public class binary1 {
    public static void main(String[] args){
        int[] arr = {-4, -5, 1, 5,6,7,8,9};
        int target = 5;
        System.out.println(binary_search(arr, target));

    }

    static int binary_search(int[] arr, int target){
        int start =0;
        int end = arr.length -1;

        while(start <= end) {
            // int mid =(start + end) /2 this might be wrong as when you take long values it will result in errors

            int mid = start + (end - start) /2 ;

            if(target < arr[mid]){
                end = mid -1;
            } else if( target > arr[mid]){
                start = mid +1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
