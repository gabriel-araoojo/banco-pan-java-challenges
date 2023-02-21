import java.util.*;
import java.lang.Math;

public class Challenge {

    public static void leapYear() {
        Scanner tempScanner = new Scanner(System.in);
        int year = tempScanner.nextInt();

        if((year % 4) == 0) {
            System.out.println("Leap year");
        }

        else {
            System.out.println("Not leap year");
        }
    }

    public static void differenceBetweenDigits() {
        Scanner tempScanner = new Scanner(System.in);
        int scannedNumber = tempScanner.nextInt();

        String numberAsString = String.valueOf(scannedNumber);
        int numberOfDigits = numberAsString.length();

        int digitsProduct = 1, digitsSum = 0, finalResult, tempDigit;

        for(int i = (numberOfDigits - 1); i >= 0; i--) {
            tempDigit = (int)(scannedNumber / ((int)(Math.pow(10, i))));
            scannedNumber -= tempDigit * ((int)(Math.pow(10, i)));

            digitsProduct *= tempDigit;
            digitsSum += tempDigit;
        }

        finalResult = digitsProduct - digitsSum;

        System.out.println(finalResult);
    }

    public static void exceedingV() {
        Scanner tempScanner = new Scanner(System.in);

        int R = tempScanner.nextInt();

        int V = R - 1;

        while(V <= R) {
            V = tempScanner.nextInt();
        }

        // not very smart, but it'll work
        // (it didn't completely work actually
        int intAmount = 1, tempSum = 0, firstMember = 0;
        while(intAmount < 40) {
            for(int i = 0; i < intAmount; i++) {
                firstMember += R - i;
            }

            if(firstMember > V) {
                System.out.println(intAmount);
                break;
            }

            tempSum = firstMember;

            for(int i = 1; i < intAmount; i++) {
                tempSum += intAmount;

                if(tempSum > V) {
                    System.out.println(intAmount);
                    break;
                }
            }

            if(tempSum > V) {
                break;
            }

            intAmount++;
        }

    }

    public static void carFactory() {
        Scanner scan = new Scanner(System.in);

        int rawPrice, distributerPercentage, taxPercentage;
        int finalPrice;

        rawPrice = scan.nextInt();
        distributerPercentage = scan.nextInt();
        taxPercentage = scan.nextInt();

        finalPrice = (
                (rawPrice * distributerPercentage) +
                (rawPrice * taxPercentage)
                );

        finalPrice /= 100;
        finalPrice += rawPrice;

        System.out.println(finalPrice);
    }

    public static void showPositivesAndMean() {
        Scanner tempScanner = new Scanner(System.in);
        int numberOfPositives = 0;
        double tempNumber = 0;
        double mean = 0;

        for(int i = 0; i < 6; i++) {
            tempNumber = tempScanner.nextFloat();

            if(tempNumber > 0) {
                mean += tempNumber;
                numberOfPositives++;
            }
        }

        mean /= numberOfPositives;

        System.out.println(numberOfPositives + " valores positivos");
        System.out.println(String.format("%.1f", mean));
    }

    public static void infiniteSeries() {
        Scanner tempScanner = new Scanner(System.in);

        int N = tempScanner.nextInt();
        double H = 0;

        for(double i = 1; i <= N; i++) {
            H += (1 / i);
        }

        System.out.println(String.format("%.2f", H));
    }
}
