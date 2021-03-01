package decorateModel;

/**
 * Main class
 *
 * @author qianlei.xu
 * @date 2021/3/1
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("小磊");
        Tshirt tshirt = new Tshirt();
        Kuzi kuzi = new Kuzi();
        Shoe shoe = new Shoe();

        tshirt.Finery(person);
        kuzi.Finery(tshirt);
        shoe.Finery(kuzi);
        shoe.Show();



    }

}
