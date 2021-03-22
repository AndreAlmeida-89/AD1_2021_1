import java.util.ArrayList;

public class Rede {
    ArrayList<Amigo> amigos = new ArrayList<Amigo>();

    public void adicionarAmigo(Amigo amigo) {
        amigos.add(amigo);
    }

    public String timeline(){
        Timeline timeline = new Timeline(this);
        return timeline.getTimelineBody();
    }

}

