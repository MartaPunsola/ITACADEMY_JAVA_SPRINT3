package n1exercici1.enums;

public enum DoughType {

    WHITE ("white"),
    WHOLEWEAT("wholeweat"),
    GLUTENFREE("glutenfree");

    private String name;

    DoughType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
