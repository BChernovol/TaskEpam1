package chernovolepam;

public class Model {
    private String nameHello;
    private String nameWorld;

    public Model() {
    }

    public Model(String nameHello, String nameWorld) {
        this.nameHello = nameHello;
        this.nameWorld = nameWorld;
    }

    public String getNameHello() {
        return nameHello;
    }

    public void setNameHello(String nameHello) {
        this.nameHello = nameHello;
    }

    public String getNameWorld() {
        return nameWorld;
    }

    public void setNameWorld(String nameWorld) {
        this.nameWorld = nameWorld;
    }
}

