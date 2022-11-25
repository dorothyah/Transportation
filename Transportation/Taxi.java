public class Taxi {

    int maxGuest = 4; //최대승객
    int num; //택시 번호
    int gas = 100; //주유량
    int currentSpeed; //현재 속도
    String destination; //목적지
    int basicDistance = 1; //기본 거리
    int totalDistance; // 목적지까지 거리
    int basicFare = 3000; //기본 요금
    int distanceFare; // 거리당 요금
    String status = "일반"; //상태 (운행 중, 일반, 운행 불가)

}
