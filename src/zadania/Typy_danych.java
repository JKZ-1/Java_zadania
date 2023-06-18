package zadania;

public class Typy_danych {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;

        int sumA = num1 + num2;
        int sumB = num3 + num4;

        if (sumA % 2 == 0) {
            System.out.println("suma dwóch pierwszych liczb jest parzysta");
        }

        if (sumB % 2 == 0) {
            System.out.println("suma dwóch pozostałych liczb jest parzysta");
        }

        if (sumA % 2 == 0 && sumB % 2 == 0) {
            System.out.println("wszystkie liczby są parzyste");
        }

    }
}


