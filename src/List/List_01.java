package List;

import java.util.ArrayList;
import java.util.List;

public class List_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");//���Ԫ��
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("ab");
        list.add(1, "add");//��λ��1�����add
        System.out.println(list);

        System.out.println(list.get(2));//��ȡ����ֵΪ2��Ԫ��

        List<String> list2 = new ArrayList<String>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list.addAll(2, list2);//����������ϵ�list�±�Ϊ2��λ��
        System.out.println(list);

        System.out.println(list.indexOf("ab"));//��ȡָ��Ԫ���ڼ����е�һ�γ��ֵ�λ��
        System.out.println(list.lastIndexOf("ab"));//��ȡָ��Ԫ���ڼ��������һ�γ��ֵ�λ�� û����᷵��-1

        list.remove(0);//�Ƴ��±�Ϊ0
        System.out.println(list);

        list.set(1, "add");//�޸��±�Ϊ1��ֵΪadd
        System.out.println(list);

        List<String> sub = list.subList(2, 4);//��ȡ2-4 ����ʼ�±�2��ȡ���±�4-1 ���������һ��
        System.out.println(sub + "  ����Ϊ��" + list.size());


    }
}
