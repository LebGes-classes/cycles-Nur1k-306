import java.util.Scanner;

public class HomeWork_Metod1 {
    public static void main(String[] args) {
        Scanner str_in = new Scanner(System.in);
        System.out.println("Введите слова:");
        String s = str_in.nextLine();
        String result = "";
        s = " " + s;

        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) == ' ' || i == 0) {
                reverse(result);
                result = "";
            } else {
                result += s.charAt(i);
            }
        }
        System.out.println();
        result = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) == ' ' || i == 0) {
                glass(result);
                result = "";
            } else {
                result += s.charAt(i);
            }
        }
    }

    public static void glass(String s) {
        System.out.print(s + " ");
    }

    public static void reverse(String s) {
        for (int i = s.length() - 1; i >= 0; --i) {
            System.out.print(s.charAt(i));
        }
        System.out.print(" ");
    }
}
