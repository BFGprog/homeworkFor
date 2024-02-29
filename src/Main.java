public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
//         Задача 1
        System.out.println("\n" + "Task 1.1");
        int accumulation = 15000;
        int total = 0;
        int month = 0;

        while (total <= 2_459_000) {
            month++;
            total = total + accumulation;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей" );
        }

        System.out.println("\n" + "Task 1.2");// c учетом %12 по вкладу
        accumulation = 15000;
        total = 0;
        double percent = 0;
        month = 0;

        while (total <= 2_459_000) {
//            total = total + total / 100;
            month++;
            percent = total * 0.012;
            total = total + (int) (percent);
            total = total + accumulation;

            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей ");
        }


//        // Задача 2
        System.out.println("\n" + "Task 2");
        int number = 0;

        while (number < 10){
            number++;
            System.out.print(number + " ");

        }
        System.out.println("");
        for (int i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }

//        // Задача 3
        System.out.println("\n" + "\n" + "Task 3");
        int population = 12_000_000;
        month = 0;

        while (month < 10) {
            double fertility = 17.0 / 1000 * population;
            double death = 8.0 / 1000 * population;
            month++;
            population = population + (int)(fertility) - (int)(death);
            System.out.println("Год " + month + " численность населения составляет " + population);

        }


//
//        // Задача 4
        System.out.println("\n" + "Task 4");
        accumulation = 15000;
        total = 0;
        percent = 0;
        month = 0;

        while (total <= 12_000_000) {
//            total = total + total / 100;
            month++;
            percent = total * 0.07; //где каждый месяц к сумме его вклада добавляется еще 7%
            total = total + (int) (percent);
            total = total + accumulation;

        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей ");

//        // Задача 5
        System.out.println("\n" + "Task 5");
        total = 0;
        month = 0;

        while (total <= 12_000_000) {
//            total = total + total / 100;
            month++;
            percent = total * 0.07; //где каждый месяц к сумме его вклада добавляется еще 7%
            total = total + (int) (percent);
            total = total + accumulation;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей ");
            }

        }


//        // Задача 6
        System.out.println("\n" + "Task 6");
        total = 0;
        month = 0;

        while (month <= 9 * 12) {
//            total = total + total / 100;
            month++;
            percent = total * 0.07; //где каждый месяц к сумме его вклада добавляется еще 7%
            total = total + (int) (percent);
            total = total + accumulation;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + (total - accumulation * month) + " рублей ");
            }

        }


        // Задача 7
        System.out.println("\n" + "Task 7");

        int friday = 1;
        int dayOfMonth = 1;

        while (dayOfMonth <= 31) {
            dayOfMonth++;
            friday++;
            switch (friday) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Сегодня пятница, " + dayOfMonth + "-е число. " +
                            "Необходимо подготовить отчет");
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    friday = 0;
                    break;
                default:
                    System.out.println("Ошибка");

            }
        }

//        // Задача 8
        System.out.println("\n" + "Task 8");

        int yearStart = 2024 - 200;
        int yearFinish = 2024 + 100;

        while (yearStart <= yearFinish) {
            yearStart++;

            if (yearStart % 79 == 0) {
                System.out.println(yearStart);
            }
        }



    }
}