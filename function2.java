import java.util.Scanner;

public class function2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        String text = scan.nextLine();
        text = text.toLowerCase();
        char[] arr = text.toCharArray();
        Boolean fl = true;
        for (int i=0;i < text.length();i++){
            if (!((arr[i])==(arr[text.length()-i-1]))){
                System.out.println("Заданная строка не является палиндромом");
                fl = false;
                break;
            }

        }
        if (fl)
            System.out.println("Заданная строка является палиндромом");
    }
}

