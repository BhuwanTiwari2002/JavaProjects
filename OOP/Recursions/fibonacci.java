package OOP.Recursions;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(Find_FibonacciByIndex(23));
    }

    static int Find_FibonacciByIndex(int i) {
        if(i < 2) {
            return i;
        }
        return Find_FibonacciByIndex(i-1) + Find_FibonacciByIndex(i-2);
    }
}
