package IO流;
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

    //文件的创立
    public void fileFound() {
        if(! file.getParentFile().exists()) {// 判断是否存在文件
            System.out.print("提示:路径不存在，但是已经建立路径！\t");
            file.getParentFile().mkdirs();//如果不存在，建立父路径

        }
        else
            System.out.print("提示:路径已存在！\t");

        try {
            file.createNewFile();
            System.out.println("文件已建立");
        } catch (Exception e) {}
    }

    //文件的写入
    public void fileWrite(String str,String path) {
        try(Writer out=new FileWriter(path)){//实例化对象
            out.write(str);//输入数据
            //out.write(str,0,len);
            out.flush();//清空换存
        } catch (IOException e) {}//抛异常可以不用close

    }

    //文件的追加
    public void fileAppend(String str) {
        try(Writer out=new FileWriter(this.file,true)){//实例化对象
            out.append(str);//追加数据
            out.flush();
            // out.close(); 关闭输出流
        } catch (IOException e) {
            e.printStackTrace();
        }//抛异常可以不用close

    }

    //文件的读取
    public char[] fileRead() {
        char data[] = new char[10240];
        try(Reader in=new FileReader(this.file)){//实例化对象
            int len = in.read(data);//读取所有数据,len等于输入的字符个数

            //System.out.println(new String(data,0,len));//输出data中的字符
            // in.close();//关闭输入流
        } catch(IOException e) {}
        return data;
    }

    //文件的删除
    public void fileDelect()
    {
        boolean  flag=file.exists();//判断是否存在
        if(flag==true) {
            file.delete();
            System.out.println("文件删除成功！");
        }
        else
            System.out.println("文件不存在！");
    }

    public void fileCopy(String outPath){
        char[] data = fileRead();//读取出来
        String str = new String(data);
        fileWrite(str,outPath);
        System.out.println(str);

    }

}
