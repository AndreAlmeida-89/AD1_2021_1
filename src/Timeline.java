public class Timeline {
    Rede rede;
    String timelineBody;

    public Timeline(Rede rede) {
        this.rede = rede;
    }

    private void setTimelineBody() {
        StringBuilder timeline = new StringBuilder("");
        if(rede.amigos.size() > 0) {
            for (Amigo amigo : rede.amigos) {
                timeline.append(amigo.name).append(":\n");
                for (Post post : amigo.posts) {
                    timeline.append(post).append("\n");
                }
            }
            this.timelineBody = timeline.toString();
        }else {
            this.timelineBody = "Nenhum amigo adicionado há rede. =(";
        }

    }

    public String getTimelineBody() {
        setTimelineBody();
        return timelineBody;
    }

}
