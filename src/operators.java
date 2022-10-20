public class operators {
    public static void main(String[] args) {
        /* int x = 5;
        x = x +5;
        int y = 6;
        System.out.println(x / y); // wynik całkowity bo operandy całkowite
        System.out.println(x / (double)y); //wystarczy że jeden z argumentów będzie liczbą zmiennoprzecinkową
        System.out.println(3 / 2.);

        System.out.println(5 % 2); //module - reszta z dzielenia

        // opearatory jednoargumentowe
        int a = 5;
        int b = -a;
        System.out.println(a);
        System.out.println(b);*/

        // operatory inkrementacji i dekrementacji
        int x,y,z;
        x = 42;
        y = x++; // y = 42, x =43  postinkrementacja - najpierw przypisalismy x do y a pozniej zwiekszylismy jego wartosc do 43
        z = ++x; // preinkrementacja x = 44, z = 44 - pierwsze zwiekszylismy x a pozniej przypisalismy do z
        System.out.println(y);
        System.out.println(z);


    }
}
