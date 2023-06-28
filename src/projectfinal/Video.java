package projectfinal;

public class Video implements ActionsVideo {
    private String title;
    private int assessment;
    private int views;
    private int like;
    private Boolean reproducing;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAssessment() {
        return assessment;
    }

    public void setAssessment(int assessment) {
        int nova;
        nova = (this.assessment + assessment)/ this.views;

        this.assessment = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public Boolean getReproducing() {
        return reproducing;
    }

    public void setReproducing(Boolean reproducing) {
        this.reproducing = reproducing;
    }

    public Video(String title) {
        this.title = title;
        this.assessment = 1;
        this.views = 0;
        this.like = 0;
        this.reproducing = false;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", assessment=" + assessment +
                ", views=" + views +
                ", like=" + like +
                ", reproducing=" + reproducing +
                '}';
    }

    @Override
    public void play() {
        this.reproducing = true;
    }

    @Override
    public void pause() {
        this.reproducing = false;
    }

    @Override
    public void like() {
        this.like ++;
    }

}
