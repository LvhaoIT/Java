package IO��;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File f1 = new File("F:\\����\\abc\\newname.txt");
        System.out.println(f1.getName() + "  " + f1.getPath());//��ȡ�ļ������ļ�·�������ֻ�ܶ��ļ����в������޸��ļ�����Ҫ���������

        File f2 = new File("src//Map//Map_01");
        System.out.println(f2.getPath());//��ȡnew File����д��·��
        System.out.println(f2.getAbsolutePath());//��ȡ��ǰ�ļ��ľ���·��

        System.out.println(f1.getAbsoluteFile());//����һ���õ�ǰ�ļ��ľ���·��������file����
        System.out.println(f1.getParent());//��ȡһ����������

        f1.renameTo(new File("F:\\����\\abc\\newname.txt"));//���ļ������ļ���������
        System.out.println(f1.exists());//�жϵ�ǰ·�����Ƿ����ָ�����ļ������ļ���
        System.out.println(new File("F:\\����\\abc\\newname.txt").exists());
        //canWrite()�����ж��Ƿ����д  canRead()�����ж��Ƿ�ɶ�
        //isFile()�жϵ�ǰ�ļ��Ƿ�Ϊ�ļ� isDirectory()�ж��Ƿ�Ϊ�ļ���
        System.out.println(f1.lastModified());//��������޸�ʱ�䣬����һ��������
        System.out.println("�ļ�����Ϊ��" + f1.length());//�ļ�����

        File f3 = new File("F:\\����");
        String[] str1 = f3.list();
        for (String s : str1) {
            System.out.println(s);
        }


    }
}
