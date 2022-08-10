package step8;

public class Engineer {
    private String name;
    private Notebook notebook;

    /* 생성자 - 객체를 새로 생성할 때 사용 */
    public Engineer(String name, Notebook notebook) {
        this.name = name;
        this.notebook = notebook;
    }


    /* get&set - 메서드 */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }
}
