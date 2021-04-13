package IO��;
import java.io.*;
public class FileOperation {

    File file;

    public FileOperation()
    {

    }

    public FileOperation(String path)
    {
        this.file = new File(path);
    }

    //�ļ��Ĵ���
    public void fileFound() {
        if(! file.getParentFile().exists()) {// �ж��Ƿ�����ļ�
            System.out.print("��ʾ:·�������ڣ������Ѿ�����·����\t");
            file.getParentFile().mkdirs();//��������ڣ�������·��

        }
        else
            System.out.print("��ʾ:·���Ѵ��ڣ�\t");

        try {
            file.createNewFile();
            System.out.println("�ļ��ѽ���");
        } catch (Exception e) {}
    }

    //�ļ���д��
    public void fileWrite(String str,String path) {
        try(Writer out=new FileWriter(path)){//ʵ��������
            out.write(str);//��������
            //out.write(str,0,len);
            out.flush();//��ջ���
        } catch (IOException e) {}//���쳣���Բ���close

    }

    //�ļ���׷��
    public void fileAppend(String str) {
        try(Writer out=new FileWriter(this.file,true)){//ʵ��������
            out.append(str);//׷������
            out.flush();
            // out.close(); �ر������
        } catch (IOException e) {
            e.printStackTrace();
        }//���쳣���Բ���close

    }

    //�ļ��Ķ�ȡ
    public char[] fileRead() {
        char data[] = new char[10240];
        try(Reader in=new FileReader(this.file)){//ʵ��������
            int len = in.read(data);//��ȡ��������,len����������ַ�����

            //System.out.println(new String(data,0,len));//���data�е��ַ�
            // in.close();//�ر�������
        } catch(IOException e) {}
        return data;
    }

    //�ļ���ɾ��
    public void fileDelect()
    {
        boolean  flag=file.exists();//�ж��Ƿ����
        if(flag==true) {
            file.delete();
            System.out.println("�ļ�ɾ���ɹ���");
        }
        else
            System.out.println("�ļ������ڣ�");
    }

    public void fileCopy(String outPath){
        char[] data = fileRead();//��ȡ����
        String str = new String(data);
        fileWrite(str,outPath);
        System.out.println(str);

    }

}
