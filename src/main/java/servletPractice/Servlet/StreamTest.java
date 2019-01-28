package servletPractice.Servlet;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class StreamTest {
    @Test
    public void readFile(){
        try {
            FileInputStream fin = new FileInputStream("/home/dainy33/Public/file.text");
            FileOutputStream fout = new FileOutputStream("/home/dainy33/Public/newFile.text");
            byte[] buff = new byte[256];
            int len = 0;
            while ((len=fin.read(buff))>0){
                fout.write(buff,0,len);
            }
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void OnceTimeTest(){
        Thread thread = new Thread(new OnceTest());
        thread.start();

    }


}
/**
 * @program: servletPractice
 * @description:
 * @author: Dainy33
 * @create: 2018-11-27 09:20
 **/
