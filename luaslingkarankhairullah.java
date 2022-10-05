package tugaspbo;

public class luaslingkarankhairullah extends luaslingkarankhairullahh {

    private int phi;
    private int jarijari;
    private double luas;

    public int getPhi() {
        return phi;
    }

    public void setPhi(int phi) {
        this.phi = phi;
    }

    public int getJarijari() {
        return jarijari;
    }

    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }

    public double getLuas() {
        luas = phi * jarijari * jarijari;
        return luas;
    }
}
