package ch08.sec04;

import ch08.sec05.RemoteControl;

public class Television implements RemoteControl {
    // 필드
    private int volume;

    @Override
    public void turnON() {
        System.out.println("TV On");
    }

    @Override
    public void turnOFF() {
        System.out.println("TV Off");
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
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }
}
