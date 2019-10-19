public class ArmstrongNumbers {


    public static boolean isArmstrongNumber(int number) {

        int digitsNumber = String.valueOf(number).length();
        int sum = 0;
        int temp = number;
        for (int i = 1; i <= digitsNumber; i++) {
            int digit = temp % 10;
            temp = temp / 10;
            sum = sum + (int) Math.pow(digit, digitsNumber);
        }
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }
}
