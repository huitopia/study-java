package ch12.sec00;

import java.util.List;

public class C01Annotation {
    public static void main(String[] args) {
        /*
         * Annotation : 코드의 추가 정보
         * 컴파일러나 프레임워크나 빌드 툴 등 다른 도구들이 사용함
         */
    }
}

@MyAnnotation01
class MyClass01 {
    @MyAnnotation01
    private String name;

    @MyAnnotation01
    MyClass01(
            @MyAnnotation01
            String name
    ) {

    }

    @MyAnnotation01
    public String method(
            @MyAnnotation01
            Double param, List<?> list
    ) {
        @MyAnnotation01
        String variable;
        return null;
    }
}

@interface MyAnnotation01 {

}