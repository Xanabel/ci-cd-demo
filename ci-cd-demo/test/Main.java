//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainTest {
    public static void main(String[] args) {
        if (Main.add(2, 3) == 5) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
            System.exit(1);
        }
    }
}