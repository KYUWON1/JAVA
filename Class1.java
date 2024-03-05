// Java 프로그래밍 - 클래스와 객체_1

// Car 클래스 - 객체변수, 메소드
class Car {
    String name;
    String type;

    public void printCarInfo(){
        System.out.println("차 정보");
        System.out.println("name="+ name);
        System.out.println("type=" + type);
    }

    public void move(){
        System.out.println("이동");
    }

    public void brake() {
        System.out.println("브레이크");
    }


}


// Car2 클래스 - 생성자, this
class Car2 {
    String name;
    String type;
    Car2(String name,String type){
        this.name = name;
        this.type = type;
        System.out.println("Car2 생성자 호출");
    }
    public void load(){
        System.out.println("짐 실기");
    }
}

public class Class1 {

    public static void main(String[] args) {
//      Car 클래스 사용
        Car myCar1 = new Car();
        myCar1.name = "a";
        myCar1.type = "suv";
        myCar1.printCarInfo();
        myCar1.move();
        myCar1.brake();

//      Car2 클래스 사용
        Car2 myCar2 = new Car2("b","suv");
        myCar2.load();
    }
}
