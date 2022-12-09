package sem1;
/**
 * Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
 * если да – вернуть true, в противном случае – false.
 */
public class task1 {
    public static void main(String[] args) {
        System.out.println(doOne(5, 8));
        doTwo(-7);
        System.out.println(doThree(-1));
        doFive(2016);
    }

    /**
     * 1. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
     * в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
     */
    static boolean doOne(int a, int b) {
        System.out.println("\nЗадание 1.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    /**
     * 2 Написать метод, которому в качестве параметра передается целое число, метод должен
     * напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
     * считаем положительным числом.
     */
    static void doTwo(int a) {
        System.out.println("\nЗадание 2.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    /**
     * 3. Написать метод, которому в качестве параметра передается целое число, метод должен
     * вернуть true, если число отрицательное и вернуть false если положительное.;
     */
    static boolean doThree(int a) {
        System.out.println("\nЗадание 3.");
        if (a < 0) return true;
        return false;
    }
    /**
     * 5. * Написать метод, который определяет является ли год високосным, и выводит сообщение
     * в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й
     * – високосный.
     */
    static void doFive(int year) {
        System.out.println("\nЗадание 5.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
    /** Задать целочисленный массив, состоящий из элементов 0 и 1.
     *   Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static int[] doSix(int[] array){
        System.out.println("\nЗадание 6.");
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i] == 0)? 1 : 0;
        }
        return array;
    }
    /** 7 Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    */
    public static void createArr(int[] array, int step, int shift){
        for(int i = 0; i < 100; i ++){
            array[i] = shift + i * step;
        }
    }
    /** 8 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     *
     */
    public static void modifierForArrayes(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6){
                array[i] *= 2;
            }
        }
    }

    /** Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     *   и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
     *  то есть [0][0], [1][1], [2][2], …, [n][n];
      */
    public static void createSquareArray(int size){
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }




}


