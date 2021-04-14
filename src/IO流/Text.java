package IO流;

import java.io.File;

public class Text {
    public static void main(String[] args) {
        FileOperation f1 = new FileOperation("F:\\垃圾\\abc\\newname.txt");
        f1.fileFound();
        f1.fileWrite("华思烨是", f1.file.getPath());
        f1.fileAppend("zhu!");
        System.out.println(f1.fileRead());
        f1.fileCopy("F:\\垃圾\\abc\\2.txt");

    }


}
