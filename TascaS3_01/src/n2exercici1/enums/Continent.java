package enums;

public enum Continent {

    AMERICA("America"),
    ASIA("Asia"),
    EUROPE("Europe");

    private String name;

    Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
