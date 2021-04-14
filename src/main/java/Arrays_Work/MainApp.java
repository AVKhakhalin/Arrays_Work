package Arrays_Work;

import java.util.Arrays;
import java.util.Random;

public class MainApp
{
    public static final int NUMBER_ARRAYS_ELEMENTS = 15;
    public static final int NUMBER_ELEMENTS = 400;
    public static long curTime;
    public static int counter1;
    public static int counter2;
    public static int counter3;
    static Random random = new Random();

    public static void main(String[] args)
    {

        //region Решение домашнего задания 2.1
        System.out.println("\nРЕШЕНИЕ ДОМАШНЕГО ЗАДАНИЯ 2.1:\n");
        /*
        Задание 2.1
        На основе программного кода из домашнего задания №1 реализуйте массив на основе существующих примитивных или ссылочных типов данных.
        Выполните обращение к массиву и базовые операции класса Arrays.
        Оценить выполненные методы с помощью базового класса System.nanoTime().
        */

        int[] array_int1 = new int[NUMBER_ARRAYS_ELEMENTS];
        Integer[] array_int2 = new Integer[NUMBER_ARRAYS_ELEMENTS];
        int[] array_int1_toCopy;
        Integer[] array_int2_toCopy;
        String[] array_string = new String[NUMBER_ARRAYS_ELEMENTS];
        String[] array_string_toCopy;

        int randomInt;
        for (counter1 = 0; counter1 < NUMBER_ARRAYS_ELEMENTS; counter1++)
        {
            randomInt = random.nextInt(NUMBER_ARRAYS_ELEMENTS);
            array_int1[counter1] = randomInt;
            array_int2[counter1] = randomInt;
            array_string[counter1] = String.valueOf(randomInt);
        }

        System.out.print("Массив array_int1: [");
        for (counter1 = 0; counter1 < array_int1.length; counter1++)
        {
            System.out.print(array_int1[counter1] + (counter1 < array_int1.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        curTime = System.nanoTime();
        array_int1_toCopy = Arrays.copyOf(array_int1, array_int1.length);
        System.out.println("Копирование массива array_int1 в array_int1_toCopy заняло " + (System.nanoTime() - curTime) + " нс.");
        System.out.println("Массив array_int1_toCopy: " + Arrays.toString(array_int1_toCopy));
        System.out.println("Сравнение массивов array_int1 и array_int1_toCopy = " + Arrays.equals(array_int1, array_int1_toCopy));
        Arrays.sort(array_int1_toCopy);
        System.out.println("Сортированный массив array_int1_toCopy: " + Arrays.toString(array_int1_toCopy) + "\n");

        System.out.print("Массив array_int2: [");
        for (counter1 = 0; counter1 < array_int2.length; counter1++)
        {
            System.out.print(array_int2[counter1] + (counter1 < array_int2.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        curTime = System.nanoTime();
        array_int2_toCopy = Arrays.copyOf(array_int2, array_int2.length);
        System.out.println("Копирование массива array_int2 в array_int2_toCopy заняло " + (System.nanoTime() - curTime) + " нс.");
        System.out.println("Массив array_int2_toCopy: " + Arrays.toString(array_int2_toCopy));
        System.out.println("Сравнение массивов array_int2 и array_int2_toCopy = " + Arrays.equals(array_int2, array_int2_toCopy));
        Arrays.sort(array_int2_toCopy);
        System.out.println("Сортированный массив array_int2_toCopy: " + Arrays.toString(array_int2_toCopy) + "\n");

        System.out.print("Массив array_string: [");
        for (counter1 = 0; counter1 < array_string.length; counter1++)
        {
            System.out.print(array_string[counter1] + (counter1 < array_string.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        curTime = System.nanoTime();
        array_string_toCopy = Arrays.copyOf(array_string, array_string.length);
        System.out.println("Копирование массива array_string в array_string_toCopy заняло " + (System.nanoTime() - curTime) + " нс.");
        System.out.println("Массив array_string_toCopy: " + Arrays.toString(array_string_toCopy));
        System.out.println("Сравнение массивов array_string и array_string_toCopy = " + Arrays.equals(array_string, array_string_toCopy));
        for (counter1 = 0; counter1 < array_string_toCopy.length; counter1++)
        {
            array_string_toCopy[counter1] = String.valueOf(array_int2_toCopy[counter1]);
        }
        System.out.println("Сортированный массив array_string_toCopy: " + Arrays.toString(array_string_toCopy) + "\n");
        //endregion

        //region Решение домашнего задания 2.2
        System.out.println("\nРЕШЕНИЕ ДОМАШНЕГО ЗАДАНИЯ 2.2:\n");
        /*
        Задание 2.2
        На основе написанного кода в задании 2.1 реализуйте линейный и двоичный поиск.
        Оценить алгоритмы линейного и двоичного поиска с помощью базового класса System.nanoTime(), при необходимости расширьте уже существующий массив данных.
        */

        //region Реализация линейного поиска
        System.out.println("РЕАЛИЗАЦИЯ ЛИНЕЙНОГО ПОИСКА:");
        int numberToSearch = random.nextInt(NUMBER_ARRAYS_ELEMENTS);
        curTime = System.nanoTime();
        for (counter1 = 0; counter1 < array_int1_toCopy.length; counter1++)
        {
            if (array_int1_toCopy[counter1] == array_int1_toCopy[numberToSearch])
            {
                System.out.println("В массиве " + Arrays.toString(array_int1_toCopy) + "\nнайдено искомое число " + array_int1_toCopy[numberToSearch] + " на позиции " + counter1 + " за " + (System.nanoTime() - curTime) + " нс.");
                break;
            }
        }

        curTime = System.nanoTime();
        for (counter1 = 0; counter1 < array_int2_toCopy.length; counter1++)
        {
            if (array_int2_toCopy[counter1] == array_int2_toCopy[numberToSearch])
            {
                System.out.println("В массиве " + Arrays.toString(array_int2_toCopy) + "\nнайдено искомое число " + array_int2_toCopy[numberToSearch] + " на позиции " + counter1 + " за " + (System.nanoTime() - curTime) + " нс.");
                break;
            }
        }

        curTime = System.nanoTime();
        for (counter1 = 0; counter1 < array_string_toCopy.length; counter1++)
        {
            if (array_string_toCopy[counter1].equals(array_string_toCopy[numberToSearch]) == true)
            {
                System.out.println("В массиве " + Arrays.toString(array_string_toCopy) + "\nнайдено искомое число " + array_string_toCopy[numberToSearch] + " на позиции " + counter1 + " за " + (System.nanoTime() - curTime) + " нс.");
                break;
            }
        }
        System.out.println();
        //endregion

        //region Реализация двоичного поиска
        System.out.println("РЕАЛИЗАЦИЯ ДВОИЧНОГО ПОИСКА:");
        curTime = System.nanoTime();
        boolean findedNumber = false;
        int firstPos = 0;
        int lastPos = array_int1_toCopy.length - 1;
        int tempMiddle;
        while(findedNumber == false)
        {
            tempMiddle = (lastPos + firstPos) / 2;
            if (array_int1_toCopy[numberToSearch] == array_int1_toCopy[tempMiddle])
            {
                System.out.println("В массиве типа int " + Arrays.toString(array_int1_toCopy) + "\nнайдено искомое число " + array_int1_toCopy[numberToSearch] + " на позиции " + counter1 + " за " + (System.nanoTime() - curTime) + " нс.");
                break;
            }
            else if (array_int1_toCopy[numberToSearch] > array_int1_toCopy[tempMiddle])
            {
                firstPos = tempMiddle + 1;
            }
            else if (array_int1_toCopy[numberToSearch] < array_int1_toCopy[tempMiddle])
            {
                lastPos = tempMiddle - 1;
            }
        }

        curTime = System.nanoTime();
        firstPos = 0;
        lastPos = array_int2_toCopy.length - 1;
        findedNumber = false;
        while(findedNumber == false)
        {
            tempMiddle = (lastPos + firstPos) / 2;
            if (array_int2_toCopy[numberToSearch] == array_int2_toCopy[tempMiddle])
            {
                System.out.println("В массиве типа Integer " + Arrays.toString(array_int2_toCopy) + "\nнайдено искомое число " + array_int2_toCopy[numberToSearch] + " на позиции " + counter1 + " за " + (System.nanoTime() - curTime) + " нс.");
                break;
            }
            else if (array_int2_toCopy[numberToSearch] > array_int2_toCopy[tempMiddle])
            {
                firstPos = tempMiddle + 1;
            }
            else if (array_int2_toCopy[numberToSearch] < array_int2_toCopy[tempMiddle])
            {
                lastPos = tempMiddle - 1;
            }
        }

        curTime = System.nanoTime();
        firstPos = 0;
        lastPos = array_string_toCopy.length - 1;
        findedNumber = false;
        while(findedNumber == false)
        {
            tempMiddle = (lastPos + firstPos) / 2;
            if (array_string_toCopy[numberToSearch].equals(array_string_toCopy[tempMiddle]) == true)
            {
                System.out.println("В массиве типа String " + Arrays.toString(array_string_toCopy) + "\nнайдено искомое число " + array_string_toCopy[numberToSearch] + " на позиции " + counter1 + " за " + (System.nanoTime() - curTime) + " нс.");
                break;
            }
            else if (Integer.parseInt(array_string_toCopy[numberToSearch]) > Integer.parseInt(array_string_toCopy[tempMiddle]))
            {
                firstPos = tempMiddle + 1;
            }
            else if (Integer.parseInt(array_string_toCopy[numberToSearch]) < Integer.parseInt(array_string_toCopy[tempMiddle]))
            {
                lastPos = tempMiddle - 1;
            }
        }
        System.out.println();
        //endregion

        //endregion

        //region Решение домашнего задания 2.3
        System.out.println("\nРЕШЕНИЕ ДОМАШНЕГО ЗАДАНИЯ 2.3:\n");
        /*
        Задание 2.3
        Создайте массив размером 400 элементов.
        Выполните сортировку с помощью метода sort().
        Оцените сортировку с помощью базового класса System.nanoTime().
        */

        int[] newArray_int_400 = new int[NUMBER_ELEMENTS];
        Integer[] newArray_Integer_400 = new Integer[NUMBER_ELEMENTS];
        for (counter1 = 0; counter1 < NUMBER_ELEMENTS; counter1++)
        {
            randomInt = random.nextInt(NUMBER_ELEMENTS);
            newArray_int_400[counter1] = randomInt;
            newArray_Integer_400[counter1] = randomInt;
        }

        int[] newArray_int_400_toSort1 = Arrays.copyOf(newArray_int_400, newArray_int_400.length);
        Integer[] newArray_Integer_400_toSort1 = Arrays.copyOf(newArray_Integer_400, newArray_Integer_400.length);

        curTime = System.nanoTime();
        Arrays.sort(newArray_int_400_toSort1);
        System.out.println("Сортировка массива типа int из 400 элементов заняла " + (System.nanoTime() - curTime) + " нс.\n");

        curTime = System.nanoTime();
        Arrays.sort(newArray_Integer_400_toSort1);
        System.out.println("Сортировка массива типа Integer из 400 элементов заняла " + (System.nanoTime() - curTime) + " нс.\n");
        //endregion

        //region Решение домашнего задания 2.4
        System.out.println("\nРЕШЕНИЕ ДОМАШНЕГО ЗАДАНИЯ 2.4:\n");
        /*
        Задание 2.4
        На основе существующего массива данных из задания 2.3 реализуйте алгоритм сортировки пузырьком.
        Оцените сортировку с помощью базового класса System.nanoTime().
        Сравните время выполнения алгоритма сортировки методом sort() из задания 2.1 и сортировку пузырьком.
        */

        int[] newArray_int_400_toSort2 = Arrays.copyOf(newArray_int_400, newArray_int_400.length);
        Integer[] newArray_Integer_400_toSort2 = Arrays.copyOf(newArray_Integer_400, newArray_Integer_400.length);

        int[] newArray_int_400_toCheck1 = Arrays.copyOf(newArray_int_400, newArray_int_400.length);
        Integer[] newArray_Integer_400_toCheck1 = Arrays.copyOf(newArray_Integer_400, newArray_Integer_400.length);

        curTime = System.nanoTime();
        int tempInt;
        for (counter1 = newArray_int_400_toSort2.length - 1; counter1 > 0; counter1--)
        {
            for (counter2 = 1; counter2 <= counter1; counter2++)
            {
                if (newArray_int_400_toSort2[counter2] < newArray_int_400_toSort2[counter2 - 1])
                {
                    tempInt = newArray_int_400_toSort2[counter2];
                    newArray_int_400_toSort2[counter2] = newArray_int_400_toSort2[counter2 - 1];
                    newArray_int_400_toSort2[counter2 - 1] = tempInt;
                }
            }
        }
        System.out.println("Сортировка массива типа int из 400 элементов МЕТОДОМ ПУЗЫРЬКА заняла " + (System.nanoTime() - curTime) + " нс.");
        System.out.println("       Исходный массив: " + Arrays.toString(newArray_int_400));
        System.out.println("Отсортированный массив: " + Arrays.toString(newArray_int_400_toSort2));
        System.out.println();

        curTime = System.nanoTime();
        Integer tempInteger;
        for (counter1 = newArray_Integer_400_toSort2.length - 1; counter1 > 0; counter1--)
        {
            for (counter2 = 1; counter2 <= counter1; counter2++)
            {
                if (newArray_Integer_400_toSort2[counter2] < newArray_Integer_400_toSort2[counter2 - 1])
                {
                    tempInteger = newArray_Integer_400_toSort2[counter2];
                    newArray_Integer_400_toSort2[counter2] = newArray_Integer_400_toSort2[counter2 - 1];
                    newArray_Integer_400_toSort2[counter2 - 1] = tempInteger;
                }
            }
        }
        System.out.println("Сортировка массива типа int из 400 элементов МЕТОДОМ ПУЗЫРЬКА заняла " + (System.nanoTime() - curTime) + " нс.");
        System.out.println("       Исходный массив: " + Arrays.toString(newArray_Integer_400));
        System.out.println("Отсортированный массив: " + Arrays.toString(newArray_Integer_400_toSort2));
        System.out.println();

        curTime = System.nanoTime();
        Arrays.sort(newArray_int_400_toCheck1);
        System.out.println("Сортировка массива типа int из 400 элементов СТАНДАРТНЫМ МЕТОДОМ заняла " + (System.nanoTime() - curTime) + " нс.");
        System.out.println("       Исходный массив: " + Arrays.toString(newArray_int_400));
        System.out.println("Отсортированный массив: " + Arrays.toString(newArray_int_400_toCheck1));
        System.out.println();

        curTime = System.nanoTime();
        Arrays.sort(newArray_Integer_400_toCheck1);
        System.out.println("Сортировка массива типа Integer из 400 элементов СТАНДАРТНЫМ МЕТОДОМ заняла " + (System.nanoTime() - curTime) + " нс.");
        System.out.println("       Исходный массив: " + Arrays.toString(newArray_Integer_400));
        System.out.println("Отсортированный массив: " + Arrays.toString(newArray_Integer_400_toCheck1));
        System.out.println();

        System.out.println("СРАВНЕНИЕ (коэффициент доверия 0,95):");
        System.out.println("Среднее время для сортировки массива типа int из 400 элементов МЕТОДОМ ПУЗЫРЬКА     = 59305309+-10474124 нс (среднее время стандартным методом = 183928+-7790 нс).");
        System.out.println("Среднее время для сортировка массива типа Integer из 400 элементов МЕТОДОМ ПУЗЫРЬКА = 10190004+- 7742195 нс (среднее время стандартным методом = 475711+-75284 нс).");
        System.out.println();
        //endregion

        //region Решение домашнего задания 2.5
        System.out.println("\nРЕШЕНИЕ ДОМАШНЕГО ЗАДАНИЯ 2.5:\n");
        /*
        Задание 2.5
        На основе массива данных из задания 2.3 реализуйте алгоритм сортировки методом выбора.
        Оцените сортировку с помощью базового класса System.nanoTime().
        Сравните с временем выполнения алгоритмов сортировки из прошлых заданий 2.3 и 2.4.
        */

        int[] newArray_int_400_toSort3 = Arrays.copyOf(newArray_int_400, newArray_int_400.length);
        Integer[] newArray_Integer_400_toSort3 = Arrays.copyOf(newArray_Integer_400, newArray_Integer_400.length);

        curTime = System.nanoTime();
        int minNumber_int;
        for (counter1 = 0; counter1 < newArray_int_400_toSort3.length; counter1++)
        {
             minNumber_int = newArray_int_400_toSort3[counter1];
             firstPos = counter1;
            for (counter2 = counter1; counter2 < newArray_int_400_toSort3.length; counter2++)
            {
                if (minNumber_int > newArray_int_400_toSort3[counter2])
                {
                    firstPos = counter2;
                    minNumber_int = newArray_int_400_toSort3[counter2];
                }
            }
            tempInt = newArray_int_400_toSort3[counter1];
            newArray_int_400_toSort3[counter1] = minNumber_int;
            newArray_int_400_toSort3[firstPos] = tempInt;
        }
        System.out.println("Сортировка массива типа int из 400 элементов МЕТОДОМ ВЫБОРА заняла " + (System.nanoTime() - curTime) + " нс.");
        System.out.println("       Исходный массив: " + Arrays.toString(newArray_int_400));
        System.out.println("Отсортированный массив: " + Arrays.toString(newArray_int_400_toSort3));
        System.out.println();

        curTime = System.nanoTime();
        Integer minNumber_Integer;
        for (counter1 = 0; counter1 < newArray_Integer_400_toSort3.length; counter1++)
        {
            minNumber_Integer = newArray_Integer_400_toSort3[counter1];
            firstPos = counter1;
            for (counter2 = counter1; counter2 < newArray_Integer_400_toSort3.length; counter2++)
            {
                if (minNumber_Integer > newArray_Integer_400_toSort3[counter2])
                {
                    firstPos = counter2;
                    minNumber_Integer = newArray_Integer_400_toSort3[counter2];
                }
            }
            tempInt = newArray_Integer_400_toSort3[counter1];
            newArray_Integer_400_toSort3[counter1] = minNumber_Integer;
            newArray_Integer_400_toSort3[firstPos] = tempInt;
        }
        System.out.println("Сортировка массива типа int из 400 элементов МЕТОДОМ ВЫБОРА заняла " + (System.nanoTime() - curTime) + " нс.");
        System.out.println("       Исходный массив: " + Arrays.toString(newArray_Integer_400));
        System.out.println("Отсортированный массив: " + Arrays.toString(newArray_Integer_400_toSort3));
        System.out.println();

        System.out.println("СРАВНЕНИЕ (коэффициент доверия 0,95):");
        System.out.println("Среднее время для сортировки массива типа int из 400 элементов МЕТОДОМ ВЫБОРА       = 574014  +-  174116 нс (среднее время стандартным методом = 183928+- 7790 нс).");
        System.out.println("Среднее время для сортировка массива типа Integer из 400 элементов МЕТОДОМ ВЫБОРА   = 906050  +-  444065 нс (среднее время стандартным методом = 475711+-75284 нс).");
        System.out.println("Среднее время для сортировки массива типа int из 400 элементов МЕТОДОМ ПУЗЫРЬКА     = 59305309+-10474124 нс (среднее время стандартным методом = 183928+- 7790 нс).");
        System.out.println("Среднее время для сортировка массива типа Integer из 400 элементов МЕТОДОМ ПУЗЫРЬКА = 10190004+- 7742195 нс (среднее время стандартным методом = 475711+-75284 нс).");
        System.out.println();
        //endregion

        //region Решение домашнего задания 2.6
        System.out.println("\nРЕШЕНИЕ ДОМАШНЕГО ЗАДАНИЯ 2.6:\n");
        /*
        Задание 2.6
        На основе массива данных из задания 2.3 реализуйте алгоритм сортировки методом вставки.
        Оцените сортировку с помощью базового класса System.nanoTime().
        Сравните с временем выполнения алгоритмов сортировки из прошлых заданий 2.3, 2.4 и 2.5.
        */

        int[] newArray_int_400_toSort4 = Arrays.copyOf(newArray_int_400, newArray_int_400.length);
        Integer[] newArray_Integer_400_toSort4 = Arrays.copyOf(newArray_Integer_400, newArray_Integer_400.length);

        curTime = System.nanoTime();
        for (counter1 = 1; counter1 < newArray_int_400_toSort4.length; counter1++)
        {
            for (counter2 = 0; counter2 < counter1; counter2++)
            {
                if (newArray_int_400_toSort4[counter1] <= newArray_int_400_toSort4[counter2])
                {
                    tempInt = newArray_int_400_toSort4[counter1];
                    for (counter3 = counter1; counter3 >= counter2 + 1; counter3--)
                    {
                        newArray_int_400_toSort4[counter3] = newArray_int_400_toSort4[counter3 - 1];
                    }
                    newArray_int_400_toSort4[counter3] = tempInt;
                    break;
                }
            }
        }
        System.out.println("Сортировка массива типа int из 400 элементов МЕТОДОМ ВСТАВКИ заняла " + (System.nanoTime() - curTime) + " нс.");
        System.out.println("       Исходный массив: " + Arrays.toString(newArray_int_400));
        System.out.println("Отсортированный массив: " + Arrays.toString(newArray_int_400_toSort4));
        System.out.println();

        curTime = System.nanoTime();
        for (counter1 = 1; counter1 < newArray_Integer_400_toSort4.length; counter1++)
        {
            for (counter2 = 0; counter2 < counter1; counter2++)
            {
                if (newArray_Integer_400_toSort4[counter1] <= newArray_Integer_400_toSort4[counter2])
                {
                    tempInteger = newArray_Integer_400_toSort4[counter1];
                    for (counter3 = counter1; counter3 >= counter2 + 1; counter3--)
                    {
                        newArray_Integer_400_toSort4[counter3] = newArray_Integer_400_toSort4[counter3 - 1];
                    }
                    newArray_Integer_400_toSort4[counter3] = tempInteger;
                    break;
                }
            }
        }
        System.out.println("Сортировка массива типа Integer из 400 элементов МЕТОДОМ ВСТАВКИ заняла " + (System.nanoTime() - curTime) + " нс.");
        System.out.println("       Исходный массив: " + Arrays.toString(newArray_Integer_400));
        System.out.println("Отсортированный массив: " + Arrays.toString(newArray_Integer_400_toSort4));
        System.out.println();

        System.out.println("СРАВНЕНИЕ (коэффициент доверия 0,95):");
        System.out.println("Среднее время для сортировки массива типа int из 400 элементов МЕТОДОМ ВСТАВКИ      = 1740079 +-  717555 нс (среднее время стандартным методом = 183928+- 7790 нс).");
        System.out.println("Среднее время для сортировка массива типа Integer из 400 элементов МЕТОДОМ ВСТАВКИ  = 2992578 +- 1299665 нс (среднее время стандартным методом = 475711+-75284 нс).");
        System.out.println("Среднее время для сортировки массива типа int из 400 элементов МЕТОДОМ ВЫБОРА       = 574014  +-  174116 нс (среднее время стандартным методом = 183928+- 7790 нс).");
        System.out.println("Среднее время для сортировка массива типа Integer из 400 элементов МЕТОДОМ ВЫБОРА   = 906050  +-  444065 нс (среднее время стандартным методом = 475711+-75284 нс).");
        System.out.println("Среднее время для сортировки массива типа int из 400 элементов МЕТОДОМ ПУЗЫРЬКА     = 59305309+-10474124 нс (среднее время стандартным методом = 183928+- 7790 нс).");
        System.out.println("Среднее время для сортировка массива типа Integer из 400 элементов МЕТОДОМ ПУЗЫРЬКА = 10190004+- 7742195 нс (среднее время стандартным методом = 475711+-75284 нс).");
        System.out.println();
        //endregion
    }

}
