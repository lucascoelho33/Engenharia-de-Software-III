import java.util.List;

public void geraRelatorio() {
    System.out.println("CPF" + cpfContribuinte);
    System.out.println("Rendimentos" + rendimentos);
    System.out.println("Despesas" + despesas);
    System.out.println("Imposto Devido" + calcular());
}