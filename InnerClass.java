// Java 프로그래밍 - 내부 클래스
// 내부클래스 : 클래스안에 있는 클래스
// 내부에서는 외부클래스에 접근가능, 외부에선 내부에 접근 불가, Scope개념

//내부 클래스 구조
class Outer {
    public void print(){
        System.out.println("Outer");
    }

    class Inner {
        public void innerPrint(){
            Outer.this.print();
        }
    }

    static class InnerStatic{
        void innerPrint(){
            //Outer.this.print(); static 이기때문에 바로 사용 불가
        }
    }
}

abstract class Person {
    public abstract void printInfo();
}

class Student extends Person {
    public void printInfo(){
        System.out.println("Student.Info");
    }
}
public class InnerClass {

    public static void main(String[] args) {

//      외부 클래스
        Outer outer = new Outer();
//      내부 클래스 - 인스턴스
        Outer.Inner i1 = new Outer().new Inner();
//      내부 클래스 - 정적
        Outer.InnerStatic is1 = new Outer.InnerStatic();
//      익명 클래스
        Person p1 = new Person() {
            @Override
            public void printInfo() {
                System.out.println("Main.Info");
            }
        };


    }

}
