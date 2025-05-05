public class PrimitiveTypes {

    // int, double,float, char, byte, short, long, boolean
    byte num = 1;
    int num1 = 19;
    double num2 = 50.12;
    char num3 = 'A';
    short num4 = 30;
    long num5 = 4943049034903943344L;
    boolean num6 = true;
    boolean num7 = false;
    float num8 = 17.9F;
    String nome = "Eduardo";


    public static void main(String[] args){
        // Activity 01

        String nome = "Eduardo";
        String endereco = "Rua Assim Bairro Assado";
        double salario = 2350.98;
        String dataRecebimento = "04/02/2025";

        String relatorio = "Eu "+nome+", morando no endereco "+ endereco+
                " confirmo que recebi o salario de R$"+ salario+" na data "+ dataRecebimento;

        System.out.println(relatorio);
    }
}
