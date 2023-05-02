package Lesson13;

public class moreRecurrsion {

	static int sum(int a, int b) {
		if (a == b) {
			return a;
		} else {
			return a + sum(a + 1, b);
		}
	}
	static int fib(int a) {
		if (a <= 1) {
			return 0;
 		} else if (a == 2) {
			return 1;
		} else {
			return fib(a - 1) + fib(a - 2);
		}
	}

	static int howMany(String a,char b) {
		if (a.length() == 1 && a.charAt(0)==b) {
			return 1;
		} else if (a.length() == 1 && a.charAt(0)!=b) {
			return 0;
		} else {
			if (a.charAt(0)==b) {
				return 1 + howMany(a.substring(1),b);
			} else {
				return howMany(a.substring(1),b);
			}
		}
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sum(5, 10));
		System.out.println(fib(10));
		System.out.println(howMany("hello",'l'));
	}

}
