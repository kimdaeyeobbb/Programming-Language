package step2;

public class Person {
    private String name;
    // set메서드를 통해 private 변수에 값을 할당
    // private을 붙이고 나서 외부에서 사용은 하되 수정은 못하도록 만들고 싶을경우
    // setter만 선언해주지 않으면 외부에서 객체로 접근했을 때, getter에 있어서
    // 사용은 가능하지만 setter가 없어서 수정 및 변경이 불가능하다.

    public Person(String n){
        // 생성자명 Person은 클래스명과 동일
        System.out.println("생성자 실행 ");
        name = n;   // 매개변수를 통해 전역변수 초기화
    }

    /* get 메서드 - 값을 반환, 값을 조회 */
    // 변수별로 get함수를 지정한 다음, 원하는 변수 get만 호출하여 필요한 값만 조회
    public String getName() {
        return name;
    }

    /* set 메서드 - 값을 얻어옴 */
    // set 메서드를 통해 private 변수에 값을 할당
    // setter는 private이 붙은 대상의 값을 외부에서 수정할 수 있도록 만들어줌
    public void setName(String name) {
        this.name = name;
        // this.name -> this가 붙음: 전역변수
        // name -> 지역변수
    }
}