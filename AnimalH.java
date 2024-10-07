public class AnimalH {
    String nome;
    String som;

    AnimalH(String nome, String som) {
        this.nome = nome;
        this.som = som;
    }
    public void emitirSom(){
        System.out.println(nome+" " + som);
    }
    void mover(){
        System.out.println("nome "+ nome + " movendo");
    }
}

class Cachorro extends AnimalH {
    Cachorro(String nome){
        super(nome, "au au");
    }
    void mover(){
        System.out.println("nome "+ nome + " correndo");
    }
}

class Gato extends AnimalH{
    Gato(String nome){
        super(nome, "miau miau");
    }
    void mover(){
        System.out.println("nome"+ nome + "pulando");
    }
}

class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("gato");
        gato.emitirSom();
        gato.mover();
        Cachorro cachorro = new Cachorro("cachorro");
        cachorro.emitirSom();
        cachorro.mover();
    }
}
