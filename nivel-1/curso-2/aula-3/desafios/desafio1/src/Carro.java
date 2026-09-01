public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public double mostraMenor(){
        if (precoAno1 < precoAno2 && precoAno1 < precoAno3) {
            return precoAno1;
        } else if (precoAno2 < precoAno3) {
            return precoAno2;
        } else {
            return precoAno3;
        }
    }
    
    public double mostraMaior(){
        if (precoAno1 > precoAno2 && precoAno1 > precoAno3) {
            return precoAno1;
        } else if (precoAno2 > precoAno3) {
            return precoAno2;
        } else {
            return precoAno3;
        }
    }
}
