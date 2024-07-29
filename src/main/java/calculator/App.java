package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Calculator 인스턴스 생성
        Calculator calculator = new Calculator();
        // ArrayList 배열 생선 선언
        ArrayList<Integer> intList = new ArrayList<Integer>();
        //새로운 객체를 스캐너타입의 sc 변수안에 할당
        Scanner sc = new Scanner(System.in);
        while (true) {
            /* 입력 부분 */
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            // 연산 및 결과 출력
            int result = Calculator.calculate(num1, num2, operator);
            // 이 부분은 Calculator.calculate = num1, num2, operator; 이렇게는 안되는가요?
            //외부에서 가져온거는 도트 연산자를 사용한다고 해서...


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

