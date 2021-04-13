package TreeSet;
import java.util.Comparator;
import  java.util.HashSet;
import  java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        //Tree自然排序
        set.add(3);
        set.add(1);
        set.add(2);
        System.out.println(set);
        //必须使用相同类型值

        //如果使用tree来操作实例对象
        Person p1 = new Person(23,"小明");
        Person p2 = new Person(22,"小华");
        Person p3 = new Person(24,"小昊");
        Person p4 = new Person(21,"小呆");

        Set<Person> set1 = new TreeSet<Person>(new Person());
        set1.add(p1);
        set1.add(p2);
        set1.add(p3);
        set1.add(p4);
        for(Person per:set1){
            System.out.println(per.name+per.age);
        }
        System.out.println(12/0);
    }
}

class Person implements Comparator<Person>{
    int age;
    String name;

    public Person(){
    }

    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }


    @Override
    public int compare(Person o1, Person o2) {//定制排序方法
        if(o1.age>o2.age)
            return 1;
        else if(o1.age < o2.age)
            return -1;
        else
            return 0;
    }
}
