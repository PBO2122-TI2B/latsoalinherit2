package Hierarchical;

public class Main {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        Cats c = new Cats();
        Monkeys m = new Monkeys();

        d.kelasVertebrata = "Mamalia";
        d.breathe();
        d.eat();
        d.bark();

        c.kelasVertebrata = "Mamalia";
        c.breathe();
        c.eat();
        c.meow();

        m.kelasVertebrata = "Mamalia";
        m.breathe();
        m.eat();
        m.swing();
    }
}
