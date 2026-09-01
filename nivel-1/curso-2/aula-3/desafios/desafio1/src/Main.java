public class Main {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();

        carro.setModelo("Octane");
        carro.setCor("Titanium White");
        carro.setPrecoAno1(1000);
        carro.setPrecoAno2(30000);
        carro.setPrecoAno3(600);

        System.out.println("\nModelo: " + carro.getModelo() + "\nCor: " + carro.getCor() + "\nMaior preço: " + carro.mostraMaior() + "\nMenor preço: " + carro.mostraMenor());
    }
}
