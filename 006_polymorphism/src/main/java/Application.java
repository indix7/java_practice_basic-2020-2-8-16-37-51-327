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
        softWare.pressF5();
    }
}
