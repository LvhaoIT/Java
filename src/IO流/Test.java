package IO流;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File f1 = new File("F:\\垃圾\\abc\\newname.txt");
        System.out.println(f1.getName() + "  " + f1.getPath());//获取文件名，文件路径，这个只能对文件进行操作，修改文件还需要输入输出流

        File f2 = new File("src//Map//Map_01");
        System.out.println(f2.getPath());//获取new File里面写的路径
        System.out.println(f2.getAbsolutePath());//获取当前文件的绝对路径

        System.out.println(f1.getAbsoluteFile());//返回一个用当前文件的绝对路径构建的file对象
        System.out.println(f1.getParent());//获取一个父级对象

        f1.renameTo(new File("F:\\垃圾\\abc\\newname.txt"));//给文件或者文件夹重命名
        System.out.println(f1.exists());//判断当前路径下是否存在指定的文件或是文件夹
        System.out.println(new File("F:\\垃圾\\abc\\newname.txt").exists());
        //canWrite()可以判断是否可以写  canRead()可以判断是否可读
        //isFile()判断当前文件是否为文件 isDirectory()判断是否为文件夹
        System.out.println(f1.lastModified());//返回最后修改时间，返回一个毫秒数
        System.out.println("文件长度为：" + f1.length());//文件长度

        File f3 = new File("F:\\垃圾");
        String[] str1 = f3.list();
        for (String s : str1) {
            System.out.println(s);
        }


    }
}
