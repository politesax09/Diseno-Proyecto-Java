package Ataques2_decorator;

public class ConcreteComponent implements Component {


    @Override
    public void decorate() {
        System.out.println("Decorando...");
    }
}
