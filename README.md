# Java

## 자바 기초

### 1. 변수와 타입

- [변수 선언](src/ch02/sec01)
- [정수 타입](src/ch02/sec02/IntegerLiteralExample.java)
- [문자 타입](src/ch02/sec03/CharExample.java)
- [실수 타입](src/ch02/sec04/FloatDoubleExample.java)
- [논리 타입](src/ch02/sec05/BooleanExample.java)
- [문자열 타입](src/ch02/sec06/StringExample.java)
- [자동 타입 변환](src/ch02/sec07/PromotionExample.java)
- [강제 타입 변환](src/ch02/sec08/CastingExample.java)
- [연산식에서 자동 타입 변환](src/ch02/sec09/OperationPromotionExample.java)

### 2. 연산자

- [증감 연산자](src/ch03/sec01/IncreaseDecreaseOperatorExample.java)
- [부호 연산자](src/ch03/sec01/SignOperatorExample.java)
- [산술 연산자](src/ch03/sec02/ArithmeticOperatorExample.java)
- [오버플로우와 언더플로우](src/ch03/sec03/OverflowUnderflowExample.java)
- [NaN과 Infinity](src/ch03/sec05/InfinityAndNanCheckExample.java)
- [비교 연산자](src/ch03/sec06/CompareOperatorExample.java)
- [논리 연산자](src/ch03/sec07/LogicalOperatorExample.java)
- [비트 논리 연산자](src/ch03/sec08/BitLogicExample.java)
- [비트 이동 연산자](src/ch03/sec09)
- [대입 연산자](src/ch03/sec10/AssignmentOperatorExample.java)
- [삼항 조건 연산자](src/ch03/sec11/ConditionalOperatorExample.java)

### 3. 조건문과 반복문

- [if](src/ch04/sec02)
- [switch](src/ch04/sec03)
    - [switch expressions(표현식)](src/ch04/sec03/SwitchExpressionsExample.java)
- [for](src/ch04/sec04)
- [while](src/ch04/sec05)
- [do-while](src/ch04/sec06/DoWhileExample.java)
- [break](src/ch04/sec07)
- [continue](src/ch04/sec08)

## 객체 지향 프로그램

### 1. 참조 타입

- [참조 타입 변수의 ==, != 연산](src/ch05/sec03/ReferenceVariableCompareExample.java)
- [null NullPointerException](src/ch05/sec04)
- [String](src/ch05/sec05)
    - [.equals()](src/ch05/sec05/EqualsExample.java)
    - [.charAt()](src/ch05/sec05/CharAtExample.java)
    - [.length()](src/ch05/sec05/LengthExample.java)
    - [.replace()](src/ch05/sec05/ReplaceExample.java)
    - [.split()](src/ch05/sec05/SplitExample.java)
    - [.substring()](src/ch05/sec05/SubstringExample.java)
- [Array](src/ch05/sec06)
    - [다차원 Array](src/ch05/sec07)
    - [객체 참조 Array](src/ch05/sec08/ArrayReferenceObjectExample.java)
    - [Array copy](src/ch05/sec09)
    - [Array for](src/ch05/sec10/AdvancedForExample.java)
- [main 메소드의 String[] 매개변수](src/ch05/sec11/MainStringArrayArgument.java)
- [Enum](src/ch05/sec12)

### 2. 클래스

- [클래스 선언](src/ch06/sec03/SportsCar.java)
- [객체 생성과 클래스 변수](src/ch06/sec04)
- 필드 선언과 사용
    - [필드 선언](src/ch06/sec06/exam01)
    - [필드 사용](src/ch06/sec06/exam02)
- 생성자 선언과 호출
    - [기본 생성자](src/ch06/sec07/exam01)
    - [필드 초기화](src/ch06/sec07/exam02)
    - [생성자 오버로딩](src/ch06/sec07/exam04)
    - [다른 생성자 호출](src/ch06/sec07/exam05)
- 메소드 선언과 호출
    - [메소드 선언](src/ch06/sec08/exam01/Calculator.java)
    - [메소드 호출](src/ch06/sec08/exam01/CalculatorExample.java)
    - [가변길이 매개변수](src/ch06/sec08/exam02)
    - [return](src/ch06/sec08/exam03)
    - [메소드 오버로딩](src/ch06/sec08/exam04)
- 인스턴스 멤버
    - [this](src/ch06/sec09)
