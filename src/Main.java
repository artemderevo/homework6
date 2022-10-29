public class Main {
    public static void main(String[] args) {
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Сезон: зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон: весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон: лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон: осень");
            case 12:
                System.out.println("Сезон: зима");
                break;
            default:
                System.out.println("Ошибка");


        }

    }
}