package projectfinal;

public class Visualization {
    private Viewer spectator;
    private Video movie;


    public Viewer getSpectator() {
        return spectator;
    }

    public void setSpectator(Viewer spectator) {
        this.spectator = spectator;
    }

    public Video getMovie() {
        return movie;
    }

    public void setMovie(Video movie) {
        this.movie = movie;
    }


    public Visualization(Viewer spectator, Video movie) {
        this.spectator = spectator;
        this.movie = movie;
        this.spectator.setWatching(this.spectator.getWatching() + 1);
        this.movie.setViews(this.movie.getViews() + 1);
    }

    public void assess() {
        this.movie.setAssessment(5);
    }
    public void assess(int note) {
        this.movie.setAssessment(note);
    }
    public void assess(Double percentage) {
        int total = 0;
        if(percentage <= 20) {
            total = 3;
        } else if(percentage <= 50) {
            total = 5;
        } else if(percentage <= 90) {
            total = 8;
        } else {
            total = 10;
        }
        this.movie.setAssessment(total);
    }

    @Override
    public String toString() {
        return "Visualization{" +
                "spectator=" + spectator +
                ", movie=" + movie +
                '}';
    }

}
