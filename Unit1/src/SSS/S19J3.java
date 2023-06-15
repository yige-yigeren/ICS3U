package SSS;

import java.util.Scanner;
import java.util.ArrayList;

public class S19J3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numLines = input.nextInt();
        input.nextLine(); // consume the newline character
        ArrayList<String> lines = new ArrayList<>();
        for (int i = 0; i < numLines; i++) {
            String line = input.nextLine();
            char[] chars = line.toCharArray();

            char currentChar = chars[0];
            int currentCount = 1;

            StringBuilder sb = new StringBuilder();

            for (int j = 1; j < chars.length; j++) {
                if (chars[j] == currentChar) {
                    currentCount++;
                } else {
                    sb.append(currentCount).append(" ").append(currentChar).append(" ");
                    currentChar = chars[j];
                    currentCount = 1;
                }
            }

            sb.append(currentCount).append(" ").append(currentChar);
            lines.add(sb.toString());
        }
        input.close();
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

