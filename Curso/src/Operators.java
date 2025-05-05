public class Operators {
    //      + - * /

    int num1 = 10;
    int num2 = 20;
    int result1 = num1 - num2;
    int result2 = num1 + num2;
    int result3 = num1 * num2;
    double result4 = num1 / (double) num2;

    //      Leftover %
    int result5 = num1 % num2;

    //      < > <= >= == !=

    boolean result6 = 10 > 20;
    boolean result7 = 10 < 20;
    boolean result8 = 10 >= 20;
    boolean result9 = 10 <= 20;
    boolean result10 = 10 == 20;
    boolean result11 = 10 != 20;

    //      && (and) || (or)
    int idade = 19;
    double salario = 2400;

    boolean dentroDaLei = idade > 18 && salario >= 2000;
    boolean foraDaLei = idade < 18 || salario <= 2000;

    // += -= *= /=
    public void Continue(){
        int value = 10;
        value += 10;
        value -= 10;
        value *= 2;
        value /= 4;
    }

    public void Counter(){
        int count = 0;

        count++;
        count--;

        --count;
        ++count;
    }
}
