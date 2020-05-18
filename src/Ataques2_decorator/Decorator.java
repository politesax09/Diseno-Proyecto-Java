package Ataques2_decorator;

public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void decorate() {
        component.decorate();
    }
}
