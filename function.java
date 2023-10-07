// Задание по графом(решение с функцией)

import java.util.Scanner;
import java.lang.Math;

    public class function {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double dan=0;
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            while (x<a) {
                x+=b;
                dan=fuction(x,y,a,b);
                System.out.println("Значение аргумента          Значение функции");
                System.out.println(x+"                         "+y);
            }
        }
        public static double fuction(double x,double y,double a,double b) {
            if (x >= -9 && x < -6) {
                y = -(Math.pow(-(x * x) - 12 * x - 27, 0.5));
            } else if (x >= -6 && x <= 3) {
                y = x + 3;
            } else if (x > -3 && x <= 0) {
                y = Math.pow(-(x * x) + 9, 0.5);
            } else if (x > 0 && x <= 3) {
                y = -(x) + 3;
            } else {
                y = 0.5 * (x - 3);
            }
            return y;
        }
    }
