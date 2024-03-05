//  Practice
//  다음 클래스 직접 만든 후 객체 생성
//  클래스명: Animal
//  특성: 이름, 무게, 분류
//  기능: 먹기, 잠자기, 걷기, 뛰기
class Animal {
    String name;
    double weight;
    String type;
    Animal(String name,double weight, String type){
        this.name = name;
        this.weight = weight;
        this.type = type;
    }
    
    public void eat(){
        System.out.println("먹기");
    }

    public void printInfo(){
        System.out.println("name = " + name);
        System.out.println("weight = " + weight);
        System.out.println("type = " + type);
    }
}


public class Class2 {
    public static void main(String[] args) {
        // Test code
        Animal animal1 = new Animal("강아지", 5.0, "포유류");
        Animal animal2 = new Animal("구피", 0.01, "어류");

        animal1.printInfo();
        animal2.printInfo();
    }
}
