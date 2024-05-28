public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour); // 시간 설정
                try {
                    Thread.sleep(5000); // 테스트를 위해 1초 -> 5초 변경
                } catch (InterruptedException e) {
                }
            }
        }
    }
}


