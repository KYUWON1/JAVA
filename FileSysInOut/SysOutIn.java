package FileSysInOut;// Java 프로그래밍 - 입출력_1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//콘솔 입력, 콘솔 출력
public class SysOutIn {

    public static void referInputStream() throws IOException {
//      System.in
//        System.out.println("== System.in ==");
//        System.out.print("입력: ");
//        // 버퍼에 한글자만 가져옴, 엔터는남아있음,숫자로 변환
//        int a = System.in.read() - '0'; //int로 변환하기 위해 0빼기
//        System.out.println("a = " + a);
//        //입력 스트림에 남아있는 개수만큼 읽어서 소진
//        System.in.read(new byte[System.in.available()]);
//
////      InputStreamReader
//        System.out.println("== InputStreamReader ==");
//        InputStreamReader reader = new InputStreamReader(System.in);
//        char[] c = new char[3];
//        System.out.print("입력: ");
//        reader.read(c); //읽어서 c에 넣음
//        System.out.println(c); //출력
//
////      BufferedReader
//        System.out.println("== BufferedReader ==");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("입력: ");
//        String s1 = br.readLine();
//        System.out.println(s1);
    }

    public static void main(String[] args) throws IOException {

//      1. 입력
//      1-1. 다른 입력 방식 참고
        //referInputStream();

//      1-2. Scanner
        System.out.println("== Scanner ==");
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        System.out.println(sc.next());//데이터를 하나 받아옴
        sc.nextLine(); //엔터키 소진용

        System.out.print("입력 숫자만가능: ");
        System.out.println(sc.nextInt()); //숫자만 입력가능
        sc.nextLine();

        System.out.print("입력3: ");
        System.out.println(sc.nextLine()); // 가장 많이 사용함

//      참고) 정수, 문자열 변환
        int num = Integer.parseInt("12345");
        String str = Integer.toString(12345);

        
//      2. 출력
        System.out.println("== 출력 ==");
        System.out.println("Hello 줄바꿈");
        System.out.print("줄바꿈 x");
        System.out.printf("하이하이\n");

        String s = "자바";
        int number = 3;
        System.out.println(s +"는 언어선호도"+number+"입니다");
        System.out.printf("%s 는 언어선호도 %d 입니다\n",s,number);

        System.out.printf("%d %o %x",10,8,16); //진수 표기법

        System.out.printf("%f %c %s",5.12f,'a',"String");
        //%5d, %.2f 등 자릿수 표기법

    }
}
