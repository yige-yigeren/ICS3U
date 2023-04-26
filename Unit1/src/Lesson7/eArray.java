package Lesson7;

public class eArray {
    public static void main(String[] args) {

        String[] words = {"Hello", "World", "This", "Is", "A", "Test"};

        int count = 0;

        // how many e in words
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == 'e' || words[i].charAt(j) == 'E') {
                    count++;
                }
            }
        }
        System.out.println("There are " + count + " letter Es");
    }    
}
