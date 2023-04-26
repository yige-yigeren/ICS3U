package Homework;

public class h37 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int a = 0;

        for (int i = 1; i <= 100; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                nums[a] = i;
                a++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}
