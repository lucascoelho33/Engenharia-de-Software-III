interface Animal {
    name: String;
    emitirSom(): void;
}

class Cachorro implements Animal {
    raca: string;

    constructor(name: String, raca: string) {
        this.raca = raca;
    }

    emitirSom(): void {
        console.log('Au! Au!');
    }

    abanarCauda(): void {
        console.log('A cauda está abanando.');
    }
}

class Gato implements Animal {
    cor: string;

    constructor(name: String, cor: string) {
        this.cor = cor;
    }

    emitirSom(): void {
        console.log('Miau!');
    }

    ronronar(): void {
        console.log('Ronronando.');
    }
}