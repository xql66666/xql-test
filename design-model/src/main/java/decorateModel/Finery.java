package decorateModel;

/**
 * Finery class
 *
 * @author qianlei.xu
 * @date 2021/3/1
 */
public class Finery extends Person{

    protected Person person;

    public void Finery(Person person) {
        this.person = person;
    }

    @Override
    public void Show() {
        if (person != null) {
            person.Show();
        }
    }
}