- 정적 멤버
    - [정적 멤버 사용](src/ch06/sec10/exam01)
    - [정적 블록](src/ch06/sec10/exam02)
    - [static 에서 instance 사용](src/ch06/sec10/exam03/Car.java)
- [final 필드](src/ch06/sec11/exam01)
- [상수](src/ch06/sec11/exam02)
- 접근 제한자
    - [클래스 접근 제한](src/ch06/sec13/exam01)
    - [생성자 접근 제한](src/ch06/sec13/exam02)
    - [필드와 메소드 접근 제한](src/ch06/sec13/exam03)
- [getter & setter](src/ch06/sec14)
- [싱글톤 패턴](src/ch06/sec15)

### 3. 상속

- [클래스 상속](src/ch07/sec02)
- [super()](src/ch07/sec03)
- [method overriding](src/ch07/sec04)
- [final class & final method](src/ch07/sec05)
- [protected 접근 제한자](src/ch07/sec06)
- [타입 변환](src/ch07/sec07)
- [다형성](src/ch07/sec08)
- [instanceOf](src/ch07/sec09)
- [abstract](src/ch07/sec10)
- [sealed class](src/ch07/sec11)

### 4. 인터페이스

- [인터페이스와 구현 클래스 선언](src/ch08/sec02)
- [public static final](src/ch08/sec03)
- [abstract method](src/ch08/sec04)
- [default, static, private method](src/ch08/sec07)
- [다중 인터페이스 구현](src/ch08/sec08)
- [인터페이스 상속](src/ch08/sec09)
- [타입 변환](src/ch08/sec10)
- [다형성](src/ch08/sec11)
- [instanceof](src/ch08/sec12)
- 봉인된 인터페이스

### 5. 중첩 선언과 익명 객체

- 중첩 클래스
- [instance member class](src/ch09/sec02)
- [static class](src/ch09/sec03)
- [local class](src/ch09/sec04)
- 바깥 멤버 클래스 x
- [중첩 인터페이스](src/ch09/sec06)
- [익명 객체(anonymous)](src/ch09/sec07)

### 6. 예외 처리

- 예외와 예외 클래스
- 예외 처리 코드
    - [NullPointerException](src/ch11/sec02/exam01/ExceptionHandlingExample.java)
    - [try-catch-finally](src/ch11/sec02/exam01/ExceptionHandlingExample2.java)
    - [ClassNotFoundException](src/ch11/sec02/exam02/ExceptionHandlingExample.java)
- [예외 종류에 따른 처리](src/ch11/sec03/exam01/ExceptionHandlingExample.java)
    - [Exception Class 상속 관계](src/ch11/sec03/exam02/ExceptionHandlingExample.java)
    - [두 개 이상의 예외 동일 처리](src/ch11/sec03/exam03/ExceptionHandlingExample.java)
- [리소스 자동 닫기](src/ch11/sec04)
- [throws](src/ch11/sec05/ThrowsExample.java)
    - [throws Exception](src/ch11/sec05/ThrowsExample2.java)
- Custom Exception
    - [Constructor Exception](src/ch11/sec06/InsufficientException.java)
    - [throw](src/ch11/sec06/Account.java)

## 라이브러리 활용

### 1. java.base 모듈

- API document
- java module
- [Object class](src/ch12/sec03)
    - [equals()](src/ch12/sec03/exam01)
    - [hashCode()](src/ch12/sec03/exam02)
    - [toString()](src/ch12/sec03/exam03)
- System class
- String class
- [Boxing class](src/ch12/sec06)
- 수학 클래스
- 날짜와 시간 클래스
- 형식 클래스
- [정규 표현식 클래스](src/ch12/sec10)
- 리플렉션
- 어노테이션

### 2. Generic

- [Generic](src/ch13/sec01/GenericExample.java)
- [Generic Type](src/ch13/sec02)
- [Generic Method](src/ch13/sec03)
- [Bounded Type Parameter](src/ch13/sec04/GenericExample.java)
- [Wild Type Parameter](src/ch13/sec05)

### 3. Multi Thread

- 멀티 스레드 개념
- 메인 스레드
- 작업 스레드 생성과 실행
    - [익명 객체 생성](src/ch14/sec03/exam02/BeepPrintExample.java)
    - [람다식](src/ch14/sec03/exam02/BeepPrintExample2.java)
    - [익명 자식 객체](src/ch14/sec03/exam03/BeepPrintExample.java)
