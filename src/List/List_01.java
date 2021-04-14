package List;

import java.util.ArrayList;
import java.util.List;

public class List_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");//添加元素
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("ab");
        list.add(1, "add");//在位置1处添加add
        System.out.println(list);

        System.out.println(list.get(2));//获取索引值为2的元素

        List<String> list2 = new ArrayList<String>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list.addAll(2, list2);//添加整个集合到list下标为2的位置
        System.out.println(list);

        System.out.println(list.indexOf("ab"));//获取指定元素在集合中第一次出现的位置
        System.out.println(list.lastIndexOf("ab"));//获取指定元素在集合中最后一次出现的位置 没有则会返回-1

        list.remove(0);//移除下标为0
        System.out.println(list);

        list.set(1, "add");//修改下标为1的值为add
        System.out.println(list);

        List<String> sub = list.subList(2, 4);//截取2-4 从起始下标2截取到下标4-1 不包含最后一个
        System.out.println(sub + "  长度为：" + list.size());


    }
}
