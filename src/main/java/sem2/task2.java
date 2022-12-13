package sem2;

import java.io.IOException;

public class task2 {

    public static void main(String[] args) {
        String str = "Test";
        String repeats = str.repeat(count, 100);
        System.out.println(repeats);
        toFileWriter(repeats);
    }

    private static void toFileWriter(String data){
        File test = new File(pathname, "test.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(test);
            fr.write(data);
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
