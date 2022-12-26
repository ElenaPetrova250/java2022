
package  sem6;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book {
    private static HashMap<String, String> nb = new HashMap<String, String>();

    private static void addNB(String number, String name) {
        nb.put(number, name);
    }

    private static void delNB(String number) {
        nb.remove(number);
    }

    private static void saveNB() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("book.txt")));
        for(Map.Entry<String,String> k: nb.entrySet()){
            writer.write(k.getKey() + " " + k.getValue()+System.lineSeparator());
        }
        writer.close();
    }

    public static void loadPB() throws IOException {
        File file = new File("book.txt");
        if (file.exists()){
            BufferedReader reader = new BufferedReader(new FileReader(new File("book.txt")));
            String act;
            while ((act=reader.readLine())!=null) {
                String[] dat = act.split(" ");
                nb.put(dat[0], dat[1]);
            }
            reader.close();
        }
    }

    public static void PrintBook(){
        System.out.println("Список компьютеров: ");
        for(Map.Entry<String,String> k: nb.entrySet()){
            System.out.println(k.getValue()+": "+ k.getKey());
        }
    }

    public static String FindName(String number){
        String result = nb.get(number);
        if (result == null) return "такой компьютер не найден";
        return result;
    }

    public static String[] FindNumber(String name){
        List <String> result = new ArrayList<String>();
        for (Map.Entry entry : nb.entrySet()) {
            if (name.equalsIgnoreCase((String)entry.getValue())){
                result.add((String)entry.getKey());
            }
        }
        if (result.size() == 0) result.add("компьютер с такой моделью не найден");
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) throws IOException {
        String act;

        loadPB();

        PrintBook();

        System.out.println("выбор действия: (add)добавить данные, (del)удалить данные, (num) найти по номеру, (sur)найти название, " +
                "(save)сохранить, (exit)выход");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        act = bf.readLine();
        while(!act.equals("exit")){
            //добавление записи
            if(act.equals("add")){
                System.out.println("Введите название:");
                String name = bf.readLine();
                System.out.println("Введите номер:");
                String number = bf.readLine();
                addPB(number, name);
            }else{
                //удаление записи
                if(act.equals("del")){
                    System.out.println("Введите номер:");
                    String number = bf.readLine();
                    delPB(number);
                }else{
                    if (act.equals("num")){
                        System.out.println("Введите название:");
                        String name = bf.readLine();
                        String[] numbers = FindNumber(name);
                        for (String number : numbers) {
                            System.out.println(number);
                        }
                    } else {
                        if (act.equals("sur")) {
                            System.out.println("Введите номер:");
                            String number = bf.readLine();
                            System.out.println(Findname(number));
                        } else {
                            if(act.equals("save")){
                                saveNB();
                            }
                        }
                    }
                }
            }
            System.out.println("выбор действия: (add)добавить данные, (del)удалить данные, (num) найти по номеру, (sur)найти по названию, (save)сохранить, (exit)выход");
            act=bf.readLine();
        }
    }
}