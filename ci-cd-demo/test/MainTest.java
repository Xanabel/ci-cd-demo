public class MainTest {
    public static void main(String[] args) {
        boolean allPassed = true;

        if (Main.add(2, 3) != 5) {
            System.out.println("Test add() failed");
            allPassed = false;
        }

        if (!Main.isEven(4)) {
            System.out.println("Test isEven(4) failed");
            allPassed = false;
        }

        if (Main.isEven(5)) {
            System.out.println("Test isEven(5) failed");
            allPassed = false;
        }

        if (allPassed) {
            System.out.println("All tests passed!");
        } else {
            System.exit(1); // Завершаем с ошибкой, чтобы CI понял, что тесты не прошли
        }
    }
}
