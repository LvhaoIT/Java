package HashSet;
import  java.util.HashSet;
import  java.util.Set;
public class Hashset {
    public static void main(String[] args) {
        Set set = new HashSet(); //����һ����ϣset����
        set.add(1);//���һ��ֵ����set
        set.add('e');

        System.out.println(set);

        set.remove(1);//�Ƴ���ϣset�е�ֵ1��
        if(set.remove('1')==true)
            System.out.println("�ɹ�");
        else
            System.out.println("ʧ��");
        //���Կ�������remover�ɹ��Ƴ��᷵��һ��true ��������һ��false

        System.out.println(set.contains('e'));//�ж�set���Ƿ���e

        set.clear();//���

        set.add('a');
        set.add('b');
        set.add('c');
        set.add('d');
        set.add('a');
        set.add(null);

        for(Object obj : set){//��set�����е�����Ԫ���ó�����obj��ֱ������
            System.out.println(obj);
        }

        System.out.println(set.size());//set�Ĵ�С
        //HashSet��������ͬ��ֵ

        //������Ҫ�ü���ֻ�ܴ���ͬ�����Ͷ��󣬾���Ҫʹ�õ�����
        Set<String> set1=new HashSet<String>();
    }

}
