import java.util.Scanner;

public class LoopsInRange {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę z przedziału 0-3:");
        double n = scan.nextInt();
        scan.close();
        double i = 0;

        double range = 0.1;

        while ((i <= 3) && i >= 0) {

            System.out.printf("%.1f%n", i);
            i = i + range;
        }
        System.out.println("Podaj kolejny raz liczbę z przedziału 0-3:");
        scan = new Scanner(System.in);

        i=0;
        range=0.1;
        do {

            i=i+range;

            System.out.printf("%.1f%n", i);
            i++;


        }while ((i < 3) && i >=0);

        }
    }


        //do {
            //i = i + 0.1;
            //i++;
            //System.out.println(i);
        //} while (n >=0 && n<= 3);

        //if (n >= 0 && n<=3)
        //for (double i = 0; i <3; i =i+ 0.1)
        //System.out.printf("%.1f ", i);
        // else {
        // System.out.println("Poza zasiegiem");


