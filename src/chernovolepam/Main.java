package chernovolepam;


public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Viev viev = new Viev();
        Controller controller = new Controller(model, viev);
        controller.processUser();
    }
}
