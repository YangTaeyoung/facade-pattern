public class TheaterLights {
    public void on() {
        System.out.println("조명이 켜졌습니다.");
    }

    public void off() {
        System.out.println("조명이 꺼졌습니다.");
    }

    public void dim(int level) {
        System.out.printf("조명 밝기를 %d%%로 조절합니다.\n", level);
    }
}
