import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // Validaçao de nome
        System.out.println("Voce é Evelynn ou Rafaella?");
        String nome = scan.nextLine();
        while (!(nome.equalsIgnoreCase("Evelynn") || nome.equalsIgnoreCase("Rafaella"))){
                System.out.println("Nome desconhecido, tente novamente");
                System.out.println("Voce é Evelynn ou Rafaella?");
                nome = scan.nextLine();
        }
        //
        //Validaçao do valor
        double valor = 0;
        boolean valorValid = false;
        while (!valorValid){
            try {
                System.out.println("Digite o valor recebido:");
                valor = scan.nextDouble();
                valorValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Valor invalido!");
                System.out.println("(Lembre-se de utilizar ,)");
                scan.next();
            }
        }
        double valorEnd = valor;
        double passagem = 2.70;
        LocalDate ContadorDias = LocalDate.now();

        if (nome.equalsIgnoreCase("Rafaella")) {
            // Caso seja Rafaella executa esse bloco
            // Looping para contar o numero de dias de passagem
            while (valorEnd >= passagem){
                ContadorDias = ContadorDias.plusDays(1);
                 if (ContadorDias.getDayOfWeek() == DayOfWeek.WEDNESDAY || ContadorDias.getDayOfWeek() == DayOfWeek.FRIDAY || ContadorDias.getDayOfWeek() == DayOfWeek.SATURDAY) {
                    valorEnd = valorEnd - (passagem*2);
                }else if (!(ContadorDias.getDayOfWeek() == DayOfWeek.MONDAY)){
                    valorEnd = valorEnd - (passagem*3);
                }
            }
            // Retorno personalizado mediante aos resultados
            var formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            var ContadorDiasFormat = formatador.format(ContadorDias);
            NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            nf.setMinimumIntegerDigits(2);

            if (valorEnd < 0 ) {
                System.out.printf("Carregando seu passe hoje no valor de %s, ele ira durar até %s porém, no ultimo dia faltaria %s.", nf.format(valor), ContadorDiasFormat, nf.format(valorEnd));
            } else if (valorEnd > 0) {
                System.out.printf("Carregando seu passe hoje no valor de %s, ele ira durar até %s e sobraria um valor de %s.", nf.format(valor), ContadorDiasFormat, nf.format(valorEnd));
            } else {
                System.out.printf("Carregando seu passe hoje no valor de %s, ele ira durar até %s.", nf.format(valor), ContadorDiasFormat);
            }


        }
        else {
            // Caso seja Evelynn executa esse bloco
            // Looping para contar o numero de dias de passagem
            while (valorEnd >= passagem){
                ContadorDias = ContadorDias.plusDays(1);
                if (!(ContadorDias.getDayOfWeek() == DayOfWeek.FRIDAY || ContadorDias.getDayOfWeek() == DayOfWeek.SATURDAY || ContadorDias.getDayOfWeek() == DayOfWeek.MONDAY)) {
                    valorEnd = valorEnd - (passagem * 2);
                }
            }
            // Retorno personalizado mediante aos resultados
            var formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            var ContadorDiasFormat = formatador.format(ContadorDias);
            NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            nf.setMinimumIntegerDigits(2);

            if (valorEnd < 0 ) {
                System.out.printf("Carregando seu passe hoje no valor de %s, ele ira durar até %s porém, no ultimo dia faltaria %s.", nf.format(valor), ContadorDiasFormat, nf.format(valorEnd));
            } else if (valorEnd > 0) {
                System.out.printf("Carregando seu passe hoje no valor de %s, ele ira durar até %s e sobraria um valor de %s.", nf.format(valor), ContadorDiasFormat, nf.format(valorEnd));
            } else {
                System.out.printf("Carregando seu passe hoje no valor de %s, ele ira durar até %s.", nf.format(valor), ContadorDiasFormat);
            }
        }

    }

}
