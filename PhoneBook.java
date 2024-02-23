/*Урок 6. Хранение и обработка данных ч3: множество коллекций Set
Формат сдачи: ссылка на подписанный git-проект.

Задание

Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена
 с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
  Вывод должен быть отсортирован по убыванию числа телефонов. 


*/

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Collections;


public class PhoneBook 
{
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) 
    {

        // Введите свое решение ниже
        if (phoneBook.containsKey(name))
        {
            ArrayList<Integer> nums=phoneBook.get(name);
            nums.add(phoneNum);
        }
        else
        {
            ArrayList<Integer> nums=new ArrayList<>();
            nums.add(phoneNum);
            phoneBook.put(name,nums);
        }


    }

    public ArrayList<Integer> find(String name) 
    {
        // Введите свое решение ниже
        ArrayList<Integer> nums=new ArrayList<>();

        if(phoneBook.containsKey(name))
        {
            nums=phoneBook.get(name);
            return nums;
        }
        else
        {
             return nums;
        }

    }



    public static HashMap<String, ArrayList<Integer>> getPhoneBook() 
    {
        

        HashMap<String, ArrayList<Integer>> sortedBook=new LinkedHashMap<>();
        TreeMap<Integer, String> mapp=new TreeMap<>(Collections.reverseOrder());

         for (var entry: phoneBook.entrySet()) 
        {
           mapp.put(entry.getValue().size(), entry.getKey());
        }

        for (var entry: mapp.entrySet()) 
        {
            sortedBook.put(entry.getValue(), phoneBook.get(entry.getValue()));
          
        }


        return sortedBook;
    }

        
}

