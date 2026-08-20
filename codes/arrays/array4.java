
// //max  element in an array

// public class array4 {

//     public static void main(String[] args) {
//     int arr[] = {10, 20, 30 ,40, 33, 98, 12, 45, 67, 89, 100};

//     int m = arr[0];

//     for (int i = 0; i < arr.length; i++) {
//         if (arr[i] > m) {
//             m = arr[i];
//         }
//     }

//     System.out.println("The largest element in the array is: " + m);
// }
// }



// 2nd largest element in an array
public class array4 {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 33, 98, 12, 45, 67, 89, 100};
        int l = Integer.MIN_VALUE; // random minimum value, can be negative or positive, but it should be less than the minimum value in the array
        int sl = Integer.MIN_VALUE; // random minimum value, can be negative or positive, but it should be less than the minimum value in the array

        for(int i: arr) {
            if(i > l) {
                sl = l;
                l = i;
            } else if(i > sl && i != l) {
                sl = i;
            }
        }
        System.out.println("The second largest element in the array is: " + sl);
    }
}