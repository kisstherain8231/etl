package groovy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class ContentReader {


    public static String readContent(String path) {
        String result = "";
        StringBuilder stringBuilder =  new StringBuilder();
        StringBuffer sb = new StringBuffer();

        try {

            String fileName ="D:\\repository\\etl\\src\\main\\java\\script\\BSA3G.java";

            InputStream in = null;

            // 一次读多个字节
            byte[] tempbytes = new byte[1024];
            int byteread = 0;
            in = new FileInputStream(new File(fileName));
            // 读入多个字节到字节数组中，byteread为一次读入的字节数
            while ((byteread = in.read(tempbytes)) != -1) {
                //  System.out.write(tempbytes, 0, byteread);
                String str = new String(tempbytes, 0, byteread);
                sb.append(str);
            }

        } catch (Exception e) {

        }

        return sb.toString();


    }

    public static void main(String[] args) {
       String content =  ContentReader.readContent("");

       System.out.print(content);
    }


}
