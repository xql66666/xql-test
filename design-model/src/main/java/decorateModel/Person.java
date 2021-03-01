package decorateModel;

/**
 * Person class
 *
 * @author qianlei.xu
 * @date 2021/3/1
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void Show() {
        System.out.println("装扮的-" + name);
    }
}
