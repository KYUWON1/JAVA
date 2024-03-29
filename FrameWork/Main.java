package FrameWork;// Java 프로그래밍 - 컬렉션 프레임워크

import java.util.*;

// 컬렉션 프레임워크란 여러 데이터를 편리하게 관리할 수 있도록 만들어놓은 것
// 대표적으로 List, Set, Map 등이 있음
public class Main {

    public static void main(String[] args) {

//      1. List > 순서가 있음, 데이터 중복 허용
//        1-1. ArrayList
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list1 = " + list1);
        list1.remove(Integer.valueOf(2)); //값 2를 찾아서 지움
        System.out.println("list1 = " + list1);
        list1.add(0, 10); //0 인덱스에 10 추가
        System.out.println("list1 = " + list1);
        System.out.println("list1.size() = " + list1.size());
        System.out.println("list1.contains(1) = " + list1.contains(1));
        System.out.println("list1.indexOf(10) = " + list1.indexOf(10));

//      1-2. LinkedList
        System.out.println("== LinkedList ==");
        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("list2 = " + list2);
        list2.addFirst(10);
        list2.addLast(20);
        System.out.println("list2 = " + list2);
        list2.remove(Integer.valueOf(1));
        System.out.println("list2 = " + list2);
        list2.removeFirst();
        list2.removeLast();
        System.out.println("list2 = " + list2);

//      2. Set > 순서가 없음 ,데이터 중복 허용 x
//      2-1. HashSet
        System.out.println("== HashSet ==");
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);
        set1.remove(1);
        System.out.println("set1 = " + set1);
        set1.add(2);
        set1.add(3); //중복 x
        System.out.println("set1 = " + set1);
        System.out.println(set1.size());
        System.out.println(set1.contains(2));

//      2-2. TreeSet
        System.out.println("== TreeSet ==");
        TreeSet set2 = new TreeSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println("set2 = " + set2);
        set2.remove(2);
        System.out.println("set2 = " + set2);
        set2.clear();
        System.out.println("set2 = " + set2);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(3);
        System.out.println("set2 = " + set2);
        System.out.println(set2.first());
        System.out.println(set2.last());
        System.out.println(set2.lower(3));//10보다 작은값 출력
        System.out.println(set2.higher((1))); //1보다 큰 값 출력

//      3. Map > 키와값으로 이루어짐,순서없음
//      3-1. HashMap
        System.out.println("== HashMap ==");
        HashMap map1 = new HashMap();
        map1.put(1, "kiwi");
        map1.put(2, "apple");
        map1.put(3, "mango");
        System.out.println("map1 = " + map1);
        
        map1.remove(2);
        System.out.println("map1 = " + map1);
        System.out.println("map1.get(1) = " + map1.get(1));


//      3-2. TreeMap
        System.out.println("== TreeMap ==");
        TreeMap map2 = new TreeMap();
        map2.put(10,"kiwi");
        map2.put(5,"apple");
        map2.put(20,"mango");
        System.out.println("map2 = " + map2);
        System.out.println(map2.firstEntry());
        System.out.println(map2.firstKey());
        System.out.println(map2.lastEntry());
        System.out.println(map2.lastKey());
        System.out.println(map2.lowerEntry(10));
        System.out.println(map2.higherEntry(5));


    }
}
