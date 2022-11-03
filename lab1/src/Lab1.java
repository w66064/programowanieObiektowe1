import java.util.Random;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //zad 1
        System.out.println(imieWiek());

        //zad 2
        System.out.println("Podaj 2 liczby potrzebne do obliczenia sumy, roznicy i iloczynu");
        double a2 = in.nextDouble();
        double b2 = in.nextDouble();

        sumaRoznicaIloczyn(a2,b2);

        //zad 3
        System.out.println("Wpisz liczbe do sprawdzenia czy jest parzysta:");
        int a3 = in.nextInt();

        boolean parzysta = czyParzysta(a3);
        System.out.println("Podana liczba jest parzysta: " + parzysta);

        //zad 4
        System.out.println("Wpisz liczbe do sprawdzenia czy jest podzielna przez 3 i 5:");
        int a4 = in.nextInt();

        boolean czyPodzielna = czyPodzielna(a4);
        System.out.println("Podana liczba jest podzielna przez 3 i 5: " + czyPodzielna);

        //zad 5
        System.out.println("Jaka liczbe podniesc do potegi 3?");
        double a5 = in.nextDouble();

        double a5Potega = potegaDo3(a5);
        System.out.println("Podana liczba do potegi 3: " + a5Potega);

        //zad 6
        System.out.println("Jaka liczbe spierwiastkowac?");
        double a6 = in.nextDouble();

        double a6Pierwiastek = pierwiastek(a6);
        System.out.println("Pierwiastek podanej liczby: " + a6Pierwiastek);

        //zad 7
        Random rand = new Random();
        System.out.println("Podaj przedzial od:?");
        int od7 = in.nextInt();
        System.out.println("Podaj przedzial do:?");
        int do7 = in.nextInt();

        int a7 = rand.nextInt(od7,do7);
        int b7 = rand.nextInt(od7,do7);
        int c7 = rand.nextInt(od7,do7);

        System.out.println("wylosowane liczby: " + a7 + "," + b7 + "," + c7);
        System.out.println("Czy mozna zbudowac trojkat? Odp:" + czyTrojkat(a7, b7, c7));

    }

    //====================================================================================================================
    // zad 1. Napisz metodę, która zwróci twoje imię oraz aktualny wiek.
    public static String imieWiek() {
        return "Imie: Kamil i mam XXlat ";
    }

    //zad 2. Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn.
    //Argumenty przekazywane do metody są liczbami wprowadzanymi przez użytkownika z klawiatury.
    public static void sumaRoznicaIloczyn(double a, double b){
        System.out.println("Suma: " + (a + b));
        System.out.println("Roznica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
    }

    //zad 3. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta.
    public static boolean czyParzysta (int a){
        return (a % 2) == 0;
    }

    //zad 4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez
    //3 i przez 5.
    public static boolean czyPodzielna(int a){
        return ((a % 3) == 0 && (a % 5) == 0);
    }

    //zad 5 Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi.
    public static double potegaDo3(double a){
        return Math.pow(a, 3);
    }

    //zad 6 Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy
    public static double pierwiastek(double a){
        return Math.sqrt(a);
    }

    //zad 7 Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli
    //z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
    //Argumenty przekazywane do metody są liczbami losowymi z przedziału <a,b> a i b wczytywane są
    //przez użytkownika z klawiatury

    public static boolean czyTrojkat(int a, int b, int c){
        if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){return true;}
        if (Math.pow(c,2) + Math.pow(c,2) == Math.pow(b,2)){return true;}
        if (Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2)){return true;}
        return false;
    }
}