public class Main {
    public static void main(String[] args) {
        int year = 2016;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Является високосным годом");
        } else if (year % 100 ==0 && year % 400 ==0) {
            System.out.println("Является високосным годом");
        } else {
            System.out.println("Не является высокосным годом");
        }
    }
}