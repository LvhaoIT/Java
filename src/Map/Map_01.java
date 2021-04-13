package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.*;
import java.util.TreeMap;

public class Map_01 {
//    Map是一个接口 有两个值一个key一个value  通常是用HashMap去实现
    //map中的key不允许重复
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("first", 1);//将first存入map集合中，value值为1
        map.put("second", 2);
        map.put("thirdly", 2);
        map.put("tt", 4);
        System.out.println(map);

        System.out.println(map.get("first")); //map.get(key) 获取key对应的value
        map.remove("tt"); //移除对应value

        System.out.println(map+"长度为： "+map.size());

        System.out.println("该map是否包含key为first的键值对："+map.containsKey("first"));
        System.out.println("该map是否包含value为1的键值对："+map.containsValue(2));

//        map.clear();//清空map
        Set<String> keys = map.keySet();//获取map集合的key的集合
        map.values();//获取map集合的所有values的集合

        //遍历map 通过map.keySet
        for(String key : keys){
            System.out.println("key: " + key + ", value : "+map.get(key));
        }

        //遍历map，通过map.entrySet();
        Set<Entry<String, Integer>> entrys =map.entrySet();
        for(Entry<String, Integer> en:entrys){
            System.out.println("key: " +en.getKey() + ", value : "+en.getValue());
        }

        //Treemap
        Map<Integer, String> map1 = new TreeMap<Integer, String>();
        map1.put(3,"c");
        map1.put(1,"a");
        map1.put(4,"d");
        map1.put(2,"b");
        System.out.println(map1);


    }

}
