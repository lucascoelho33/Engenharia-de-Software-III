class Retangulo {
    protected int largura;
    protected int altura;

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int calcularArea() {
        return largura  altura;
    }
}

class Quadrado extends Retangulo {
    public void setLargura(int largura) {
        super.setLargura(largura);
        super.setAltura(altura);
    }

    public void setAltura(int altura) {
        super.setAltura(altura);
        super.setLargura(largura);
    }
}