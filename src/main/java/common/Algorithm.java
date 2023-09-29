package common;

public class Algorithm {

    Validation validation = new Validation();

   public  void superlativeEquation() {
        System.out.print("Enter A: ");
        double a = validation.checkInputDouble();
        System.out.print("Enter B: ");
        double b = validation.checkInputDouble();
        double x = -b / a;
        System.out.println("Solution: x=" + x);
        System.out.print("Number is odd: ");
        if (validation.checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (validation.checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (validation.checkOdd(x)) {
            System.out.print(x + " ");
        }
        System.out.print("Number is even: ");
        if (validation.checkEven(a)) {
            System.out.print(a + " ");
        }
        if (validation.checkEven(b)) {
            System.out.print(b + " ");
        }
        if (validation.checkEven(x)) {
            System.out.print(x + " ");
        }
        System.out.print("Number is perfect square: ");
        if (validation.checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (validation.checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (validation.checkSquareNumber(x)) {
            System.out.print(x + " ");
        }
    }

    public  void quadraticEquation() {
        System.out.print("Enter A: ");
        double a = validation.checkInputDouble();
        System.out.print("Enter B: ");
        double b = validation.checkInputDouble();
        System.out.print("Enter C: ");
        double c = validation.checkInputDouble();
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        System.out.print("Number is odd: ");
        if (validation.checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (validation.checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (validation.checkOdd(c)) {
            System.out.print(c + " ");
        }
        if (validation.checkOdd(x1)) {
            System.out.print(x1 + " ");
        }
        if (validation.checkOdd(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
        System.out.print("Number is even: ");
        if (validation.checkEven(a)) {
            System.out.print(a + " ");
        }
        if (validation.checkEven(b)) {
            System.out.print(b + " ");
        }
        if (validation.checkEven(c)) {
            System.out.print(b + " ");
        }
        if (validation.checkEven(x1)) {
            System.out.print(x1 + " ");
        }
        if (validation.checkEven(x2)) {
            System.out.print(x1 + " ");
        }
        System.out.println();
        System.out.print("Number is perfect square: ");
        if (validation.checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (validation.checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (validation.checkSquareNumber(c)) {
            System.out.print(c + " ");
        }
        if (validation.checkSquareNumber(x1)) {
            System.out.print(x1 + " ");
        }
        if (validation.checkSquareNumber(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
    } 
}
