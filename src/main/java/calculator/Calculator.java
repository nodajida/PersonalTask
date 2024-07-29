package calculator;

public class Calculator {
//필드 영역

    public Calculator() {
        //생성자 영역 (생략가능)
    }

    //메소드 영역
    static int calculate(int num1, int num2, char operator) {
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
        int result1 = result;
        return result1;
    }
}