import ru.netology.javaqa.Moneymvn.services.WorkRestService;


public class Main {
    public static void main(String[] args) {
        WorkRestService service = new WorkRestService();
        int income = 100_000; // доход в месяц
        int expenses = 60_000; // траты в месяц
        int threshold = 150_000; // предел
        int month = service.calculate(income, expenses, threshold);

        System.out.print(" 1. Количество месяцев отдыха в году составляет " + month + " месяца ");

    }
}
