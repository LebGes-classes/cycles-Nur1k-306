// Вариант 6
import java.util.Scanner;

public class HomeWork_Massive1 {
    public static void main(String[] args) {
        double max=-10000;
        int count=0;
        double summ=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int N = scan.nextInt();
        System.out.println("Введите число A:");
        int A = scan.nextInt();
        System.out.println("Введите число B:");
        int B = scan.nextInt();
        System.out.println("Ваш диапозон:"+"["+A+";"+B+"]");
        double[] arr = new double[N];
        System.out.println("Введите числа массива:");
        for (int i=0;i< arr.length;i++){
            double a = scan.nextDouble();
            arr [i]=a;
            if (arr[i]>=A && arr[i]<=B){
                count+=1;
            }
        }
        int maxind = 0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
                maxind = i;
            }
        }
        for (int i = maxind+1; i< arr.length; i++){
            summ+=arr[i];
        }
        System.out.println("Количество элементов массива, лежащих в диапазоне от А до В:"+ count);
        System.out.println("Сумму элементов массива, расположенных после максимального элемента:"+ summ);
        System.out.println("Вывод массива на экран:");
        for (int i=0;i<N;i++){
            System.out.print(arr[i]+",");
        }
    }
}


