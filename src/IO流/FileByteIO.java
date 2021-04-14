package IO��;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//�ļ��ֽ����ǳ�ͨ�ã��������������ַ����ĵ��������Բ����κε����������ļ���ͼƬ��ѹ�����ȣ�����Ϊ�ֽ���ʹ�õĶ�����
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

    //�ļ��ֽ�������,�ӵ�ǰ�ļ�����
    public String testFileInputStream() {
        String str = null;
        try {
            FileInputStream in = new FileInputStream(file.getPath());
            byte[] b = new byte[100];
            int len = 0;
            while ((len = in.read(b)) != -1) { //read��ȡ�����һλʱ����ȡһλȻ�󷵻ظ�һ
                str = new String(b, 0, len);
                //new String(b,0,len),����1�ǻ������ݵ����飬����2�Ǵ����е��Ǹ�λ�ÿ�ʼת���ַ���������3���ܹ�ת����λ��
            }
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    //�ļ��Լ������FileOutputStream
    public void FileOutputSream(String str, String path) {
        try {
            FileOutputStream out = new FileOutputStream(path);
            out.write(str.getBytes());//����д���ڴ�
            out.flush();//��ջ��������� ��Ϊ���겻�����д�꣬������ղ���д�����ᶪʧ
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void copyFile(String path) {
        String s1 = this.testFileInputStream();//��ȡ��ǰ�ļ�
        FileOutputSream(s1, path);//д���µ��ļ�
        setFile(new File(path));//�޸�file���·��
    }
}

