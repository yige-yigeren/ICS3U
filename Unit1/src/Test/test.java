package Test;

public class test {
    public static void main(String[] args) {
        while (true){
            int i =((int)(Math.random()*4))*2+1;
            int x = i / 3;
            int y= i % 3;
            System.out.println(i + " " + x + " " + y);
        }
    }
}
