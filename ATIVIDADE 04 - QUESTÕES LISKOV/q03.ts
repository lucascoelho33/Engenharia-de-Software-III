class Animal {
    private nome: String;

    public constructor(nome: String) {
        this.nome = nome;
    }

    emitirSom(){
        console.log('Fazer barulho');
    }
}

class Cachorro extends Animal {
    raca: string;

    public constructor(nome: String, raca: string) {
        super(nome);
    }

    emitirSom(): void {
        console.log('Au! Au!');
    }

    abanarCauda(){
        console.log('A cauda está abanando.');
    }
}

class Gato extends Animal {
    cor: string;

    public constructor(nome: String, cor: string) {
        super(nome);
    }

    emitirSom(): void {
        console.log('Miau!');
    }

    ronronar(){
        console.log('o gato está ronronando.')
    }
}