public class Projector {

        public void on() {
            System.out.println("프로젝터가 켜졌습니다.");
        }

        public void off() {
            System.out.println("프로젝터가 꺼졌습니다.");
        }

        public void setInput(String input) {
            System.out.printf("프로젝터 입력을 \"%s\"로 설정합니다.\n", input);
        }

        public void wideScreenMode() {
            System.out.println("프로젝터 화면 비율을 와이드 모드로 설정합니다(16:9 비율).");
        }
}
