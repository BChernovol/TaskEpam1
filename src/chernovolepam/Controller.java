package chernovolepam;

import java.util.Scanner;

public class Controller {
    private Model model;
    private  Viev viev;


    public Controller(Model model, Viev viev) {
        this.model = model;
        this.viev = viev;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setView(Viev viev) {
        this.viev = viev;
    }

    public Model getModel() {
        return model;
    }

    public Viev getView() {
        return viev;
    }

    public void processUser(){
        Scanner scan = new Scanner(System.in);
        inputHello(scan);
        inputWorld(scan);
        viev.printHelloWorld(model);
    }

    void inputHello(Scanner scan){
        viev.printInput("Hello");
        String nameHello = scan.nextLine();
        if(nameHello.equals("Hello")){
            model.setNameHello(nameHello);
        }
    }

    void inputWorld(Scanner scan){
        viev.printInput("world!");
        String nameWorld = scan.nextLine();
        if(nameWorld.equals("world!")){
            model.setNameWorld(nameWorld);
        }
    }

}
