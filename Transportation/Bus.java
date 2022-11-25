public class Bus {

    int maxGuest = 30; //최대 승객수
    int currentGuest; //현재 승객수
    int fare = 1000; //요금
    static int num; //버스 번호
    int gas = 100; //주유량
    int currentSpeed; //현재 속도
    String status = "운행 중"; // 상태
    int busNum; // 버스 고유번호

    Bus(int currentGuest, int currentSpeed) {
        num += 1;
        busNum = num;
        this.currentGuest = currentGuest;
        this.currentSpeed = currentSpeed;
    }

    void busNumber() {
        System.out.println(busNum+"번 버스입니다.");
    }

    void gasRemaining(int g) {
        gas += g;
        System.out.println("현재 주유량은 " + gas + " 입니다");
    }

    void busStatus() {
        if (gas <= 10) {
            System.out.println("주유가 필요합니다.");
            status = "차고지행";
        }
    }

    void currentGuest(int g) {
        currentGuest += g;
        System.out.println("현재 승객은 " + currentGuest + "명 입니다.");

        if (currentGuest > 40) {
            System.out.println("승객수가 초과되었습니다.");
            status = "차고지행";
        }
    }

    void changeSpeed(int s) {
        currentSpeed += s;
        if (gas <= 10) {
            System.out.println("주유량을 확인해주세요.");
        }
    }

}
