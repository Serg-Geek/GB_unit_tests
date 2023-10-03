//** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и
//        возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
//        Если метод calculateDiscount получает недопустимые аргументы,
//        он должен выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.

package main.java;

public class Calculator {


    public static void main(String[] args) {
        System.out.printf("result +: %s\n", calculation(2, 2, '+'));
        System.out.printf("result -: %s\n", calculation(4, 2, '-'));
        System.out.printf("result  /: %s\n", calculation(8, 2, '/'));
        System.out.printf("result *: %s\n", calculation(3, 2, '*'));
        System.out.printf("result discount: %s\n", calculatingDiscount(10.5,12));
    }

    public static int calculation(int firstOperand, int
            secondOperand, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount < 0 || discountAmount < 0 || discountAmount > 100) {
            throw new ArithmeticException("Invalid input values");
        }
        double discount = (double) discountAmount / 100.0;
        double discountedAmount = purchaseAmount * (1 - discount);
        return discountedAmount;
    }

}
