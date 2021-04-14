package IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//文件字节流非常通用，可以用来操作字符的文档，还可以操作任何的其他类型文件（图片，压缩包等），因为字节流使用的二进制
public class FileByteIO {


    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public FileByteIO() {
    }

    public FileByteIO(String str) {
        this.file = new File(str);
    }

    //文件字节输入流,从当前文件输入
    public String testFileInputStream() {
        String str = null;
        try {
            FileInputStream in = new FileInputStream(file.getPath());
            byte[] b = new byte[100];
            int len = 0;
            while ((len = in.read(b)) != -1) { //read读取到最后一位时会多读取一位然后返回负一
                str = new String(b, 0, len);
                //new String(b,0,len),参数1是缓冲数据的数组，参数2是从书中的那个位置开始转化字符串，参数3是总共转化的位数
            }
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    //文件自己输出流FileOutputStream
    public void FileOutputSream(String str, String path) {
        try {
            FileOutputStream out = new FileOutputStream(path);
            out.write(str.getBytes());//数据写入内存
            out.flush();//清空缓冲区数据 因为读完不代表就写完，所以清空才能写完否则会丢失
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void copyFile(String path) {
        String s1 = this.testFileInputStream();//读取当前文件
        FileOutputSream(s1, path);//写入新的文件
        setFile(new File(path));//修改file里的路径
    }
}

