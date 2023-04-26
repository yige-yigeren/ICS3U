package Lesson7;

public class maxMinArray {
    public static void main(String[] args) {

        int[] nums = {23,324,425,-314,-2342,-32,0,100};

        int biggest = nums[0];
        int smallest = nums[0];

        for (int i=0;i<nums.length;i++) {
            if (nums[i] > biggest) {
                biggest = nums[i];
            } else if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }

        System.out.println("The biggest number is " + biggest);
        System.out.println("The smallest number is " + smallest);
    }
}
