class bank {
    private int bal;
    bank (int bal) {
        this.bal = bal;
    }

    void deposit(int amt) {
        if (amt <= bal) {
            bal -= amt;
            System.out.println(amt + " withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class encapsulation {
    public static void main(String[] args) {
        bank ba1 = new bank();
    }
}