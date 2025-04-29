package lv1;

//입력 처리와 간단한 흐름 제어를 복습합니다. (프로그래밍 검증**)**
//`Scanner` 활용법, 조건문, 반복문을 재확인하며 입력 데이터를 처리하는 방법 강화

//`Scanner`를 사용하여 여러 햄버거 메뉴를 출력합니다.
//제시된 메뉴 중 입력받은 숫자에 따라 다른 로직을 실행하는 코드를 작성합니다.
//반복문을 이용해서 특정 번호가 입력되면 프로그램을 종료합니다.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("[SHACKSHACK MENU");
            System.out.println("ShakBurger | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("CheeseBurger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("HamBurger | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0을 누르면 종료");



            System.out.println("메뉴의 번호를 입력하세요:");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("ShakBuger를 선택하셨습니다.");
                    break;
                case 2:
                    System.out.println("SmokeShack을 선택하셨습니다.");
                    break;
                case 3:
                    System.out.println("CheeseBurger를 선택하셨습니다.");
                    break;
                case 4:
                    System.out.println("HamBuger를 선택하셨습니다.");
                    break;
                case 0:
                    System.out.println("종료하기");
                    break;
                default:
                    System.out.println("메뉴의 번호를 잘못입력했습니다.");

            }
            if(input == 0) {
                break;
            }


        }
        scanner.close();

    }
}
