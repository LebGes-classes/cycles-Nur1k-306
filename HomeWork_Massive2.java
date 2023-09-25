//Вариант 6
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_Massive2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=0;
        System.out.println("Введите количество строк и столбцов матрицы::");
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Введите числа массива:");
        for (int i=0;i < matrix.length;i++){
            for (int j = 0; j < matrix[i].length; j++) {
                int a = scan.nextInt();
                matrix[i][j]=a;
            }
        }
        System.out.println("Первоначальная матрица:");
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.printf("%1d\t", matrix[i][j]);
            }
            System.out.println();
        }

        for (int i=0;i < matrix.length;i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (((matrix[i][i])%2==0) && ((matrix[j][j])%2==0)){
                    count+=1;
                }
            }
        }
        System.out.println("Номера строк, состоящие только из четных элементов:"+count);
        for (int i=0;i< matrix.length;i++){
            var temp=matrix[i][0];
            matrix[i][0]=matrix[i][2];
            matrix[i][2]=temp;
        }
        System.out.println("Полученная матрица:");
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.printf("%1d\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
