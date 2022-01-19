//Написать программу, которая должна найти и вывести повторяющийся символ в слове «Hello»
public class task2For {
    public static void main(String[] args) {
        String text = "Hello";
        for (int i = 0; i < (text.length() - 1); i++) {
            if ((text.charAt(i)) == (text.charAt(i + 1))) {
                System.out.println(text.charAt(i));
            }
        }
    }
}
