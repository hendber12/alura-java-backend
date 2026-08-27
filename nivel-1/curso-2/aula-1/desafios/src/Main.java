public class Main {
    public static void main(String[] args) {

        //------------------------------(1)------------------------------------
        System.out.println("- Desafio 1");
        Person pessoa = new Person();
        pessoa.imprimirOlaMundo();

        //------------------------------(2)------------------------------------
        System.out.println("\n- Desafio 2");
        Calculator calculadora = new Calculator();
        System.out.println(calculadora.calculaDobro(6.7));

        //------------------------------(3)------------------------------------
        System.out.println("\n- Desafio 3");
        Music musica1 = new Music();
        musica1.titulo = "Cold Weather";
        musica1.artista = "Glass Beach";
        musica1.anoLancamento = 2019;

        musica1.avaliaMusica(5);
        musica1.avaliaMusica(4);
        musica1.avaliaMusica(3);

        musica1.fazMedia();

        musica1.mostraFicha();

        //------------------------------(4)------------------------------------
        System.out.println("\n- Desafio 4");
        Car carro = new Car();
        carro.modelo = "civic";
        carro.cor = "Watizapi";
        carro.ano = 1945;

        carro.mostraFicha();
        carro.calculaIdade();

        //------------------------------(5)------------------------------------
        System.out.println("\n- Desafio 5");
        Student aluno = new Student();
        aluno.nome = "enzo";
        aluno.idade = 113;
        aluno.mostraFicha();

    }
}