import java.util.ArrayList;

public class Post {
    String message;
    ArrayList<Curtida> curtidas = new ArrayList<Curtida>();
    String nomesQueMaisCurtiram;

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

    private void setNomesQueCurtiram() {
        StringBuilder nomes = new StringBuilder();
        if(curtidas.size() > 0) {
            for (Curtida curtida : curtidas) {
                String nomeAutor = curtida.getAutor().name;
                nomes.append(nomeAutor).append(" ");
            }
            this.nomesQueMaisCurtiram = nomes.toString();
        }else{
            this.nomesQueMaisCurtiram = "Ninguém curtiu esse post! =(";
        }
    }

    public String retornaNomesQueCurtiram() {
        setNomesQueCurtiram();
        return nomesQueMaisCurtiram;
    }
}
