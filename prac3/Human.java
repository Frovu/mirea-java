class Head {
    private int iq = 99;
    private boolean hat = false;

    public void setIq(int n) {
        this.iq = n;
    }
    public void setHat(boolean n) {
        this.hat = n;
    }

    public int getIq() {
        return iq;
    }
    public boolean getHat() {
        return hat;
    }
}

class Hand {
    private boolean glove = false;

    public void setGlove(boolean n) {
        this.glove = n;
    }

    public boolean getGlove() {
        return glove;
    }
}

class Leg {
    private boolean boot = false;

    public void setBoot(boolean n) {
        this.boot = n;
    }

    public boolean getBoot() {
        return boot;
    }
}

public class Human {
    public Head head = new Head();
    public Hand leftHand = new Hand();
    public Hand rightHand = new Hand();
    public Leg leftLeg = new Leg();
    public Leg rightLeg = new Leg();

    public void undress() {
        head.setHat(false);
        leftHand.setGlove(false);
        rightHand.setGlove(false);
        leftLeg.setBoot(false);
        rightLeg.setBoot(false);
    }

    public String toString() {
        return " " + (head.getHat() ? 'ô' : 'o')
            + "\n/|\\"
            + "\n/ \\";
    }
}
