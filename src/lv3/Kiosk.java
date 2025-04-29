package lv3;

import java.util.Scanner;
import java.util.List;

public class Kiosk {
    private List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
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
                System.out.println("상품 이름: " + selectedItem.getName());
                System.out.println("상품 가격: W " + selectedItem.getPrice());
                System.out.println("상품 설명: " + selectedItem.getDescription());
            } else {
                System.out.println("메뉴의 번호를 잘못입력했습니다.");
            }
        }

        scanner.close();
    }
}