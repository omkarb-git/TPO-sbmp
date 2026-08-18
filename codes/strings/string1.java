/*class string1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + " " + s2);
    }
} */

/*class string1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hello";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
} */

class string1{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = new String("Hello");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}