package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.*;
import java.util.TreeMap;

public class Map_01 {
//    Map��һ���ӿ� ������ֵһ��keyһ��value  ͨ������HashMapȥʵ��
    //map�е�key�������ظ�
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("first", 1);//��first����map�����У�valueֵΪ1
        map.put("second", 2);
        map.put("thirdly", 2);
        map.put("tt", 4);
        System.out.println(map);

        System.out.println(map.get("first")); //map.get(key) ��ȡkey��Ӧ��value
        map.remove("tt"); //�Ƴ���Ӧvalue

        System.out.println(map+"����Ϊ�� "+map.size());

        System.out.println("��map�Ƿ����keyΪfirst�ļ�ֵ�ԣ�"+map.containsKey("first"));
        System.out.println("��map�Ƿ����valueΪ1�ļ�ֵ�ԣ�"+map.containsValue(2));

//        map.clear();//���map
        Set<String> keys = map.keySet();//��ȡmap���ϵ�key�ļ���
        map.values();//��ȡmap���ϵ�����values�ļ���

        //����map ͨ��map.keySet
        for(String key : keys){
            System.out.println("key: " + key + ", value : "+map.get(key));
        }

        //����map��ͨ��map.entrySet();
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
