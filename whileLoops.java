import java.util.Scanner;
import java.util.ArrayList;
class WhileLoops {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        String sentence = "flapjacks are awesome!";
        Scanner scan = new Scanner(sentence);
        ArrayList<String> words = new ArrayList<String>();

        while(scan.hasNext()) {
            words.add(scan.next());
        }

        System.out.println(words);
        // outputs [flapjacks, are, awesome!]


        while (a < 10) {
            System.out.println("a is less than 10: " + a);
            a++;
        }

        // do this once before checking if the while is true or false
        do {
            System.out.println("do while loop b < 4: " + b);
            b++;
        } while(b < 0);

        // outputs do while loop b < 4 : 0

    }
}