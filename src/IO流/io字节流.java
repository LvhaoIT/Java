package IO��;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class io�ֽ��� {
    public static void main(String[] args) {
        FileByteIO file = new FileByteIO("F:\\����\\abc\\newname.txt");
        System.out.println();
        file.FileOutputSream("�ҵı�����˼����һͷ�ɰ�����", file.getFile().getPath());
        file.copyFile("F:\\����\\abc\\new.txt");
    }

}
