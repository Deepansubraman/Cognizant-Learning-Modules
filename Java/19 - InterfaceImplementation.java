interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Guitar is playing");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Piano is playing");
    }
}

class interfaceImplementation{
    public static void main(String[] args) {
        Playable g = new Guitar();
        Playable p = new Piano();
        g.play();
        p.play();
    }
}
