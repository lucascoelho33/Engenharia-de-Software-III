class CalculadoraImpostoDeRenda {
    private List<Double> rendimentos;
    private List<Double> despesas;

    public double calcular() {
        double rendaTotal = rendimentos.stream().mapToDouble(Double::doubleValue).sum();
        double despesaTotal = despesas.stream().mapToDouble(Double::doubleValue).sum();
        double baseCalculo = rendaTotal - despesaTotal;

        if(baseCalculo <= 2112.00){
            return 0.0;
        }
        if(baseCalculo >= 2112.01 && baseCalculo <= 2826.65) {
            return baseCalculo * 0.075 - 158.40;
        }
        if(baseCalculo >= 2826.66 && baseCalculo <= 3751.05) {
            return baseCalculo * 0.15 - 370.40;
        }
        if(baseCalculo >= 3751.06 && baseCalculo <= 4664.68) {
            return baseCalculo * 0.225 - 651.73;
        }
        if(baseCalculo > 4664.68) {
            return baseCalculo * 0.275 - 884.96;
        }
    }
}