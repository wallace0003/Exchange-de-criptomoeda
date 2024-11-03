package model;


public class Horas {
    private String h;
    private String m;

    public Horas(String h, String m) {
        this.h = h;
        this.m = m;
    }
    

    public void setH(String h) {
        this.h = h;
    }

    public void setM(String m) {
        this.m = m;
    }
    
    public String getH() {
        return h;
    }

    public String getM() {
        return m;
    }
       
}
