package mirea__lab__4;

public class Human {
        private int head;
        private int leg;
        private int hand;
        public Human(int he, int l, int ha) {
            head = he;
            leg = l;
            hand = ha;
        }
        public Human(){
            head = 1;
            leg = 2;
            hand = 2;
        }
        public int getHead() {
            return head;
        }
        public int getLeg() {
            return leg;
        }
        public int getHand() {
            return hand;
        }


        public void setHead(int he) {
            this.head = he;
        }
        public void setLeg(int l) {
            this.leg = l;
        }
        public void setHand(int ha) {
            this.hand = ha;
        }


}
