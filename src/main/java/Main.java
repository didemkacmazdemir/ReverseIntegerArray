import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        reverseArray(arr);
    }
    public static void reverseArray(int[] arr){
        int lengthOfArr = arr.length;
        if (lengthOfArr <= 0){
            return;
        }
        System.out.println("Before ");
        printArr(arr);
        System.out.println(" ");
        int indexesToBeReplaced = lengthOfArr/2; // rounds down
        int temp = 0;
        for(int i = 0; i< indexesToBeReplaced; ++i){
            temp = arr[i]; // get first element of array and empty first index
            arr[i] = arr[lengthOfArr-1-i]; //replace first element with last element, empty last index
            arr[lengthOfArr-1-i] = temp; // replace last element with first element
        }
        System.out.println("After ");
        printArr(arr);
    }
    private static void printArr(int[] arr){
        Arrays.stream(arr).forEach(System.out::print);
    }
}
