package ch17.sec00;

import java.util.List;

public class TerminalOperation03 {
    /* 최종연산
     * anyMatch : 하나라도 일치하는게 있는지(불변 타입 리턴)
     * allMatch : 모두 다 연산에 통과하는지()
     */
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "react", "spring", "hello world");
        // anyMatch
        boolean hasCss = list.stream().anyMatch(e -> e.equals("css"));
        System.out.println("hasCss = " + hasCss);
        boolean hsJsp = list.stream().anyMatch(e -> e.equals("jsp"));
        System.out.println("hsJsp = " + hsJsp);
        boolean hasBlank = list.stream().anyMatch(e -> e.equals(" "));
        System.out.println("hasBlank = " + hasBlank);

        // allMatch
        boolean strLength = list.stream().allMatch(e -> e.length() >= 3);
        System.out.println("strLength = " + strLength);
        boolean strLength2 = list.stream().allMatch(e -> e.length() < 10);
        System.out.println("strLength2 = " + strLength2);

    }
}
