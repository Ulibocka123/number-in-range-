package ru.netology.sqr;

public class SQRService {

    public int countNumbersInRange(int lowerBorder, int upperBorder) {

        int numbersInRange = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerBorder && i * i <= upperBorder) {
                numbersInRange++;
            }
        }
        return numbersInRange;
    }
}