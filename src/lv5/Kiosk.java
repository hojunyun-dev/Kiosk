package lv5;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHACK SHACK MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getName());
            }
            System.out.println("0. 종료");

            System.out.print("카테고리를 선택하세요: ");
            int menuInput = scanner.nextInt();

            if (menuInput == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (menuInput > 0 && menuInput <= menus.size()) {
                Menu selectedMenu = menus.get(menuInput - 1);
                System.out.println("[" + selectedMenu.getName() + "]");
                selectedMenu.printMenuItems();

                System.out.print("원하는 메뉴 번호를 선택하세요: ");
                int itemInput = scanner.nextInt();

                if (itemInput > 0 && itemInput <= selectedMenu.getMenuItems().size()) {
                    MenuItem selectedItem = selectedMenu.getMenuItems().get(itemInput - 1);
                    System.out.println("상품 이름: " + selectedItem.getName());
                    System.out.println("상품 가격: W " + selectedItem.getPrice());
                    System.out.println("상품 설명: " + selectedItem.getDescription());
                } else {
                    System.out.println("잘못된 메뉴 번호입니다.");
                }
            } else {
                System.out.println("잘못된 카테고리 번호입니다.");
            }
        }

        scanner.close();
    }
}
