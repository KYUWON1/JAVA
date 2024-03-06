package Lamda;// Java 프로그래밍 - 람다식
// 메소드 대신 하나의 식으로 표현하는것, 익명 함수
// 재사용 용도 아님, 일회성

interface ComputeTool {
    public abstract int compute(int x, int y);

//    public abstract int compute2(int x, int y);
}


public class Main {

    public static void main(String[] args) {
        ComputeTool cToll = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x + y;
            }
        };
        System.out.println(cToll.compute(1,2));

        // 람다식, 다만 익명 클래스에 추상메소드가 2개 이상이면 람다식 사용 불가
        ComputeTool cToll2 = (x,y) -> {
            return x + y;
        };
        System.out.println(cToll2.compute(2,3));
    }
}
