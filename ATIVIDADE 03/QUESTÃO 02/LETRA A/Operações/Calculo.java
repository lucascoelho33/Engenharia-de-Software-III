import interface Operacao;

public class Soma implements Operacao {
    public double executar(double a, double b){
        return a + b;
    }
}

public class Subtracao implements Operacao {
    public double executar(double a, double b){
        return a - b;
    }
}

public class Multiplicacao implements Operacao {
    public double executar(double a, double b){
        return a * b;
    }
}

public class Divisao implements Operacao {
    public double executar(double a, double b){
        return a / b;
    }
}