package HashSet;
import  java.util.HashSet;
import  java.util.Set;
public class Hashset {
    public static void main(String[] args) {
        Set set = new HashSet(); //创建一个哈希set集合
        set.add(1);//添加一个值进入set
        set.add('e');

        System.out.println(set);

        set.remove(1);//移除哈希set中的值1；
        if(set.remove('1')==true)
            System.out.println("成功");
        else
            System.out.println("失败");
        //可以看出，当remover成功移除会返回一个true 否则会出现一个false

        System.out.println(set.contains('e'));//判断set中是否有e

        set.clear();//清空

        set.add('a');
        set.add('b');
        set.add('c');
        set.add('d');
        set.add('a');
        set.add(null);

        for(Object obj : set){//将set集合中的所有元素拿出来给obj，直到结束
            System.out.println(obj);
        }

        System.out.println(set.size());//set的大小
        //HashSet不保存相同的值

        //当我需要让集合只能村相同的类型对象，就需要使用到泛型
        Set<String> set1=new HashSet<String>();
    }

}
