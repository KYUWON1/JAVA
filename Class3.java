// Java 프로그래밍 - 클래스와 객체_2
import CarPractice.Car2;
class MyCar {
    String name;
    String type;

    MyCar(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo() {
        System.out.println("=== Car Info ===");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
    }

    // 오버로딩 구현
    public void printCarInfo(String date){
        this.printCarInfo();
        System.out.println(date);
    }

    public void printCarInfo(int number){
        this.printCarInfo();
        System.out.println(number);
    }
    public void printCarInfo(String date,int number){
        this.printCarInfo();
        System.out.println(date+number);
    }

}


class Car3 {
    // 스태틱 변수
    static String name ="None";
    String type;

    Car3(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo() {
        System.out.println("=== Car Info ===");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
    }

    // 스태틱 메소드
    public static void getName(){
        System.out.println("name = "+name);
    }

}


public class Class3 {

    public static void main(String[] args) {
        MyCar myCar1 = new MyCar("a", "sedan");
        myCar1.printCarInfo();

//      1. 오버로딩 사용
        System.out.println("=== 오버로딩 사용 ===");
        myCar1.printCarInfo("2022");
        myCar1.printCarInfo(1234);
        myCar1.printCarInfo("2022",1234124);


//      2. 접근 제어자
        System.out.println("=== 접근 제어자 ===");
        Car2 myCar2 = new Car2("a","b","C","d");
        System.out.println(myCar2.name1); // public 만 접근가능
//        System.out.println(myCar2.name2);
//        System.out.println(myCar2.name3);
//        System.out.println(myCar2.name4);


//      3. Static
        System.out.println("=== Static ===");
        Car3.getName(); // 객체없이도 사용가능
        Car3 myCar3 = new Car3("a","sedan");
        Car3 myCar3_1 = new Car3("b","sedan");
        Car3 myCar3_2 = new Car3("c","sedan");
        myCar3.printCarInfo();
        myCar3_1.printCarInfo();
        myCar3_2.printCarInfo(); //static 이기때문에 c로 통일됨

        
    }

}