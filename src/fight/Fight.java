package fight;

import java.util.Random;

public class Fight {

        private Character challenger;
        private Character challenged;
        private int rounds;
        private Boolean approved;



        public Character getChallenger() {
            return challenger;
        }

        public void setChallenger(Character challenger) {
            this.challenger = challenger;
        }

        public Character getChallenged() {
            return challenged;
        }

        public void setChallenged(Character challenged) {
            this.challenged = challenged;
        }

        public int getRounds() {
            return rounds;
        }

        public void setRounds(int rounds) {
            this.rounds = rounds;
        }

        public Boolean getApproved() {
            return approved;
        }

        public void setApproved(Boolean approved) {
            this.approved = approved;
        }



        public void brandFight(Character p1,Character p2) {
            if(p1.getCategory() == p2.getCategory() && p1 != p2 && p1.getSex() == p2.getSex()) {
                this.approved = true;
                this.challenged = p1;
                this.challenger = p2;
            } else {
                this.approved = false;
                this.challenged = null;
                this.challenger = null;
            }
        }

        public void toFight() {
            if(approved == true) {
                System.out.println("### CHALLENGED ###");
                this.challenged.present();
                System.out.println("### CHALLENGER ###");
                this.challenger.present();

                Random random = new Random();
                int winner = random.nextInt(3);

                System.out.println("=====# Fight Result #=====");

                switch (winner) {
                    case 0:
                        System.out.println("Draw");
                        this.challenged.drawFight();
                        this.challenger.drawFight();
                        break;
                    case 1:
                        System.out.println("Winner " + this.challenged.getName());
                        this.challenged.winFight();
                        this.challenger.defeatFight();
                        break;
                    case 2:
                        System.out.println("Winner " + this.challenger.getName());
                        this.challenger.winFight();
                        this.challenged.defeatFight();
                        break;
                }
            } else {
                System.out.println("fight can't happen");
            }
            System.out.println("#=========================#");
        }
    }
