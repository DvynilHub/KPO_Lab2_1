import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("123.txt"));
            String tmp = "";
            while ((tmp = br.readLine()) != null) {// пробел использовать как разделитель
                String[] s = tmp.split("\\s");
                int k=0;
                for (int i=0;i<s.length-1;i++){
                    if ((s[i+1].charAt(0)) == (s[i].charAt(s[i].length() - 1))){ //сравнение последнего символа текущего
                        System.out.println(s[i]+" "+s[i+1]);                 // и последнего символа следуюзего слов
                        k++;
                    }
                }
                if (k==0) {
                    System.out.println("Совпадений нет"); //если таких слов нет - вывод сообщения
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }



}