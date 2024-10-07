package n1exercici1.enums;

public enum Size {

    SMALL ("small"),
    MEDIUM ("medium"),
    LARGE("large");

    private String name;

    Size(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
