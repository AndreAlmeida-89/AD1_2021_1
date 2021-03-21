import java.util.ArrayList;

public class Amigo {
    String name;
    ArrayList<Post> posts = new ArrayList<Post>();

    public Amigo(String name) {
        this.name = name;
    }

    public void postar(Post post) {
        Post postagem = post;
        posts.add(postagem);
    }

    public void curtir(Post post) {
        post.adicionarCurtida(this);
    }

    public Post retornaPostMaisCurtido() {
        int quantidadePostMaisCurtido = 0;
        Post postMaisCurtido = new Post("Nenhum post");
        for (Post post : posts) {
            int numeroDeCurtidas = post.getNumeroCurtidas();
            if (numeroDeCurtidas > quantidadePostMaisCurtido) {
                postMaisCurtido = post;
            }
        }
        return postMaisCurtido;
    }

}
