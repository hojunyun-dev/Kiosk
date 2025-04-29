package lv4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    public void start(Menu... menus) {

        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("[SHACKSHACK KIOSK MENU]");
            for (int i = 0; i < menus.length; i++) {
                System.out.println((i + 1) + ". " + menus[i].getCategoryName());
            }
            System.out.println("0. 종료");

            System.out.print("메뉴 번호를 입력하세요: ");
            int menuChoice = scanner.nextInt();

            if (menuChoice == 0) {
                System.out.println("프로그램 종료");
                break;
            } else if (menuChoice > 0 && menuChoice <= menus.length) {
                Menu selectedMenu = menus[menuChoice - 1];

                while (true) {
                    List<MenuItem> items = selectedMenu.getMenuItems();
                    System.out.println("[" + selectedMenu.getCategoryName() + "] 메뉴:");
                    for (int i = 0; i < items.size(); i++) {
                        System.out.println((i + 1) + ". " + items.get(i).getName() + " | W " + items.get(i).getPrice() + " | " + items.get(i).getDescription());
                    }

                    System.out.print("선택할 메뉴 번호를 입력하세요 (0을 눌러 돌아가기): ");
                    int itemChoice = scanner.nextInt();
                    if (itemChoice == 0) {
                        break;
                    } else if (itemChoice > 0 && itemChoice <= items.size()) {
                        MenuItem selectedItem = items.get(itemChoice - 1);
                        System.out.println("상품 이름: " + selectedItem.getName());
                        System.out.println("상품 가격: W " + selectedItem.getPrice());
                        System.out.println("상품 설명: " + selectedItem.getDescription());
                    } else {
                        System.out.println("잘못된 번호입니다.");
                    }
                }
            } else {
                System.out.println("잘못된 메뉴 번호입니다.");
            }
        }
        scanner.close();
    }
}

