// Java 프로그래밍 - 여러가지 연산자_2

public class Operator2 {
    public static void main(String[] args) {
        //true == 1, false == 0
//      1. 비트 논리 연산자
        System.out.println("== 비트 논리 연산자 ==");
//      1-1. AND 연산자 (&)
        int num1 = 5;
        int num2 = 3;
        int result = 0;
        result = num1 & num2;
        System.out.println(" AND ");
        //System.out.println(Integer.toBinaryString(num1));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(result)));


//      1-2. OR 연산자 (|)
        result = num1 | num2;
        System.out.println("  OR  ");
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(result)));

//      1-3. XOR 연산자 (^)
        System.out.println(" XOR  ");
        result = num1 ^ num2;
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(result)));


//      1-4. 반전 연산자 (~)
        result = ~num1;
        System.out.println("result = " + result);
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%s\n",Integer.toBinaryString(result)); //0이 반전되서 나옴


//      2. 비트 이동 연산자
        System.out.println("== 비트 이동 연산자 ==");

//      2-1. << 연산자
        int numA = 3;
        result = numA << 1;
        System.out.println("result = " + result);
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(result)));

//      2-2. >> 연산자
        result = numA >> 1;
        System.out.println("result = " + result);
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(result)));

//      2-3. >>> 연산자
        numA = -5;
        result = numA >> 1;
        System.out.printf("%s\n",Integer.toBinaryString(numA)); //부호비트는 그대로 유지됨 >>>제외
        System.out.printf("%s\n",Integer.toBinaryString(result));

        result = numA >>> 1;
        System.out.printf("%s\n",Integer.toBinaryString(numA));
        System.out.printf("%s\n",Integer.toBinaryString(result)); //가장앞에 bit 0으로 채워줌 
    }

}
