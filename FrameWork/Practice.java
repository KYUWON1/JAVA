package FrameWork;// Practice
// 로또 번호 만들기

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {
        //set을 이용
        HashSet set = new HashSet();
        for (int i = 0; i < 6; i++) {
            int num = (int)(Math.random() * 45) + 1 ;
            set.add(num); //set은 중복허용을 안해서 중복이 나와도 size가 늘어나지않아 상관없음
        }

        //set을 List로 전환
        LinkedList list = new LinkedList(set);
        Collections.sort(list); // 리스트 정렬
        System.out.println("로또 번호 "+list);

    }
}
