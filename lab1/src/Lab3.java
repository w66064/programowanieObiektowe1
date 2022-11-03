import java.util.Random;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        //zad 1
        System.out.println("Z ilu studenow sklada sie grupa?");
        int iloscStudentow = in.nextInt();
        System.out.println("Srednia w grupie: " + sredniaGrupy(iloscStudentow));

        //zad 2
        sumaUjemnychDodatnich();

        //zad 3
        double[] ciag3 = {1, 2, 3, 4, 5};
        System.out.println("Suma ciagu: " + sumaCiaguParzystych(ciag3));

        //zad 4
        System.out.println("Suma ciagu: " + sumaCiaguParzystychZPrzedzialu(5));

        //zad 5
        System.out.println("Podaj wyraz do sprawdzenia czy jest on palindromem");
        String a5 = in.next();

        System.out.println("Czy podany wyraz '" + a5 +"' jest palindromem? " + czyPalindrom(a5) );

    }

    //zad 1
    public static double sredniaGrupy(int iloscStudentow){
        Scanner in = new Scanner(System.in);
        int i = 0;
        double suma = 0;

        while (i < iloscStudentow){
            System.out.print("Dodaj liczbe punktow: ");
            suma+= in.nextDouble();
            i++;
        }

        double srednia = suma / iloscStudentow;
        return srednia;
    }

    //zad2
    public static void sumaUjemnychDodatnich(){
        Scanner in = new Scanner(System.in);
        int i = 0;
        int dodatnich = 0;
        int ujemnych = 0;
        double sumaDodatnich = 0;
        double sumaUjemnych = 0;

        while (i < 10){
            System.out.print("podaj liczbe " + (i+1) + ".");
            double a = in.nextDouble();

            if (a >= 0) {
                sumaDodatnich += a;
                dodatnich++;
            }

            if (a < 0){
                sumaUjemnych += a;
                ujemnych++;
            }
            i++;
        }
        System.out.println("Liczb dodatnich: " + dodatnich + "\nIch suma wynosi: " + sumaDodatnich);
        System.out.println("Liczb ujemnych: " + ujemnych + "\nIch suma wynosi: " + sumaUjemnych);
    }

    //zad 3
    public static double sumaCiaguParzystych(double[] ciag){
        int suma = 0;

        for (int i = 0; i < ciag.length; i++){
            double temp = ciag[i];
            if (temp % 2 == 0){
                suma += temp;
            }
        }

        return suma;
    }


    //zad 4
    public static double sumaCiaguParzystychZPrzedzialu(int n){
        Random rand = new Random();
        double suma = 0;
        double r = 0;
        double[] ciag = new double[n];

        for (int i =0; i < n; i++) {
            r = rand.nextInt(-10, 45);
            System.out.println("Wylosowana liczba: " + r);
            ciag[i] = r;
        }

        suma = sumaCiaguParzystych(ciag);

        return suma;
    }




    //zad 5
    public static boolean czyPalindrom(String oryginalnyWyraz){
        String odwroconyWyraz = "";
        int dlugosc = oryginalnyWyraz.length();
        boolean palindrom = false;

        for (int i = dlugosc-1; i>=0; i--){
            odwroconyWyraz += oryginalnyWyraz.charAt(i);
        }

        if (oryginalnyWyraz.toLowerCase().equals(odwroconyWyraz.toLowerCase())){palindrom = true;}

        return palindrom;
    }
}
