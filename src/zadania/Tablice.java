package zadania;

public class Tablice {

    public static void main(String[] args) {
        //1
        System.out.println("Zamiana elementu pierwszego z ostatnim: ");
        int[] numbers = {1, 2, 3, 4, 5};

        int first = numbers[0];
        numbers[0] = numbers[4];
        numbers[4] = first;

        for (int number : numbers){
            System.out.println(number);
        }
        //2
        int[] numbers2 = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};
        int even = 0;
        int odd = 0;

        for (int i=0; i < numbers2.length; i++){
            if (i % 2 == 0) {
                even += 1;
            } else {
                odd +=1;
            }
        }
        System.out.println("Liczby parzyste: " + even);
        System.out.println("Liczby nieparzyste: " + odd);
        //3
        System.out.println("Sortowanie rosnąco: ");
        int[] numbers3 = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
        int min;
        for (int i = 0; i < numbers3.length; i++){
            min = numbers3[i];
            for(int j = i+1; j < numbers3.length; j++){
                if (numbers3[j] < min){
                    min = numbers3[j];
                    numbers3[j] = numbers3[i];
                    numbers3[i] = min;
                }
            }
        }
        for (int number : numbers3){
            System.out.println(number);
        }
        //4
        System.out.println("Sortowanie malejąco: ");
        int[] numbers4 = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
        int max;
        for (int i = 0; i<numbers4.length; i++){
            max = numbers4[i];
            for (int j = i+1; j<numbers4.length; j++){
                if (numbers4[j] > max){
                    max = numbers4[j];
                    numbers4[j] = numbers4[i];
                    numbers4[i] = max;
                }
            }
        }
        for (int number : numbers4){
            System.out.println(number);
        }
    }
}