- [Thread Name](src/ch14/sec04/ThreadNameExample.java)
- 스레드 상태
    - [.join()](src/ch14/sec05)
- Thread Synchronized
    - [synchronized](src/ch14/sec06/exam01)
- 스레드 안전 종료
- 데몬 스레드
- 스레드풀

### 4. 컬렉션 자료구조

- [Collection Framework](src/ch15/sec00)
- List Collection
    - [Array List](src/ch15/sec02/exam01)
    - [Linked List](src/ch15/sec02/exam03/LinkedListExample.java)
    - [Vector](src/ch15/sec02/exam02/VectorExample.java)
- Set Collection
    - [HashSet](src/ch15/sec03/exam02)
    - [Iterator](src/ch15/sec03/exam03)
- Map Collection
    - [HashMap](src/ch15/sec05/exam01)
    - HashTable
    - Properties
- 검색 기능을 강화시킨 Collection
    - [TreeSet](src/ch15/sec05/exam01)
    - [Comparable](src/ch15/sec05/exam03)
    - [Comparator](src/ch15/sec05/exam04)
- LIFO와 FIFO Collection
    - [Stack](src/ch15/sec06/exam01)
    - [Queue](src/ch15/sec06/exam02)
- [Synchronized Collection](src/ch15/sec07/SynchronizedMapExample.java)
- [Unmodifiable Collection](src/ch15/sec08/ImmutableExample.java)

### 5. 람다식

- [람다식](src/ch16/sec01)
- [매개변수가 없는 람다식](src/ch16/sec02)
- [매개변수가 있는 람다식](src/ch16/sec03)
- [리턴값이 있는 람다식](src/ch16/sec04)
- Method Reference
    - [static&instance method Reference](src/ch16/sec05/exam01)
    - [Parameter Reference](src/ch16/sec05/exam02)
    - [Constructor Reference](src/ch16/sec05/exam03)

### 6. 스트림 요소 처리

- [Stream](src/ch17/sec01/exam01/StreamExample.java)
- [Parallel Stream](src/ch17/sec02/ParallelStreamExample.java)
- [PipeLine](src/ch17/sec03)
- 리소스로부터 스트림 얻기
    - [collection](src/ch17/sec04/exam01)
    - [Array](src/ch17/sec04/exam02)
    - [.rangeClosed()](src/ch17/sec04/exam03)
- [distinct()&filter()](src/ch17/sec05/FilteringExample.java)
- mapping
    - [mapToInt()](src/ch17/sec06/exam01)
    - [기본 타입 -> Wrapper](src/ch17/sec06/exam02/MapExample.java)
    - [flatMap()](src/ch17/sec06/exam03/FlatMappingExample.java)
- sorted
    - [Comparable](src/ch17/sec07/exam01)
    - [Comparator](src/ch17/sec07/exam02)
- [looping](src/ch17/sec08)
- [Match](src/ch17/sec09)
- [Optional](src/ch17/sec10)
- [reduce()](src/ch17/sec11/ReductionExample.java)
- 요소 수집
    - [collect(Collectors.toMap)](src/ch17/sec12/exam01)
    - [collect(Collectors.groupingBy())](src/ch17/sec12/exam02/CollectExample.java)
- 요소 병렬 처리

### 7. 데이터 입출력

- 입출력 스트림
- OutputStream
    - [Byte Output](src/ch18/sec02/exam01/WriteExample.java)
    - [Byte Array Output](src/ch18/sec02/exam02/WriteExample.java)
- InputStream
    - [Byte Input](src/ch18/sec03/exam01/ReadExample.java)
    - [Byte Array Input](src/ch18/sec03/exam02/ReadExample.java)
    - [File Copy](src/ch18/sec03/exam03/CopyExample.java)
- Reader&Writer
    - [Writer](src/ch18/sec04/exam01/WriterExample.java)
    - [Reader](src/ch18/sec04/exam02/ReadExample.java)
- 보조 스트림
- [InputStreamReader&OutputStreamWriter](src/ch18/sec06/CharacterConvertStreamExample.java)
- 성능 향상 스트림
- 기본 타입 스트림
- 프린트 스트림
- 객체 스트림
- File & Files 클래스

## 기타

- [Math.random()](src/ch04/sec01/MathRandomExample.java)
- [Print](src/ch02/sec10/PrintfExample.java)
- [Scanner](src/ch02/sec11/ScannerExample.java)
- [Arrays.sort](src/ch16/sec00/SortExample.java)