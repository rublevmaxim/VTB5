import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class PhoneBook {


   // public PhoneBook(Map<String, String> phone_book) {
   //     this.phone_book = phone_book;
    //}

    private Map<String, TreeSet<String>>phone_book=new HashMap<String, TreeSet<String>>();

    public void get(String surname){
        System.out.println(surname+":");
        if (phone_book.containsKey(surname))
            System.out.println(phone_book.get(surname));
        else
            System.out.println("Телефон не найдет");
    }

    public void add(String surname, String telephone){

        if (phone_book.containsKey(surname))
            phone_book.get(surname).add(telephone);
        else
            phone_book.put(surname,new TreeSet<String>(Arrays.asList(telephone)));
    }
}
