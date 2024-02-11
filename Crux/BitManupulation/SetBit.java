package BitManupulation;

public class SetBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;  // 1 = 0001
        int num = bitmask|n;
        System.out.println(num);
        // num = 0111

    }
}
