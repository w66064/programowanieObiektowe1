import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //zad 1
        System.out.println("Podaj (po enterze) a(x^2) + b(x) + c do rozwiaznaia rownania kwadratowego: ");
        double a1 = in.nextDouble();
        double b1 = in.nextDouble();
        double c1 = in.nextDouble();

        rownanieKwadratowe(a1, b1, c1);

        //zad2
        System.out.println("Podaj x do okreslenia wartosci funkcji");
        int x2 = in.nextInt();
        System.out.println("Rozwiazanie funkcji a(x): " + zad2a(x2));
        System.out.println("Rozwiazanie funkcji b(x): " + zad2b(x2));
        System.out.println("Rozwiazanie funkcji c(x): " + zad2c(x2));

        //zad 3
        System.out.println("Podaj 3 liczby do porzadkowania:");
        int a3 = in.nextInt();
        int b3 = in.nextInt();
        int c3 = in.nextInt();
        porzadkuj(a3, b3, c3);

        //zad 4
        boolean deszcz = true;
        boolean autobus = true;
        zad4(deszcz, autobus);

        //zad5
        System.out.println("Czy masz znizke?(true/false)");
        boolean znizka = in.nextBoolean();
        System.out.println("Czy masz premie?(true/false)");
        boolean premia = in.nextBoolean();
        zad5(znizka, premia);

        //zad 6
        System.out.println("Wybierz dzialanie (1-5)\n1.dodawanie\n2.odejmowanie\n3.mnozenie\n4.dzielenie\n5.reszta z dzielenia");
        int wybor = in.nextInt();
        System.out.println("podaj 2 liczby do dzialania");
        double a6 = in.nextDouble();
        double b6 = in.nextDouble();

        System.out.println("Wybrane dzialanie " + wybor + " wynik: " + dzialanie(wybor, a6, b6));

    }


    //======================================================================================================

    //zad1
    public static void rownanieKwadratowe(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / 2 * a;
            double x2 = (-b + Math.sqrt(delta)) / 2 * a;
            System.out.println("Rozwiazania: x1: " + x1 + " x2: " + x2);
        } else if (delta == 0) {
            double x = -b / 2 * a;
            System.out.println("Rozwiazanie x: " + x);
        } else {
            System.out.println("Nie ma rozwiazan");
        }
    }

    //zad 2
    //a
    public static int zad2a(int x){
        if (x > 0){
            return 2 * x;
        } else if (x == 0) {
            return 0;
        } else {
            return -3 * x;
        }
    }

    //b
    public static int zad2b(int x){
        if (x >= 1){
            return (int)Math.pow(x,2);
        } else {
            return x;
        }
    }

    //c
    public static int zad2c(int x){
        if (x > 2){
            return 2 + x;
        } else if (x == 2) {
            return 8;
        } else {
            return x -4;
        }
    }

    //zad 3
    public static void porzadkuj(int a, int b, int c){
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Uporzadkowane liczby: " + a + "," + b + "," + c);
    }

    //zad 4
    public  static void zad4(boolean deszcz, boolean autobus){
        if (deszcz != false && autobus != false){
            System.out.println("Wez parasol \nDostaniesz sie na uczelnie");
        } else if (deszcz != false && autobus != true) {
            System.out.println("Nie ostaniesz sie na uczelnie");
        } else {
            System.out.println("Dostaniesz sie na uczelnie \nMilego dnia i pieknej pogody");
        }
    }


    //zad5
    public static void zad5(boolean znizka, boolean premia) {
        if (znizka != true || premia != false) {System.out.println("Możesz kupić samochód! \nZniżki na samochód nie ma"); }

        if (znizka != true || premia != true) {System.out.println("Zakup samochód trzeba odłożyć na później... \nZniżki na samochód nie ma");}

        if (znizka != false || premia != false){ System.out.println("Możesz kupić samochód!");}
    }

    //zad6
    public static double dzialanie(int wybor, double a, double b){
        switch (wybor){
            case 1: return a + b;
            case 2: return a - b;
            case 3: return a * b;
            case 4:
                if (b == 0){System.out.println("Nie dziel przez 0!");}
                return a / b;
            case 5:
                if (b == 0){System.out.println("Nie dziel przez 0!");}
                return a % b;
            default: System.out.println("Zle wybrane dzialanie"); return 0;
        }
    }
}
