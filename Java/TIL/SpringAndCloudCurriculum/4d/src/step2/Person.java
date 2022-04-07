package step2;

public class Person {
    private String name;
    // 생성자는 클래스 이름과 동일
    // 사용자가 작성을 하든 안하든 컴파일러가 자동으로 생성 (디폴트 생성자)
    // set메서드를 통해 private 변수에 값을 할당

    public Person(String n){
        // 생성자 Person은 클래스명과 동일
        System.out.println("생성자 실행 ");
        name = n;   // 매개변수를 통해 전역변수 초기화
    }

    /* get 메서드 - 값을 반환*/
    public String getName() {
        return name;
    }

    /* set 메서드 - 값을 얻어옴 */
    public void setName(String name) {
        this.name = name;
        // this.name -> this가 붙음: 전역변수
        // name -> 지역변수
    }
}
