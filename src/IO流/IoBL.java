package IO流;

import java.io.File;

//遍历一个文件夹
public class IoBL {
    public static void main(String[] args) {
        System.out.println("遍历文件夹：");
        fun1(new File("F:\\垃圾\\abc"));
        System.out.println("======================================");
        fun2(new File("F:\\垃圾\\abc"));
    }

    public static void fun1(File file) {
        if (file.isFile()) {//判断出入是否是一个文件
            //输出当前这个文件的路径信息
            System.out.println(file.getName() + "是一个文件" + "  他的路径为： " + file.getAbsolutePath());
        } else if (file.isDirectory()) {
            //输出文件夹名称
            System.out.println((file.getAbsolutePath() + "是一个文件夹"));
            //深度遍历
            File[] fs = file.listFiles();//将文件夹下的所有文件都变成file对象放进数组
            if (fs != null && fs.length > 0) {
                for (int i = 0; i < fs.length; i++) {
                    fun1(fs[i]);
                }
            }
        }
    }


    public static void fun2(File file) {
        if (file.isFile()) {//判断出入是否是一个文件
            //输出当前这个文件的路径信息
            System.out.println(file.getName() + "是一个文件" + "  他的路径为： " + file.getAbsolutePath());
        } else if (file.isDirectory()) {//如果他是一哥文件夹
            System.out.println((file.getAbsolutePath() + "是一个文件夹"));
            //广度遍历
            File[] fs = file.listFiles();
            if (fs.length > 0 && fs != null) {
                System.out.println("  该文件下的文件有：");
                for (File f1 : fs) {
                    System.out.println(f1.getName());
                }
                for (File f1 : fs) {
                    fun2(f1);
                }
            }
        }
    }
}
