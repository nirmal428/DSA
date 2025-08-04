package Array;

public class passingArrayToMethod {
    public static void main(String[] args) {
        int[] x={10,20,30,40,50};
        System.out.println(x[0]);
        change(x);
        System.out.println(x[0]);
    }

    public static void change(int[] x) {
        x[0]=100;
    }
}
