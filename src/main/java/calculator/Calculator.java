package calculator;

public class Calculator {
    public static int getResult(int num1, int num2, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0이 입력될 수 없습니다.");
                } else result = num1 / num2;
                break;
        }
        System.out.println("결과: " + result);
        return result;
    }
}
