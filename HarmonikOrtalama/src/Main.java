

public class Main {
    public static void main(String[] args) {
        double sum = 0.0;
        double[] list = {1, 2};
        for (int i = 0; i < list.length; i++) {
            sum = sum + (1 / list[i]);
        }
        System.out.println(sum);
    }
}
