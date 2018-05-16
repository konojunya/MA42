package animal;

public abstract class AbstractAnimal {
    private String _name;

    public void setName(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public abstract String call();
}
