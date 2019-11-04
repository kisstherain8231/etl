package groovy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ContentReader {


    public static String readContent(String path) {

        String result = "";
        StringBuilder stringBuilder =  new StringBuilder();

        try {

            String fileName ="D:\\repository\\etl\\src\\main\\java\\script\\Hello.java";
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(fileName);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            try {
                line = bufferedReader.readLine();
                stringBuilder.append(line);
            } catch (IOException e) {
                e.printStackTrace();
            }

            while (line!=null){
                //System.out.println(line);
                try {
                    line = bufferedReader.readLine();
                    stringBuilder.append(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            bufferedReader.close();
            fileReader.close();

        } catch (Exception e) {

        }


        return stringBuilder.toString();


    }

    public static void main(String[] args) {
       String content =  ContentReader.readContent("");

       System.out.print(content);
    }


}
