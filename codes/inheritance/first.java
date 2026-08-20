class parent {
    void home() {
        System.out.println("home");
    }
}

class Child extends parent {
    void school() {
        System.out.println("school");
    }
}

class Main {
    public static void main(String[] args) {

        Child c = new Child();

        c.home();    // inherited from Parent
        c.school();  // Child's own method
    }
}