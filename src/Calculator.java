public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        sumTwoNumbers(a,b);
        subtractTwoNumbers(a,b);
        multiplyTwoNumbers(a,b);
        divideTwoNumbers(a,b);

    }

    public static void sumTwoNumbers(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtractTwoNumbers(int num1, int num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiplyTwoNumbers(int num1, int num2){
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void divideTwoNumbers(int num1, int num2){
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
