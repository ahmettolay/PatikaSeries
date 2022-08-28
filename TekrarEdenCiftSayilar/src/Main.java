import java.util.Arrays;

public class Main {
    static boolean isFind(int arr[], int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int list[] = {3, 7, 2, 3, 2, 9, 10, 21, 3, 1, 33, 9, 1,4,4,6,6};
        int dublicete[] = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {

                if (i != j && list[i] == list[j]) {

                    if (!isFind(dublicete, list[i])) {

                        dublicete[startIndex++] = list[i];
                        break;
                    }

                }
            }
        }
        System.out.println(Arrays.toString(dublicete));
        for (int i : dublicete) {
            if (i != 0) {
                if (i %2==0) {
                    System.out.print(i+",");
                }
            }
        }
    }
}
