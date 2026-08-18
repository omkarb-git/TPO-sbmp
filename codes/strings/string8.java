//reverse

// class string8{
//     public static void main(String[] args) {
//         String s1 = "malayala";
//         char[] arr = s1.toCharArray();
//         int i = 0;
//         int j = s1.length() - 1;

//         while (i < j) {
//             char t = arr[i];
//             arr[i] = arr[j];
//             arr[j] = t;
//             i++;
//             j--;
//         }
//         System.out.println(new String(arr));  // it will convert character array into string reverse order
//     }
// }




// palindrome


class string8{
    public static void main(String[] args) {
        String s1 = "malayalam";
        char[] arr = s1.toCharArray();
        int i = 0;
        int j = s1.length() - 1;

        while (i < j) {

            if (arr[i] != arr[j]) {
                System.out.println("Not a palindrome");
                return;
            }
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        System.out.println("Is a palindrome");
    }
}