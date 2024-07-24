package calculator;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int num2 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
        // Scanner는 char 타입으로 입력 받을 수 없다
        //그래서 등장한 것이 바로 charAt()
        // String으로 저장된 문자열 중에서 한 글자만 선택해서 char 타입으로 변환해주는 녀석
        char operator = ' ';
        operator = sc.next().charAt(0);
        System.out.println("입력받은 기호: " + operator);




    }
}

