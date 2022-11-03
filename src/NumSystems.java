public class NumSystems {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println(String.format("%10s", '-').replace(' ','-'));
        System.out.println(a + " * " + b + " = " + (a * b));

        System.out.println("\nBinarnie");
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ','0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ','0'));
        System.out.println(String.format("%32s", '-').replace(' ','-'));
        System.out.println(String.format("%32s", Integer.toBinaryString(a * b)).replace(' ','0'));

        System.out.println("\nósemkowo");
        System.out.println(String.format("%5s", Integer.toOctalString(a)));
        System.out.println(String.format("%5s", Integer.toOctalString(b)));
        System.out.println(String.format("%5s", '-').replace(' ','-'));
        System.out.println(String.format("%5s", Integer.toOctalString(a * b)));

        System.out.println("\nszesnastkowo");
        System.out.println(String.format("%5s", Integer.toHexString(a)));
        System.out.println(String.format("%5s", Integer.toHexString(b)));
        System.out.println(String.format("%5s", '-').replace(' ','-'));
        System.out.println(String.format("%5s", Integer.toHexString(a * b)));
    }
}
