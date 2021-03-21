import java.util.ArrayList;

public class Rede {

    ArrayList<Amigo> amigos = new ArrayList<Amigo>();


    public void adicionarAmigo(Amigo amigo) {
        amigos.add(amigo);
    }

    public String timeline() {
        StringBuilder timeline = new StringBuilder("");
        for (Amigo amigo : amigos) {
            timeline.append(amigo.name).append(":\n");
            for (Post post : amigo.posts){
                timeline.append(post.message).append(": ").append(post.getNumeroCurtidas()).append("\n");
            }
        }
        return timeline.toString();

    }

}

