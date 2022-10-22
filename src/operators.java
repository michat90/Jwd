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
        /*int x,y,z;
        x = 42;
        y = x++; // y = 42, x =43  postinkrementacja - najpierw przypisalismy x do y a pozniej zwiekszylismy jego wartosc do 43
        z = ++x; // preinkrementacja x = 44, z = 44 - pierwsze zwiekszylismy x a pozniej przypisalismy do z
        System.out.println(y);
        System.out.println(z);*/

//        int a =0;
//        int b;
//        b = a++ + a++; // (0) + (1); b = 1; a =2
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//        int z = 0;
//        z = z++; // z= 0
//        System.out.println("z = "z);

//        int x = 7;
//        int y = 7;
//        int z = 7;
        /*int x, y, z
        x = y = z = 7;
        x =+ 2; // x = x + 2 ; również dla "*,/,-" */

        // operatory relacji
        // negacja !
        // iloczyn logiczny (koniunkcja) &&
        // suma logiczna (alternatywna) ||
        // równoważność ==
        // alternatywa rozłączna XOR !=

        //&& i || to operatory warunkowe w przeciwieństwie do operatora & i |

        /*int y = 5;
        int x = 0;
        boolean test = (x < 0) && (y++ > 3); // false && true // false w iloczynie logicznym jeżeli pierwszy człon jest false
                                                                //kompilator nie sprawdza drugiego członu
                                                                // i dlatego y sie nie zmianie, jakby pierwszy człon byl
                                                                //true wtedy reszta jest wykonywana i y sie zmieni

        // jeżeli dalibyśmy pojedynczy "&" wtedy komplilator normalnie wykona obydwa człony
        System.out.println(test);
        System.out.println(y);*/

        int age = 33;
        boolean test2 = !(age < 25); // negujemy false -> true
        System.out.println(test2);



    }
}
