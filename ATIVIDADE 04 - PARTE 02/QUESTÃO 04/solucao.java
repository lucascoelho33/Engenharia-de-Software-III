class Figura {
    public void desenhar() {
        System.out.println('Desenhando uma figura');
    }
}

class Retangulo extends Figura {
    protected int largura;
    protected int altura;

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void desenhar() {
        System.out.println('Desenhando um retângulo');
    }
}

class Quadrado extends Figura {
    protected int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void desenhar() {
        System.out.println('Desenhando um quadrado');
    }
}