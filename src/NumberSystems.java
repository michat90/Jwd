public class NumberSystems {
    public static void main(String[] args) {

        // system dziesiętny (0,1,2,3,4,5,6,7,8,9)
        //154 -> (1 * 10^2) + (5 * 10^1) + (4 * 10^0) = 100 + 50 + 4

        //system dwójkowy (binarny) - (0,1)
        //101 -> (1 * 2^2) + (0 * 2^1) + (1 * 2^0) = 4 + 0 + 1 = 5

        //system ósemkowy (oktalny) - (0,1,2,3,4,5,6,7)
        // 47 -> (4 * 8^1) + (7 * 8^0) = 32 + 7 = 39

        //system szesnastkowy (hexadexymalny) (0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f)
        //3af -> (3 * 16^2) + (a * 16^1) + (f * 16^0) = (3 * 256) + (10 * 16) + (15 * 1) = 768 + 160 + 15 = 943

//        System.out.println(Integer.toBinaryString(5));
//        System.out.println(Integer.toOctalString(39));
//        System.out.println(Integer.toHexString(943));

        // 1011 = 8 + 0 + 2 + 1 = 11
        // 8421

        // operatory bitowe

        // & - iloczyn bitowy
        // | - suma bitowa
        // ^ - XOR (exclusive or)
        // >> - operator przesunięcie w prawo
        // << = przesunięcie w lewo

        int a = 1; // 0001
        int b = 5; // 0101
        //------------------
        //            0001    <- iloczyn bitowy
        //            0101    <- suma bitowa
        //            0100    <- XOR
        //System.out.println(a & b);

//        System.out.printf("%10s\n", Integer.toBinaryString(a));
//        System.out.printf("%10s\n",Integer.toBinaryString(b));
//        System.out.printf("-------------------------");
//        System.out.printf("%10s\n",a & b);

//        System.out.println(b << 2);
//        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ','0'));
//        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ','0'));
//        System.out.println(String.format("%32s", '-').replace(' ','-'));
//        System.out.println(String.format("%32s", Integer.toBinaryString(b << 2)).replace(' ','0'));

        //XOR

        // 1 1 -> 0
        // 1 0 -> 1
        // 0 1 -> 1
        // 0 0 -> 0

//        System.out.println(b >> 2); // 0101 -> 0001
//        System.out.println(b << 2); // 0101 -> 010100

     /*   System.out.println(String.format("%32s", Integer.toBinaryString(1)).replace(' ','0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(-1)).replace(' ','0'));*/

        //-1
        // 0001
        // 1110 + 1
        //---------
        //1111

    }
}
