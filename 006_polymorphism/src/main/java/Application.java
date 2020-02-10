public class Application {
    public static void main(String[] args) {
        checkPressF5();
    }

    public static void checkPressF5 () {
        pressF5(new Intellij());
        pressF5(new Chrome());
        pressF5(new Wechat());
    }
    public static void pressF5 (SoftWare softWare) {
        System.out.println("====================");
        if (softWare instanceof Intellij) {
            System.out.println("Intellij");
        }
        if (softWare instanceof Chrome) {
            System.out.println("Chrome");
        }
        if (softWare instanceof Wechat) {
            System.out.println("Wechat");
        }
        softWare.pressF5();
    }
}
