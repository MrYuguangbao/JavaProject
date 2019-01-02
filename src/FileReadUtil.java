import java.io.*;

public class FileReadUtil {
    private String name;

    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        File file = new File("E:\\document\\jquery-3.3.1.js");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuffer buffer = new StringBuffer();
        String string;
        while ((string=reader.readLine()) != null){
            buffer.append(string);
        }
        System.out.println("result:\n"+buffer.toString());
        long end = System.currentTimeMillis();
        System.out.println("读取文件 : "+file.getName()+" 完毕！,耗时："+(end-start)+" ms");
    }

}
