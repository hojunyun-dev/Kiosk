package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShakBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner scanner = new Scanner(System.in);

        while(true) {
            // 메뉴 출력
            System.out.println("[SHACKSHACK MENU]");
            int index = 1;
            for (MenuItem menuItem : menuItems) {
                System.out.print(index + ". ");
                menuItem.printMenuItem();
                index++;
            }
            System.out.println("0을 누르면 종료");

            System.out.println("메뉴의 번호를 입력하세요:");
            int input = scanner.nextInt();

            // 메뉴 선택 및 처리
            if (input == 0) {
                System.out.println("종료하기");
                break;
            } else if (input > 0 && input <= menuItems.size()) {
                MenuItem selectedItem = menuItems.get(input - 1);
                System.out.println("상품 이름:" + selectedItem.getName());
                System.out.println("상품 가격: W " + selectedItem.getPrice());
                System.out.println("상품 설명: " + selectedItem.getDescription());
            } else {
                System.out.println("메뉴의 번호를 잘못입력했습니다.");
            }
        }

        scanner.close();
    }
}
