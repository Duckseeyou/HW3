public class Main {

    public static double sum;
    public static int quantity;
    public static boolean isNegativeMet;

    public static void main(String[] args) {
        double[] nums = {5.5, 6.5, 9.7, -1.56, -8, 9.9, 19.79, 19.11, -14.61, -25.3, 12.6, 22.5, 5.4, -10.3, 19.24};

        for (double i : nums){

            if (i < 0) {
                isNegativeMet = true;
            }

            if (i > 0 && isNegativeMet){
                sum += i;
                quantity += 1;
            }
        }

        System.out.println(sum / quantity);

    }
}