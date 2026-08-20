// two sum

public class array5 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 33, 98, 12, 45, 67, 89, 100};
        int target = 100;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println("The two elements are: " + arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}