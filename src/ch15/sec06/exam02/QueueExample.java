package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        // offer
        messageQueue.offer(new Message("sendMail", "이름1"));
        messageQueue.offer(new Message("sendSMS", "이름2"));
        messageQueue.offer(new Message("sendKakaoTalk", "이름3"));

        // poll
        while (!messageQueue.isEmpty()) { // 비어있지 않다면 반복(내용물 없으면 끝남)
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail" -> {
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                }
                case "sendSMS" -> {
                    System.out.println(message.to + "님에게 SMS을 보냅니다.");
                    break;
                }
                case "sendKakaoTalk" -> {
                    System.out.println(message.to + "님에게 카카오톡일을 보냅니다.");
                    break;
                }
            }
        }
    }
}
