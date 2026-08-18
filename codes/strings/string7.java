import java.util.Arrays;
class string7{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hillo";
        
        char[] ch1 = s1.toCharArray(); // it will convert string into character array
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1, ch2)); // it will return true if both the character array are equal otherwise false
    }
}
