package lv2;

// MenuItem 클래스 정의


public class MenuItem {
    //속성
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
//객체 지향 개념을 학습하고, 데이터를 구조적으로 관리하며 프로그램을 설계하는 방법을 익힙니다.
//햄버거 메뉴를 `MenuItem` 클래스와 `List`를 통해 관리합니다.
//**`MenuItem` 클래스 생성하기**
//설명 : 개별 음식 항목을 관리하는 클래스입니다. 현재는 햄버거만 관리합니다
//클래스는 `이름`, `가격`, `설명` 필드를 갖습니다.
//`main` 함수에서 `MenuItem` 클래스를 활용하여 햄버거 메뉴를 출력합니다.
//MenuItem` 객체 생성을 통해 `이름`, `가격`, `설명`을 세팅합니다.
//키워드: `new`
//`List`를 선언하여 여러 `MenuItem`을 추가합니다.
//List<MenuItem> menuItems = new ArrayList<>();
//반복문을 활용해 `menuItems`를 탐색하면서 하나씩 접근합니다.