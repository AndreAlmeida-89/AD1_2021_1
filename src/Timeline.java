public class Timeline {
    Rede rede;
    String timelineBody;

    public Timeline(Rede rede) {
        this.rede = rede;
    }

    private void buildTimelineBody() {
        StringBuilder timeline = new StringBuilder("");
        for (Amigo amigo : rede.amigos) {
            timeline.append(amigo.name).append(":\n");
            for (Post post : amigo.posts){
                timeline.append(post).append("\n");
            }
        }
        this.timelineBody = timeline.toString();
    }

    public String getTimelineBody() {
        buildTimelineBody();
        return timelineBody;
    }

}
