public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int ProductionYear = 2017;
        if (clientOS == 1 && ProductionYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && ProductionYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && ProductionYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && ProductionYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

    }
}