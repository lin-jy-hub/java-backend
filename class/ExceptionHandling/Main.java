package ExceptionHandling;

import javax.management.RuntimeErrorException;

public class Main {
    public static void main(String[] args) {
        try {
            statement1();
            statement2();
            statement3();
        } catch (RuntimeErrorException ex) {

        } finally {
            statement4();
        }
        statement5();
    }

    static void statement1() {
        System.out.println("statement1");
    }

    static void statement2() {
        throw new RuntimeException();
    }

    static void statement3() {
        System.out.println("statement3");
    }

    static void statement4() {
        System.out.println("statement4");
    }

    static void statement5() {
        System.out.println("statement5");
    }
}