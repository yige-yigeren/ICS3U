package Homework;

public class h41 {
    public static void main(String[] args) {
        int[] nums1= {1,3,4,5,7,8,9};
        int[] nums2= {2,3,4,5,7,9,10};
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    System.out.println(nums1[i]);
                }
            }
        }
    }
}
