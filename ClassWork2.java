import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ClassWork2 
{
    public static void main(String[] args) 
    {
       // task0();
        //task1(CreatArr(1000,0,24));
        Cat cat1=new Cat("Мурзик", "мэйкун", "Василий", 15);
        Cat cat2=new Cat("Мурзик", "мэйкун", "Василий", 15);
        Cat cat3=new Cat("Мурз", "мэйк", "Петр", 5);


        System.out.println(cat1);

        Set<Cat> set=new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);

        System.out.println(set);


    }
 
    
    static void task0()
    {
        //int[] arr={1, 2, 3, 2, 4, 5, 6, 3};
        var set1=new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));

        var set2=new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));// {1, 2, 3, 2, 4, 5, 6, 3}
        var set3=new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));// {1, 2, 3, 2, 4, 5, 6, 3}

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }

    static void task1(Integer[] arr)
    {
        /*Задание №1
        1. Напишите метод, который заполнит массив из 1000 элементов случайными 
        цифрами от 0 до 24. 
        2. Создайте метод, в который передайте заполненный выше массив и с 
        помощью Set вычислите процент уникальных значений в данном массиве и 
        верните его в виде числа с плавающей запятой.
        Для вычисления процента используйте формулу:
        процент уникальных чисел = количество уникальных чисел * 100 / общее 
        количество чисел в массиве.
        */

        //int[] arr={1, 2, 3, 2, 4, 5, 6, 3};
        var set1=new HashSet<>(Arrays.asList(arr));
        System.out.println(set1.size()*100.00/arr.length);
       
    }

    static Integer[] CreatArr(int n, int min, int max)
    {
        Integer[] arr=new Integer[n];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=new Random().nextInt(min,max+1);
        }
        return arr;
    }

    




}


