public class Main {
    public static void main(String[] args) {
        float percent = 3;
        int investSum = 1000;
        int income = (int) (investSum * 100 * (percent / 100));
        System.out.println(income / 100);
    }
}