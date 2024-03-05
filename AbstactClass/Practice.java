package AbstactClass;// Practice
// 아래 Device 추상 클래스를 이용하여
// UsbPort1 클래스와 WiFi 클래스를 자유롭게 구현해보세요.

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

abstract class Device {
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}

// UsbPort1 클래스
class UsbPort1 extends Device {
    UsbPort1(int id) {
        this.deviceId = id;
    }
    public void deviceInfo(){
        System.out.println("id = "+this.deviceId);
    };
    public void connect(){
        System.out.println("연결");
    };
    public void disconnect(){
        System.out.println("연결 해제");
    };
    public void send(){
        System.out.println("전송");
    };
    public void receive(){
        System.out.println("수신");
    };
}

// WiFi 클래스
class WiFi extends Device {
    WiFi(int id) {
        this.deviceId = id;
    }
    //마우스우클릭 > Generate > implement method 선택으로 일일이 타이핑하지않아도됨
    @Override
    void deviceInfo() {

    }

    @Override
    void connect() {

    }

    @Override
    void disconnect() {

    }

    @Override
    void send() {

    }

    @Override
    void receive() {

    }
}

public class Practice {

    public static void main(String[] args) {
        // Test code
        UsbPort1 usb1 = new UsbPort1(1);
        WiFi wifi = new WiFi(0);
    }

}
