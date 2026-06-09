class Applet {
    void launch() {
        System.out.println("Applet launched");
    }
}
class GameApplet extends Applet {
    void play() {
        System.out.println("Playing game");
    }
}

class Main {
    public static void main(String[] args) {
         GameApplet gameApplet = new GameApplet();
         gameApplet.launch();
         gameApplet.play();
         
    }
}
