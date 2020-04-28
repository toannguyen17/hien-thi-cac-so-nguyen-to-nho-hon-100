package app;

public class App {
    public static void main(String[] args) throws Exception {
        for(double i = 2; i <= 100; i++){
            boolean check = true;
            if (i != 2) {
                double cSQRT = Math.ceil(Math.sqrt(i));
                for(double j = 2; j <= cSQRT; j++){
                    if (i%j == 0) {
                        check = false;
                    }
                }
            }
            if (check) {
                System.out.println((int)i);
            }
        }
    }
}
