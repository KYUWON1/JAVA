// Java 프로그래밍 - 변수와 자료형_3

public class DString {
    public static void main(String[] args) {

//      1. 자료형 - 문자열
        System.out.println("== 문자열 ==");
        String s1 = "헬로월드";
        System.out.println("s1 = " + s1);
        String s2 = "01234";
        System.out.println("s2 = " + s2);

//      1-1. equals
        String s3 = "hi";
        String s4 = "hi";
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);
        String s5 = new String("hi");
        System.out.println(s5.equals(s3)); //값을 비교함
        System.out.println(s3 == s5); // 객체를 비교함 false 나옴

//      1-2. indexOf
        String s6 = "hello! world!";
        System.out.println(s6.indexOf("!"));
        System.out.println(s6.indexOf("!",s6.indexOf("!")+1));

//      1-3. replace
        String s7 = s6.replace("hello","Bye");
        System.out.println("s7 = " + s7);

//      1-4. substring
        System.out.println(s7.substring(0,3));
        System.out.println(s7.substring(0,s7.indexOf("!")+1));

//      1-5. toUpperCase
        System.out.println(s7.toUpperCase());

//      2. 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");
        //데이터의 변화가 빈번하다면 Stringbuffer사용, 새로운객체를 생성하지 않기 때문에
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("56789");
        System.out.println("sb1 = " + sb1);


//      3. 자료형 - 배열
        System.out.println("== 배열 ==");
        int[] myArr1 = {1,2,3,4,5};
        System.out.println(myArr1[0]);
        System.out.println(myArr1[1]);
        System.out.println(myArr1[2]);
        System.out.println(myArr1[3]);
        System.out.println(myArr1[4]);

        char[] myArr2 = {'a','b','c','d'};
        System.out.println(myArr2[2]);

        String[] myArr3 = new String[3];
        myArr3[0] = "Hello";
        myArr3[1] = "World";
        myArr3[2] = "!";
        System.out.println(myArr3[0] + myArr3[1] + myArr3[2]);

    }
}
