class string2{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = new String("Hello");
        String s4 = "Hello";
        System.out.println(s1 == s4);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}