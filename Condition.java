// Java 프로그래밍 - 조건문

public class Condition {
    public static void main(String[] args) {

//      1. 조건문 - if
        System.out.println("== if ==");
        int water = 99;
        if(water > 100){
            System.out.println("물이 끓는중");
        }else {
            System.out.println("물을 끓이는중");
        }

//      2. 조건문 - switch
        System.out.println("== switch ==");
        String fruit = "apple";

        switch (fruit){
            case "apple":
                System.out.println("5000원");
                break;
            case "blueberry":
                System.out.println("10000원");
                break;
            default:
                System.out.println("가격없음");
                break;
        }


//      Q1. number의 값이 홀수인지 짝수인지 판단하는 코드를 작성하세요.
        int number = 5;



//      Q2. 아래 주석은 위의 실습에서 진행한 score에 따라 grade를 출력하는 코드이다.
//        이를 switch 조건문 기반으로 바꿔보세요.
//        int score = 90;
//        char grade = 0;
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("grade = " + grade);
        int score = 90;
        char grade = 0;
        switch(score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                break;
        }
        System.out.println(grade +"입니다");
    }
}
