public class MainClass {

    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {

        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte primitiv1 = -12;
        short primitiv2 = 32767;
        int primitiv3 = 2147483647;
        long primitiv4 = 9223372036854775807L;
        float primitiv5 = 15.3f;
        double primitiv6 = 15.3;
        char primitiv7 = 'a';
        boolean primitiv8 = true;

        String mytext = "Vasia";

        System.out.println(task3(1,2,3,4));
        System.out.println(task4(5,15));
        task5(-10);
        System.out.println(task6(-10));
        task7(mytext);
        task8(400);
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static float task3 (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean task4 (int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void task5 (int a) {
        if(a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean task6 (int a) {
        return a < 0;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void task7 (String name) {
        System.out.println("«Привет, " + name + "!»");
    }

    //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void task8 (int year) {
        if(task8_2(year)) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год не высокосный");
        }
    }

    //По желанию преподавателя разбил предыдущий метод на 2
    public static boolean task8_2 (int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
