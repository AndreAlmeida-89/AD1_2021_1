import java.util.ArrayList;

public class Post {
    String message;
    ArrayList<Curtida> curtidas = new ArrayList<Curtida>();


    public Post(String message) {
        this.message = message;
    }

    public int getNumeroCurtidas() {
        return curtidas.size();
    }

    public void adicionarCurtida(Amigo amigo) {
        Curtida curtida = new Curtida(amigo);
        curtidas.add(curtida);
    }

    @Override
    public String toString() {
        return message + ": " + curtidas.size() + " curtidas";
    }

    public String retornaNomesQueCurtiram() {
        StringBuilder nomesQueCurtiram = new StringBuilder();
        for (Curtida curtida : curtidas) {
            String nomeAutor = curtida.getAutor().name;
            nomesQueCurtiram.append(nomeAutor).append(" ");
        }
        return nomesQueCurtiram.toString();
    }
}
