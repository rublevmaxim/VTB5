import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Подзадание 1
        String[] arr_str1=new String[]{
                "Вася", "Коля","Аня","Вася","Евстигней",
        };


        String[] arr_str=new String[]{
                "Вася", "Коля","Аня","Женя","Евстигней",
                "Коля","Саша","Петя","Серёжа","Алёша",
                "Толик","Петруха","Катя","Света","Настя",
                "Коля","Саша","Игорь","Петя","Егор"
        };

      /*  ArrayList<String> arr_list= new ArrayList(Arrays.asList(arr_str));

        Set<String> set_str=new HashSet<>(arr_list);

        Set<String> set_str1=new HashSet<>(Arrays.asList(arr_str1));

        System.out.println("arr_str1.length="+arr_str1.length);
        System.out.println("Set.size="+set_str1.size());
        for(String el:set_str1) {
            System.out.println(el);
        }
*/
        Map<String,Integer> mapString=new HashMap<String,Integer>();
        for(String str_a:arr_str){
            if (!mapString.containsKey(str_a)){
                mapString.put(str_a,1);
            }else{
                mapString.put(str_a,mapString.get(str_a)+1);
            }
        }

        //Печатем уникальные слова
        for(Map.Entry entry:mapString.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        //Подзадание 2
        PhoneBook pb=new PhoneBook();
        pb.add("Путин","124234-234234");
        pb.add("Путин","4353-345");
        pb.add("СиньДзиньПинь","7567-2342567534");
        pb.add("Трамп","4646456-4647");
        pb.add("Меркель","000000000000-000000000000");

        pb.get("Обама");

    }
}
