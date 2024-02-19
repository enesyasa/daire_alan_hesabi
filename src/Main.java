import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        int r,alfa;
        double pi=3.14;
        double alan;

        Scanner inp =new Scanner(System.in);

        System.out.print("merkez açısının ölçüsü : ");
        alfa=inp.nextInt();
        System.out.print("yarı çapının ölçüsü : ");
        r=inp.nextInt();


        alan=(pi * (r*r) * alfa) / 360;
        System.out.println("alan: "+alan);

    }
}