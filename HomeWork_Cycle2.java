public class HomeWork_Cycle2 {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                int num=(42000 + i * 100 + j * 10 + 4);
                if (num%72==0){
                    System.out.println(num);
                }
            }
        }
    }
}
