package SSS;

import java.util.*;

public class S19J5 {

    static String[] rulesFrom, rulesTo;
    static String initial, finalSequence;
    static int steps;
    static boolean found;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Load the rules.
        rulesFrom = new String[3];
        rulesTo = new String[3];
        for (int i = 0; i < 3; i++) {
            String[] ruleParts = sc.nextLine().split(" ");
            rulesFrom[i] = ruleParts[0];
            rulesTo[i] = ruleParts[1];
        }

        // Load the number of steps, initial and final sequences.
        String[] lineParts = sc.nextLine().split(" ");
        steps = Integer.parseInt(lineParts[0]);
        initial = lineParts[1];
        finalSequence = lineParts[2];

        // Find a sequence of substitutions.
        findSubstitutionSequence(initial, 0);

        sc.close();
    }

    public static void findSubstitutionSequence(String sequence, int currentStep) {
        if (currentStep == steps) {
            if (sequence.equals(finalSequence)) {
                found = true;
            }
            return;
        }
        if (found) return; // if solution is already found then return

        for (int rule = 0; rule < 3; rule++) {
            for (int position = 0; position <= sequence.length() - rulesFrom[rule].length(); position++) {
                if (sequence.substring(position, position + rulesFrom[rule].length()).equals(rulesFrom[rule])) {
                    String newSequence = sequence.substring(0, position) + rulesTo[rule] + sequence.substring(position + rulesFrom[rule].length());
                    System.out.printf("%d %d %s\n", rule + 1, position + 1, newSequence);
                    findSubstitutionSequence(newSequence, currentStep + 1);
                    if (found) return;
                }
            }
        }
    }
}
