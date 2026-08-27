public class Car {
    String modelo;
    String cor;
    int ano;

    public void mostraFicha (){
        System.out.println("modelo = " + modelo);
        System.out.println("cor = " + cor);
        System.out.println("ano = " + ano);
    }

    public void calculaIdade (){
        int idade = 2026 - ano;
        System.out.println("idade = " + idade);
    }
}
