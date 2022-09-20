public class Main {
    public static void main(String[] args) {
        // Циклы, урок 2 task1
        System.out.println("Циклы, урок 2 task1");
        int salary = 29000;
        int totalSum = 0;
        int i = 0;
        while (totalSum <= 2_459_000) {
            totalSum += totalSum / 100; // 1%
            totalSum += salary;
            i++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей \n", i, totalSum);

        }
        // Циклы, урок 2 task2
        System.out.println("Циклы, урок 2 task2");


        int a = 0;
        for (i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int c = 10;
        while (c > 0) {
            System.out.print(c + " ");
            c--;
        }
        System.out.println();
        // Циклы, урок 2 task3
        System.out.println("Циклы, урок 2 task3");

        int population = 12_000_000;
        float deathRate = (float) 8 / 1000;
        float birthRate = (float) 17 / 1000;
        for (i = 1; i <= 12; i++) {
            population = population + Math.round(population * birthRate) - Math.round(population * deathRate);
            System.out.println("Year - " + i + " Poulation: " + population);
        }

        System.out.println();

// Циклы, урок 2 task4
        System.out.println("Циклы, урок 2 task4");

        int sumOfVasya = 15000;
        int totalSumOfVasya = 0;
        int month = 1;

        while (totalSumOfVasya <= 12_000_000) {
            sumOfVasya = sumOfVasya + (sumOfVasya * 7) / 100;
            totalSumOfVasya += sumOfVasya;
            System.out.println("Месяцев " + month + "  сумма накоплений равна " + totalSumOfVasya + " рублей");
            month++;
        }
        // Циклы, урок 2 task5
        System.out.println("Циклы, урок 2 task5");
        int sumOfVasya1 = 15000;
        int totalSumOfVasya1 = 0;
        int k = 1;
        for (; totalSumOfVasya1 <= 12_000_000; k++) {
            sumOfVasya1 = sumOfVasya1 + (sumOfVasya1 * 7) / 100;
            totalSumOfVasya1 += sumOfVasya1;
            if (k % 6 == 0) {
                System.out.println("Месяц " + k + "  сумма накоплений равна " + totalSumOfVasya1 + " рублей");

            }
        }

        // Циклы, урок 2 task6
        System.out.println("Циклы, урок 2 task6");
        int totalSumOfVasya4 = 15000;
        int allMonthes1 = 108;
        int m = 1;
        for (; m <= 108; m++) {
            totalSumOfVasya4 += (totalSumOfVasya4 * 7) / 100;
            if (m % 6 == 0) {
                System.out.println(" Month " + m + "  сумма накоплений равна " + totalSumOfVasya4 + " рублей");
            }
        }

                // циклы, урок 2  task 7;
                System.out.println("циклы, урок 2, task 7");

                int d = 5;
                for (; d <= 31; d++) {
                    if (d % 7 == 0) {
                        System.out.println("Сегодня пятница " + d + " - е число. Необходимо сдать отчет");

                    }
                }
// циклы, урок 2  task 8;
        System.out.println("циклы, урок 2, task 8");
                int currentYear = 2022;
                int beginning = currentYear - 200;
                int ending = currentYear + 100;
                for (int z = beginning; z < ending; z++){
                    if (z % 79 == 0){
                        System.out.println(z);
                    }
                }


        // циклы, урок 2  task 9;
        System.out.println("циклы, урок 2, task 9");

int l = 2;
int j = 1;
        for (; j <=10; j++) {

                System.out.print(l + " * " + j + " = " + (j*l));
                System.out.println();


            }

        }


    }
