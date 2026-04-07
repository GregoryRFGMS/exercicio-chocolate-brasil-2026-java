import java.util.Scanner;
import java.util.Locale;

public class FiscalizacaoChocolate {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.println("--- SISTEMA DE FISCALIZAÇÃO PASCOA 2026 ---");

        System.out.print("Digite o percentual de cacau da amostra: ");
        double porcentagemCacau = leitor.nextDouble();

        if (porcentagemCacau < 25) {
            System.out.println("Status: ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate'.");
        } else if (porcentagemCacau >= 25 && porcentagemCacau < 35) {
            System.out.println("Status: Chocolate Comum (Padrão Nacional Atual).");
        } else {
            System.out.println("Status: Chocolate de Alta Qualidade (Padrão Internacional/UE).");
        }

        System.out.print("\nDigite o tipo de chocolate (AO_LEITE/AMARGO): ");
        String categoria = leitor.next();
        
        System.out.print("Gramas de açúcar: ");
        int gramasAcucar = leitor.nextInt();

        if (categoria.equalsIgnoreCase("AO_LEITE") && gramasAcucar > 15) {
            System.out.println("Status: Classificação: Doce de leite com cacau (Excesso de açúcar).");
        } else {
            System.out.println("Status: Classificação: Chocolate balanceado.");
        }

        System.out.print("\nDigite o preço do ovo de Páscoa: ");
        double valorOvo = leitor.nextDouble();
        
        System.out.print("Digite a nota de pureza (0 a 10): ");
        double notaQualidade = leitor.nextDouble();

        if (valorOvo > 100.00 || notaQualidade < 5) {
            System.out.println("Status: REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões.");
        } else {
            System.out.println("Status: APROVADO: Produto competitivo para o mercado externo.");
        }

        System.out.println("-------------------------------------------");

        leitor.close();
    }
}
