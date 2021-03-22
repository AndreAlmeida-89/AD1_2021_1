import java.util.ArrayList;

public class Amigo {
    String name;
    ArrayList<Post> posts = new ArrayList<Post>();
    Post postMaisCurtido;

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

    private void setPostMaisCurtido() {
        int quantidadePostMaisCurtido = 0;
        this.postMaisCurtido = new Post("Nenhum");
        if (posts.size() > 0) {
            for (Post post : posts) {
                int numeroDeCurtidas = post.getNumeroCurtidas();
                if (numeroDeCurtidas > quantidadePostMaisCurtido) {
                    this.postMaisCurtido = post;
                }
            }
        }
    }



    public Post retornaPostMaisCurtido() {
        setPostMaisCurtido();
        return this.postMaisCurtido;
    }

}
