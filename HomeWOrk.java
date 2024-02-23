

/*Урок 6. Хранение и обработка данных ч3: множество коллекций Set
Формат сдачи: ссылка на подписанный git-проект.

Задание

Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена
 с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
  Вывод должен быть отсортирован по убыванию числа телефонов. 


*/


public class HomeWOrk 
{
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;

        int phone1;
        int phone2;
        int phone3;
        int phone4;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            name3 = "Sidorov";
            phone1 = 123456;
            phone2 = 654321;
            phone3 = 777777;
            phone4 = +792229222;


        } else {
            name1 = args[0];
            name2 = args[1];
            name3 = args[2];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
            phone3 = Integer.parseInt(args[4]);
            phone4 = Integer.parseInt(args[5]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name1, phone3);
        myPhoneBook.add(name3, phone1);
        myPhoneBook.add(name3, phone2);
        myPhoneBook.add(name3, phone3);
        myPhoneBook.add(name3, phone4);



        System.out.println("Ivanov's numbers: "+myPhoneBook.find(name1));
        System.out.println("Sidorov's numbers: "+myPhoneBook.find(name3));
        System.out.println("Petrov's numbers: "+myPhoneBook.find("Petrov"));
        System.out.println("All records: "+PhoneBook.getPhoneBook());
    } 
}






