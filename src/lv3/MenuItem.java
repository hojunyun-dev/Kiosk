package lv3;

// MenuItem 클래스 정의
public class MenuItem {
    private String name;
    private double price;
    private String description;

    // 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // getter 메서드
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // 메뉴 항목 정보 출력
    public void printMenuItem() {
        System.out.println(name + " | W " + price + " | " + description);
    }
}