package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        /* 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언 */


        // ArrayList 배열 생선 선언
        ArrayList<Integer> intList = new ArrayList<Integer>();

        //새로운 객체를 스캐너타입의 sc 변수안에 할당
        Scanner sc = new Scanner(System.in);
        while (true) {
            /* 입력 부분 */
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num2 = sc.nextInt();
            // ---------------------------------------------------------------------------------------------------------
            //레벨 1-2
            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            // Scanner는 char 타입으로 입력 받을 수 없다 이유는 보통 입력을 할 때 하나만 입력을 안하니깐...
            //그래서 등장한 것이 바로 charAt()
            // String으로 저장된 문자열 중에서 한 글자만 선택해서 char 타입으로 변환해주는 녀석
            //입력 받은 값 연산 기호를 문자타입으로 변경해서
            char operator = sc.next().charAt(0);
            // ---------------------------------------------------------------------------------------------------------
            //레벨 1-3
            // 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현
            // 기호 부분에 빨간 줄이 떠서 알아보니 문잣값은 앞뒤를 단일 인용 부호 ''로 감싸 주어야 한다. 나는
            // "+"이런 식으로 해서 오류 발생
            // case 안에 break 문이 없다면 조건에 해당여부와 무관하게 남은 case 들이 다 실행
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

            int result getResult();
            //결과 출력
            System.out.println("결과: " + result);
            /* 연산의 결과를 배열에 저장합니다. */
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String intPut = sc.next();
                if (intPut.equals("remove")) {
                    intList.remove(0);
                }  // 가장 먼저 저장된 결과 삭제
            intList.add(result); // 새로운 결과를 추가

            /* 연산의 결과를 배열에 저장합니다. */
            /* index를 증가 시킵니다. */

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String input2 = sc.next();
            if (input2.equals("inquiry")) {
                // 향상된 for문을 사용하여 저장된 연산 결과를 출력
                for (int j : intList) {
                    System.out.println(j);
                }
            }


            // 종료 부분
            System.out.println("더 계산하시겠습니까? 아무거나 입력하면 계속 실행 /exit(종료))");
            String end = sc.next();
            //exit 문자열을 비교할 때 == 대신 equals() 메서드를 사용해야 함
            // 나는 == 이걸 사용해서 계속 오류남 객체의 참조를 비교하기 때문에 문자열 내용이 같은지 확인하지 않음
            if (end.equals("exit")) {
                break;
            }

        }

    }
}

