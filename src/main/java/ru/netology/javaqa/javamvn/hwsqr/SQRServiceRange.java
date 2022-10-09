package ru.netology.javaqa.javamvn.hwsqr;

public class SQRServiceRange {

    public int numberSqrt(int low, int high){
        int number = 0;

        for (int i = 10; i < 100; i++) {

            if (i * i < 200) continue;
            if (i * i > 300) break;

            number++;
        }
        return number;
    }

}
