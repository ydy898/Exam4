package cn.lusiliya;

import java.util.*;

/**
 * Created by Lusiliya on 2018/8/4.
 */
public class Random {

    List<Integer> list = new ArrayList();
    Vector<Integer> vector0 = new Vector<Integer>();
    Vector<Integer> vector1 = new Vector<Integer>();
    Vector<Integer> vector2 = new Vector<Integer>();
    Vector<Integer> vector3 = new Vector<Integer>();
    Vector<Integer> vector4 = new Vector<Integer>();
    Vector<Integer> vector5 = new Vector<Integer>();
    Vector<Integer> vector6 = new Vector<Integer>();
    Vector<Integer> vector7 = new Vector<Integer>();
    Vector<Integer> vector8 = new Vector<Integer>();
    Vector<Integer> vector9 = new Vector<Integer>();
    Map<Integer,Vector<Integer> > map = new HashMap<Integer,Vector<Integer>>();

    private void addRandomNum() {
        for (int i = 0; i < 50; i++) {
            int ii = (int) ((Math.random()) * 101);
            list.add(ii);
        }
    }

    private void addMap() {
        //找到key值一共有哪些存到数组里
        //根据数组顺序找到key值对应的value有哪些存到数组里
        //把key和对应的value存到map中
        for(int i = 0;i < 50;i++){
            switch (list.get(i)/10 ){
                case 0 :
                    vector0.add(list.get(i));
                    break;
                case 1 :
                    vector1.add(list.get(i));
                    break;
                case 2 :
                    vector2.add(list.get(i));
                    break;
                case 3 :
                    vector3.add(list.get(i));
                    break;
                case 4 :
                    vector4.add(list.get(i));
                    break;
                case 5 :
                    vector5.add(list.get(i));
                    break;
                case 6 :
                    vector6.add(list.get(i));
                    break;
                case 7 :
                    vector7.add(list.get(i));
                    break;
                case 8 :
                    vector8.add(list.get(i));
                    break;
                case 9 :
                    vector9.add(list.get(i));
                    break;
            }
        }
        map.put(0,vector0);map.put(1,vector1);map.put(2,vector2);map.put(3,vector3);map.put(4,vector4);
        map.put(5,vector5);map.put(6,vector6);map.put(7,vector7);map.put(8,vector8);map.put(9,vector9);
    }

    private void sort() {
        Collections.sort(vector0);
        Collections.sort(vector1);
        Collections.sort(vector2);
        Collections.sort(vector3);
        Collections.sort(vector4);
        Collections.sort(vector5);
        Collections.sort(vector6);
        Collections.sort(vector7);
        Collections.sort(vector8);
        Collections.sort(vector9);
    }


    public static void main(String[] args) {
        Random r = new Random();
        r.addRandomNum();
        System.out.print("随机生成50个小于100的数，分别为：");
        for(int i = 0;i < r.list.size();i++){
            System.out.print(r.list.get(i) + " ");
        }
        System.out.println("");
        r.addMap();
        System.out.print("Map中的数据为：");
        System.out.print(r.map);
        System.out.println("");
        r.sort();
        System.out.print("排序后的map为：");
        System.out.print(r.map);
        System.out.println("");
    }



}
