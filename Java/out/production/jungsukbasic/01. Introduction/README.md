## 01. Introdcution

  
* 자바의 특징<br>
<STRONG>1) 운영체제(Operating System, 플랫폼)에 독립적 </STRONG><BR>
  - JVM은 자바 응용프로그램과 통신하여 전달받은 명령을 OS가 이해할 수 있도록 변환하여 전달함<BR>
  - JVM 자체가 OS에 종속적이고 OS별로 다른 JVM을 제공하므로 OS별로 프로그램을 변경하지 않고도 실행 가능<br>

  <STRONG>2) C++ 장점은 더하고 단점은 덜어냄</STRONG><BR>
  - 자바의 연산자와 기본구문은 C++에서 가져왔고, 객체지향 구문은 Small talk에서 가져옴<br>
  - 이 두개의 언어의 장점을 취하면서 단점은 제거하고 단순화했기 때문에 자바는 C++보다 러닝커브가 낮음<BR>
  - 자바의 간결성과 명료성 덕분에 러닝커브가 낮아져 객체지향언어의 재사용성과 유지보수의 용이성이 부각되었고,<br>
  객체지향 프로그래밍의 영역 확대에 기여함<br>
  (이전에는 객체지향언어가 배우기 어려웠기 때문에 객체지향언어의 장점이 부각되지 못하였음)<br>

  <STRONG>3) 풍부한 라이브러리(Java API) 보유</STRONG><BR>
  - 다양한 네트워크 프로그래밍 라이브러리(Java API)를 이용하여 단기간 내에 네트워크 프로그램 개발을 할 수 있음<br>
  
  <strong>4) 자동 메모리 관리</strong><br>
  - Java로 작성된 프로그램 실행시, garbage collector가 자동적으로 메모리 관리를 해주므로 별도의 메모리 관리가 필요하지 않음<br>
  
  <strong>5) 멀티스레드 지원</strong><br>
  - 자바상 멀티스레드 프로그램은 시스템과 관계없이 구현가능 (+관련 라이브러리 제공) => 구현이 쉬움<br>
  
  <strong>6) Dynamic Loading</strong><br>
  - 자바는 동적 클래스 로딩을 지원하므로 실행시 모든 클래스가 아닌 해당 시점에 필요한 클래스를 로딩하여 사용함<br>
  - 이로인해 일부 클래스가 변경되더라도 해당 애플리케이션을 모두 컴파일 할 필요가 없고, 변경사항에도 유연하게 대처할 수 있다<br><br><br>
  
  
* 에러 메시지<br>
  <strong>1) cannot find(resolve) symbol</strong><br>
  - 지정된 변수/메서드를 찾을 수 없다는 뜻<br>
  - 선언되지 않은 변수/메서드를 사용하거나, 변수명/메서드명을 잘못 사용한 경우 발생<br>
  
  <strong>2) ';' expected</strong><br>
  - 세미콜론(;)이 필요한 곳에 없다는 뜻<br>
  - 자바는 모든 문장의 끝에 세미콜론(;)을 붙여주어야 함<br>
  
  <strong>3) Exception in thread "main" java.lang.NoSuchMethodError: main</strong><br>
  - 'main'메서드를 찾을 수 없다는 뜻<br>
  - 클래스 내에 메인 메서드가 존재하지 않거나 메서드 선언부인 'public static void main(String[] args)'에 오타가 존재하는 경우 발생하는 에러<br>
  - 클래스 내에 메인 메서드가 정의하거나 메인 메서드의 선언부상 오타를 수정하여 에러를 해결하도록 하자<br>
  
  <strong>4) Exception in thread "main" java.lang.NoClassDefFoundError: Hello</strong><br>
  - 'Hello'클래스를 찾을 수 없다는 뜻<br>
  - 클래스의 대소문자를 확인하고 이상이 없을 경우 클래스파일(*.class)이 정상적으로 생성되었는지 확인하도록 하자<br>
  - 'Hello.java'가 정상적으로 컴파일된 경우 클래스파일 'Hello.class'가 존재해야 한다.<br>
  - 클래스 파일이 존재한데도 동일 에러 메시지가 반복되는 경우 클래스 경로 설정이 제대로 되었는지 확인해보는 것이 좋다<br>
  
  <strong>5) illegal start or expression</strong><br>
  - 문장내에 문법적 오류가 존재한다는 뜻<br>
  - 괄호 여닫는부분이 제대로 되었는지, 키워드를 잘못 사용하지 않았는지 등을 확인해보도록 하자<br>
  
  <strong>6) class, interface, or enum expected</strong><br>
  - 보통 괄호 '{', '}'의 개수가 일치하지 않는 경우 발생하는 에러<br>
  - 괄호의 짝이 맞는지 확인해보도록 하자<br><br>
