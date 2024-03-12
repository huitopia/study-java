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
    - [this]((src/ch06/sec09))
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

## 기타

- [Math.random()](src/ch04/sec01/MathRandomExample.java)
- [Print](src/ch02/sec10/PrintfExample.java)
- [Scanner](src/ch02/sec11/ScannerExample.java)