package ch12.sec00;

@MyAnnotation02
public class C02Annotation {
    private String field;

    @MyAnnotation02
    public void method01(
            @MyAnnotation02
            String name
    ) {

    }
}

// MyAnnotation02 만들기
@interface MyAnnotation02 {
    
}
