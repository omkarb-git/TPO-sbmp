public class array3 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30 ,40 }; 
        
        for(int i = 0; i < arr.length; i++) { // it will iterate through the elements of the array through index
            System.out.print(arr[i] + " "); 
        }
        System.out.println();

        for(int x: arr) {    // it will iterate through the elements of the array through element.
            System.out.print(x + " ");
        }
    }
}