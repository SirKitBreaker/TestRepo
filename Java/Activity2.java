package activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] numArr = {10, 77, 10, 54, -11, 10};

        System.out.println("Is the sum of 10s equal to 30? " + countTens(numArr));
    }

    public static boolean countTens(int[] numArr) {
        int sum = 0;
        for (int num : numArr) {
            if (num == 10) {
                sum += num;
                System.out.println(sum);
            }

            if (sum > 30) {
                break;
            }
        }

        return sum == 30;
    }
}
