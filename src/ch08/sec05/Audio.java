package ch08.sec05;

public class Audio implements RemoteControl {
    // 필드
    private int volume;

    // 추상 메소드 오버라이딩
    @Override
    public void turnON() {
        System.out.println("Audio On");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio Off");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨 : " + volume);
    }

    private int memoryVolume; // 추가 필드 선언

    // 디폴트 메소드 재정의
    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("무음 해제");
            // mute가 false일 경우, 원래 볼륨으로 복원
            setVolume(this.memoryVolume);
        }
    }
}
