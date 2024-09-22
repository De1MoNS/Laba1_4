public class Main
{
    public static void main(String[] args)
    {
        double sum = calculateSeriesSum();
        System.out.printf("Сумма ряда: %.6f%n", sum);
    }
    public static double calculateSeriesSum()
    {
        double sum = 0.0;
        double term;
        int n = 2;
        do
        {
            term = 1.0 / (n * n + n - 2);
            sum += term;
            n++;
        }
        while (term >= 1e-6);
        return sum;
    }
}