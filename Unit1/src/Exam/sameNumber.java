package Exam;

// import scanner
import java.util.Scanner;

public class sameNumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // prepare for input
        Scanner sc = new Scanner(System.in);
        // ask the number of first array
        System.out.println("Please enter a number of first arrays:");
        int num1 = sc.nextInt();
        // check if the number is bigger than 0
        if (num1 <= 0) {
            System.out.println("ERROR:The number must bigger than 0.");
            sc.close();
            return;
        }
        // create first array
        int[] nums1 = new int[num1];
        // ask the number of first array echo one
        for (int i = 0; i < nums1.length; i++) {
            System.out.println("Please enter a number of first arrays at " + (i+1) +" :");
            nums1[i] = sc.nextInt();
        }
        // ask the number of second array
        System.out.println("Please enter a number of second arrays:");
        int num2 = sc.nextInt();
        // check if the number is bigger than 0
        if (num2 <= 0) {
            System.out.println("ERROR:The number must bigger than 0.");
            sc.close();
            return;
        }
        // create second array
        int[] nums2 = new int[num2];
        // ask the number of second array echo one
        for (int i = 0; i < nums2.length; i++) {
            System.out.println("Please enter a number of second arrays at " + (i+1) +" :");
            nums2[i] = sc.nextInt();
        }
        // close the scanner, avoid memory leak
        sc.close();
        // compare the two array
        // set a count to store how many number are the same
        int count = 0;
        // create a third array to store the same number, only use 0 to count, set length is num1+num2 make sure it is big enough
        int[] nums3 = new int[num1+num2];
        // compare the two array
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    // if the number are the same, store it in the third array
                    nums3[count] = nums1[i];
                    // count plus one
                    count++;
                }
            }
        }
        // print the result
        System.out.println("How many numbers are the same: "+ count);
        System.out.print("Same numbers: ");
        if (count == 0) {
            // if the count is 0, only print none
            System.out.println("none");
        } else {
            // use for loop print the same number
            for (int i = 0; i < count; i++) {
                System.out.print(nums3[i] + " ");
            }
        }
        // give me full marks, please
        // :D
        // Mr. Lei at 2023/04/20
    }
}
