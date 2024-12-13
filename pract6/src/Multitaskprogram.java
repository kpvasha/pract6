import java.util.Random;
import java.util.Scanner;

public class Multitaskprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Задача 1: Генерація масиву, підрахунок парних і непарних чисел
        System.out.println("Задача 1: Генерація масиву випадкових чисел.");
        int[] array1 = new int[10];
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100); // Числа від 0 до 99
            if (array1[i] % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println("Парних чисел: " + evenCount);
        System.out.println("Непарних чисел: " + oddCount);

        // Задача 2: Перевірка багатокутника за сумою кутів
        System.out.println("\nЗадача 2: Перевірка багатокутника.");
        System.out.println("Введіть кількість кутів багатокутника:");
        int n = scanner.nextInt();
        int[] angles = new int[n];
        int sum = 0;

        System.out.println("Введіть кути багатокутника:");
        for (int i = 0; i < n; i++) {
            angles[i] = scanner.nextInt();
            sum += angles[i];
        }
        if (sum == 180 * (n - 2)) {
            System.out.println("Багатокутник може існувати.");
        } else {
            System.out.println("Багатокутник не може існувати.");
        }

        // Задача 3: Заміна елемента в масиві
        System.out.println("\nЗадача 3: Заміна елемента в масиві.");
        System.out.println("Введіть розмір масиву:");
        int size = scanner.nextInt();
        int[] array2 = new int[size];

        for (int i = 0; i < size; i++) {
            array2[i] = random.nextInt(50); // Числа від 0 до 49
            System.out.print(array2[i] + " ");
        }
        System.out.println("\nВведіть значення для пошуку:");
        int target = scanner.nextInt();
        System.out.println("Введіть нове значення:");
        int replacement = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (array2[i] == target) {
                array2[i] = replacement;
            }
        }
        System.out.println("Оновлений масив:");
        for (int num : array2) System.out.print(num + " ");

        // Задача 4: Таблиця синусів
        System.out.println("\n\nЗадача 4: Таблиця синусів.");
        System.out.println("Синуси від 0 до 90 градусів:");
        for (int i = 0; i <= 90; i++) {
            System.out.printf("%.2f ", Math.sin(Math.toRadians(i)));
            if (i % 10 == 0 && i != 0) System.out.println();
        }

        // Задача 5: Перевірка масиву на зростання/спадання
        System.out.println("\nЗадача 5: Перевірка масиву на зростання або спадання.");
        System.out.println("Введіть розмір масиву:");
        int size2 = scanner.nextInt();
        int[] array3 = new int[size2];

        System.out.println("Введіть '1' для перевірки на зростання або '2' для перевірки на спадання:");
        int choice = scanner.nextInt();

        for (int i = 0; i < size2; i++) {
            array3[i] = random.nextInt(100);
            System.out.print(array3[i] + " ");
        }

        boolean isSorted = true;
        for (int i = 1; i < size2; i++) {
            if (choice == 1 && array3[i] < array3[i - 1]) {
                isSorted = false;
                break;
            } else if (choice == 2 && array3[i] > array3[i - 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("\nМасив " + (isSorted ? "відповідає" : "не відповідає") + " умові.");
    }
}