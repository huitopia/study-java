package ch11.sec00.exam;

public class Test06 {
    public static void main(String[] args) {
        String[] arr = {"10", "2a"};
        int val = 0;
        for (int i = 0; i <= 2; i++) {
            try {
                val = Integer.parseInt(arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("index max");
            } catch (NumberFormatException e) {
                System.out.println("do not change number");
            } finally {
                System.out.println(val);
            }
        }
    }
}
