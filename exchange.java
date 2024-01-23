import java.util.Scanner;

public class exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so tien");
        usd = sc.nextDouble();
        double exchange = usd *23000;
        System.out.print("Gia tri VND :" + exchange);


    }
}
