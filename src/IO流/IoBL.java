package IO��;

import java.io.File;

//����һ���ļ���
public class IoBL {
    public static void main(String[] args) {
        System.out.println("�����ļ��У�");
        fun1(new File("F:\\����\\abc"));
        System.out.println("======================================");
        fun2(new File("F:\\����\\abc"));
    }

    public static void fun1(File file) {
        if (file.isFile()) {//�жϳ����Ƿ���һ���ļ�
            //�����ǰ����ļ���·����Ϣ
            System.out.println(file.getName() + "��һ���ļ�" + "  ����·��Ϊ�� " + file.getAbsolutePath());
        } else if (file.isDirectory()) {
            //����ļ�������
            System.out.println((file.getAbsolutePath() + "��һ���ļ���"));
            //��ȱ���
            File[] fs = file.listFiles();//���ļ����µ������ļ������file����Ž�����
            if (fs != null && fs.length > 0) {
                for (int i = 0; i < fs.length; i++) {
                    fun1(fs[i]);
                }
            }
        }
    }


    public static void fun2(File file) {
        if (file.isFile()) {//�жϳ����Ƿ���һ���ļ�
            //�����ǰ����ļ���·����Ϣ
            System.out.println(file.getName() + "��һ���ļ�" + "  ����·��Ϊ�� " + file.getAbsolutePath());
        } else if (file.isDirectory()) {//�������һ���ļ���
            System.out.println((file.getAbsolutePath() + "��һ���ļ���"));
            //��ȱ���
            File[] fs = file.listFiles();
            if (fs.length > 0 && fs != null) {
                System.out.println("  ���ļ��µ��ļ��У�");
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
