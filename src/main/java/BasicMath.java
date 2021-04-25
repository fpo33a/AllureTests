public class BasicMath {

    public static void main (String args[]) {
        System.out.println ("add (4,2) : "+ BasicMath.add(4,2));
        System.out.println ("sub (4,2) : "+ BasicMath.sub(4,2));
        System.out.println ("mul (4,2) : "+ BasicMath.mul(4,2));
        System.out.println ("div (4,2) : "+ BasicMath.div(4,2));

    }

    public static int add ( int a, int b) {
        return a+b;
    }

    public static int sub (int a, int b) {
        return a-b;
    }

    public static int mul (int a, int b) {
        return a*b;
    }

    public static int div (int a, int b) {
        return a/b;
    }
}
