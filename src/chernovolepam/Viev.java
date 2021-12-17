package chernovolepam;

public class Viev {
  public void printInput(String value){
      System.out.println("Input" + value + ":");
  }
  public void printHelloWorld(Model model){
    String nameHello = model.getNameHello();
    String nameWorld = model.getNameWorld();
    if(nameHello != null && nameHello.equals("Hello") && nameWorld != null && nameWorld.equals("world!")){
        System.out.println(nameHello +" "+ nameHello);
    }else{
        System.out.println("Not \"Hello world!\", Sorry");
    }
  }
}
