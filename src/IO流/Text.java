package IO��;

import java.io.File;

public class Text {
    public static void main(String[] args) {
        FileOperation f1 = new FileOperation("F:\\����\\abc\\newname.txt");
        f1.fileFound();
        f1.fileWrite("��˼����", f1.file.getPath());
        f1.fileAppend("zhu!");
        System.out.println(f1.fileRead());
        f1.fileCopy("F:\\����\\abc\\2.txt");

    }


}
