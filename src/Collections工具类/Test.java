package Collections������;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections.*;
import java.util.List;
import java.util.Set;

public class Test {
    //Collections������
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);

        Collections.reverse(list);//��תlist�е�Ԫ��˳��
        System.out.println(list);

        Collections.shuffle(list);//�������
        System.out.println(list);

        Collections.sort(list);//��������
        System.out.println(list);

        //������̳�Compartor���compare����������
//        Collections.sort(stus,new Student());

        Collections.swap(list,0,1);
        System.out.println(list);

        /*
        Object max(Collection) ����Ԫ�ص���Ȼ˳�򷵻ظ������ϵ����Ԫ��ֵ
        Object max(Collection,Comparator) ����ָ��˳�򷵻ظ������ϵ����Ԫ��ֵ
        int frequency(Collection,Object) ����ָ��������ָ��Ԫ�س��ֵĴ���
        boolean replaceAll(List list, Object oldVal, Object newVal) ʹ����ֵ�滻List��������о�ֵ
         */
        //�滻
        Collections.replaceAll(list,"a","aa");
        System.out.println(list);
    }
}
