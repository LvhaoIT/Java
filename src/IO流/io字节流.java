package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class io字节流 {
    public static void main(String[] args) {
        FileByteIO file = new FileByteIO("F:\\垃圾\\abc\\newname.txt");
        System.out.println();
        file.FileOutputSream("我的宝贝华思烨是一头可爱的猪", file.getFile().getPath());
        file.copyFile("F:\\垃圾\\abc\\new.txt");
    }

}
