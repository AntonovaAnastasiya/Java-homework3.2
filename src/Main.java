public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        float result = service.calculate(53.3f, 1.6f);
        System.out.println("Индекс массы тела " + result);
    }
}
