package calculator;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        //새로운 객체를 스캐너타입의 sc 변수안에 할당
        Scanner sc = new Scanner(System.in);
        //레벨 1-1
        System.out.print("첫 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int num2 = sc.nextInt();

        //레벨 1-2
        System.out.print("사칙연산 기호를 입력하세요: ");
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
        // Scanner는 char 타입으로 입력 받을 수 없다 이유는 보통 입력을 할 때 하나만 입력을 안하니깐...
        //그래서 등장한 것이 바로 charAt()
        // String으로 저장된 문자열 중에서 한 글자만 선택해서 char 타입으로 변환해주는 녀석
        //입력 받은 값 연산 기호를 문자타입으로 변경해서
         char operator = sc.next().charAt(0);

        //레벨 1-3
        /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
        /* 기호 부분에 빨간 줄이 떠서 알아보니 문잣값은 앞뒤를 단일 인용 부호 ''로 감싸 주어야 한다. 나는 "기호"이런 식으로 해서 오류 발생 */
        /* case 안에 break 문이 없다면 조건에 해당여부와 무관하게 남은 case 들이 다 실행 */
        int result = 0 ;
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
                }
                else result = num1 / num2;

                break;
        }
        System.out.println("결과: " + result);

    }
}

