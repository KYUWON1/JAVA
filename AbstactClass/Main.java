package AbstactClass;// Java 프로그래밍 - 추상 클래스
// 추상 클래스 : 하나 이상의 추상 메소드를 포함, 객체 생성 불가
// 추상 메소드 : 자식 클래스에서 반드시 오버라이딩 해야하는 메소드
// 선언만하고 구현 내용이 없음

// 추상 클래스 Person
abstract class Person {
    abstract void printInfo();
}

// 추상 클래스 상속
class Student extends Person {
    public void printInfo() {
        System.out.println("Student Info");
    }
}


public class Main {

    public static void main(String[] args) {
        
//        추상 클래스의 사용
        //Person p1 = new Person(); 객체 생성 불가
        Student s1 = new Student();
        s1.printInfo();

        //익명 클래스로 생성하면서 사용 가능
        Person p2 = new Person() {
            @Override
            void printInfo(){
                System.out.println("Main.Info");
            }
        };
        p2.printInfo();

    }

}
