public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        // Задача 1
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Задача 2
        System.out.println("\n" + "Task 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Задача 3
        System.out.println("\n" + "Task 3");
        for (int i = 2; i <= 17; i += 2) {
            System.out.println(i);
        }

        // Задача 4
        System.out.println("\n" + "Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Задача 5
        System.out.println("\n" + "Task 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        // Задача 6
        System.out.println("\n" + "Task 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);

        }


        // Задача 7
        System.out.println("\n" + "Task 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        // Задача 8
        System.out.println("\n" + "Task 8");
        int accumulation = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей" );
        }


        // Задача 9
        System.out.println("\n" + "Task 9");
        accumulation = 29000;
        total = 0;
        double percent = 0;

        for (int i = 1; i <= 12; i++) {
//            total = total + total / 100;
            percent = total * 0.012;
            total = total + (int) (percent);
            total = total + accumulation;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей ");
        }


        // Задача 10
        System.out.println("\n" + "Task 10");
        //2*1=2
        //2*2=4
        //2*3=6
        for (int i = 1; i <= 10; i++) {

            System.out.println("2*" + i + "=" + 2 * i);
            

        }

    }
}