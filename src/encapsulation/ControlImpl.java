package encapsulation;

    import java.sql.SQLOutput;

    public class ControlImpl implements Control {

        private int volume;
        private Boolean turnOn;
        private Boolean playing;
        private int ch;



        private void setVolume(int volume) {
            this.volume = volume;
        }
        private int getVolume() {
            return volume;
        }
        private void setTurnOn(Boolean turnOn) {
            this.turnOn = turnOn;
        }
        private Boolean getTurnOn() {
            return turnOn;
        }
        private void setPlaying(Boolean playing) {
            this.playing = playing;
        }
        private Boolean getPlaying() {
            return playing;
        }
        private void setCh(int ch) {
            this.ch = ch;
        }
        private int getCh() {
            return ch;
        }



        public ControlImpl() {
            this.volume = 50;
            this.turnOn = false;
            this.playing = false;
        }

        public void turnOn() {
            this.setTurnOn(true);
        }
        public void turnOff() {
            this.setTurnOn(false);
        }
        public void openMenu() {
            System.out.println("---------- Menu ----------");
            System.out.println("it's on ? " + this.getTurnOn());
            System.out.println("it's playing? "+ this.getPlaying());
            System.out.println("Volume: "+ this.getVolume());
            System.out.println("CH: " + this.getCh());
            for(int i = 0; i <= this.getVolume(); i+= 10) {
                System.out.print("|");
            }
        }
        public void closeMenu() {
            System.out.println("closing Menu...");
        }
        public void moreVolume() {
            if(this.getTurnOn()) {
                this.setVolume(this.getVolume() + 10);
            }
        }
        public void lessVolume() {
            if(this.getTurnOn()) {
                this.setVolume(this.getVolume() - 10);
            }
        }
        public void turnOnMute() {
            if(this.getTurnOn() && this.getVolume() > 0) {
                this.setVolume(0);
            }
        }
        public void turnOffMute() {
            if(getTurnOn() && getVolume() == 0) {
                this.setVolume(50);
            }
        }
        public void play() {
            if(this.getTurnOn() && !(this.getPlaying())) {
                this.setPlaying(true);
            }
        }
        public void ch() {
            if(this.getTurnOn() && this.getPlaying()) {
                this.setCh(this.getCh() + 1);
            }
        }
        public void pause()  {
            if(this.getTurnOn() && this.getPlaying()) {
                this.setPlaying(false);
            }
        }

    }
