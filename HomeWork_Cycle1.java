import java.util.Scanner;
import java.lang.Math;

public class HomeWork_Cycle1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double x= scan.nextDouble();
        double y= scan.nextDouble();
        double a= scan.nextDouble();
        double b= scan.nextDouble();
        while (x<a){
            if (x>=-9 && x<-6){
                y= -(Math.pow(-(x*x)-12*x-27,0.5));
            }
            else if (x>=-6 && x<=3) {
                y=x+3;
            }
            else if (x>-3 && x<=0) {
                y=Math.pow(-(x*x)+9,0.5);
            }
            else if (x>0 && x<=3) {
                y=-(x)+3;
            }
            else {
                y=0.5*(x-3);
            }
            System.out.println("Значение аргумента          Значение функции");
            System.out.println(x+"                         "+y);
            x+=b;
        }
    }
}

