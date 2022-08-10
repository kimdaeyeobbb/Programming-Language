// 미완성 - 완성 후 다시 커밋 요망
package step2;

public class FriendVO {
    private String name;
    private int age;

    /* 생성자 */
    public FriendVO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* Getter & Setter */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* toString */
    @Override
    public String toString() {
        return "FriendVO[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }
}
