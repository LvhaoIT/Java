package Collections工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections.*;
import java.util.List;
import java.util.Set;

public class Test {
    //Collections工具类
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);

        Collections.reverse(list);//反转list中的元素顺序
        System.out.println(list);

        Collections.shuffle(list);//随机排序
        System.out.println(list);

        Collections.sort(list);//升序排序
        System.out.println(list);

        //其他类继承Compartor完成compare方法，可以
//        Collections.sort(stus,new Student());

        Collections.swap(list,0,1);
        System.out.println(list);

        /*
        Object max(Collection) 根据元素的自然顺序返回给定集合的最大元素值
        Object max(Collection,Comparator) 根据指定顺序返回给定集合的最大元素值
        int frequency(Collection,Object) 返回指定集合中指定元素出现的次数
        boolean replaceAll(List list, Object oldVal, Object newVal) 使用新值替换List对象的所有旧值
         */
        //替换
        Collections.replaceAll(list,"a","aa");
        System.out.println(list);
    }
}
