

public class Carro {
    private Rueda [] rueda = new Rueda[4];
    private Chasis chasis;
    private Motor motor;
    public Carro(int radioRuedas, String nombreChasis, Motor motor) {
        for(int i = 0; i < 4; i++) rueda[i] = new Rueda(radioRuedas);
        this.chasis = new Chasis(nombreChasis);
        this.motor = motor;
    }

    public Rueda[] getRueda() {
        return rueda;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setRueda(Rueda[] rueda) {
        this.rueda = rueda;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
}
