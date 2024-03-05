// Java 프로그래밍 - 여러가지 연산자_1

public class Operator1 {
    public static void main(String[] args) {

//      1. 대입 연산, 부호 연산자
        int num = 100;
        num = +10;
        num = 10;
        num = -10;

//      2. 산술 연산자, 증가/감소 연산자
        System.out.println("== 산술 연산자, 증가/감소 연산자 ==");
        int numX = 10;
        int numY = 3;
        int result = 0;
        result = numX + numY;
        result = numX - numY;

//      3. 관계 연산자
        System.out.println("== 관계 연산자 ==");


//      4. 논리 연산자
        System.out.println("== 논리 연산자 ==");


//      5. 복합 대입 연산자
        System.out.println("== 복합 대입 연산자 ==");


//      6. 삼항 연산자
        System.out.println("== 삼항 연산자 ==");
        int a = 100;
        String aResult = (a == 100) ? "Yes" :"No";
        System.out.println(aResult);

    }

}
