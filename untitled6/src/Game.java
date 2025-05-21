import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        String playername = scanner.next();
        System.out.println("Введите второго  игрока");
        String playername2 = scanner.next();
        System.out.println("Игра в крестики нолики началась");
        char[][] arr = {
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'}
        };
        System.out.println("  ");
        for (int i = 0; i <= arr[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Первый игрок выбирает значение для хода");
        String significance1 = scanner.next();
        System.out.println("Второй игрок выбирает значение для хода");
        String significance2 = scanner.next();
        char cross = 'X';
        char zero = 'O';

        while (true) {
            System.out.println("Введите кординаты вашего хода");
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            arr[x][y] = cross;
            System.out.println("Ваши кординаты " + x + " " + y);

            int a, b;
            System.out.println("Введите кординаты вашего хода");
            a = scanner.nextInt();
            b = scanner.nextInt();
            arr[a][b] = zero;
            System.out.println("Ваши кординаты " + a + " " + b);
            System.out.println("  ");
            for (int i = 0; i <= arr[0].length; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

                    }
                }
            }







