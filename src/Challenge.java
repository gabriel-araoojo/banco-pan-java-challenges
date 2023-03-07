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

        System.out.println(String.format("%.0f", H));
    }

    public static void fibonacciSequence() {
        Scanner tempScanner = new Scanner(System.in);

        int firstMember = 0, secondMember = 1;
        int N = tempScanner.nextInt();

        if(N == 0) {
            System.out.print("0");
        }
        
        if(N == 1) {
            System.out.print("0");
        }
        
        if(N > 1) {
            System.out.print("0 ");

            int currentMember = 1;

            for(int i = 0; i < (N - 2); i++) {
                System.out.print(currentMember + " ");

                currentMember = firstMember + secondMember;
                firstMember = secondMember;
                secondMember = currentMember;
            }

            System.out.print(currentMember);
        }
    }

    public static void areaOrPerimeter() {
        Scanner tempScanner = new Scanner(System.in);

        double A, B, C;

        A = tempScanner.nextDouble();
        B = tempScanner.nextDouble();
        C = tempScanner.nextDouble();

        boolean isTriangle = (
                (A + B > C) &&
                (B + C > A) &&
                (C + A > B)
                );

        if(isTriangle) {
            double trianglePerimeter = A + B + C;

            System.out.println("Perimetro = " + String.format("%.1f", trianglePerimeter));
        }

        else {
            double trapezoidArea = (A + B) * (C / 2);

            System.out.println("Area = " + String.format("%.1f", trapezoidArea));
        }
    }

     public static void animal() {
        HashMap<String, String> auxHashMap = new HashMap<>();

        auxHashMap.put("vertebrado ave carnivoro", "aguia");
        auxHashMap.put("vertebrado ave onivoro", "pomba");
        auxHashMap.put("vertebrado mamifero onivoro", "homem");
        auxHashMap.put("vertebrado mamifero herbivoro", "vaca");
        auxHashMap.put("invertebrado inseto hematofago", "pulga");
        auxHashMap.put("invertebrado inseto herbivoro", "lagarta");
        auxHashMap.put("invertebrado anelideo hematofago", "sanguessuga");
        auxHashMap.put("invertebrado anelideo onivoro", "minhoca");

        Scanner tempScanner = new Scanner(System.in);

        String line1, line2, line3;

        line1 = tempScanner.nextLine();
        line2 = tempScanner.nextLine();
        line3 = tempScanner.nextLine();

        String auxString = line1 + " " + line2 + " " + line3;

        System.out.println(auxHashMap.get(auxString));
     }

     public static void traderJoes() {
        Scanner tempScanner = new Scanner(System.in);

        double apples, strawberries, applesPrice, strawberriesPrice, totalPrice;

        strawberries = tempScanner.nextDouble();
        apples = tempScanner.nextDouble();

        if(strawberries > 5) {
            strawberriesPrice = strawberries * 2.2;
        }

        else {
            strawberriesPrice = strawberries * 2.5;
        }

        if(apples > 5) {
            applesPrice = apples * 1.5;
        }

        else {
            applesPrice = apples * 1.8;
        }

        totalPrice = strawberriesPrice + applesPrice;

        if(
                ((strawberries + apples) > 8) ||
                (totalPrice > 25)
        ) {
            totalPrice *= 0.9;
        }

        System.out.println(totalPrice);
     }

    public static void calculateTaxes() {
        Scanner leitor = new Scanner(System.in);
    double renda = leitor.nextDouble();
    double imposto = 0;
 
      //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:
    if(renda <= 2000) {
      System.out.println("Isento");
    }
    
    else if((renda > 2000) && (renda <= 3000)) {
      renda -= 2000;
      imposto += (renda * 0.08);
      System.out.println("R$ " + String.format("%.2f",imposto));
    }
    
    else if((renda > 3000) && (renda <= 4500)) {
      renda -= 3000;
      imposto += (renda * 0.18) + (1000 * 0.08);
      System.out.println("R$ " + String.format("%.2f",imposto));
    }
    
    else if(renda > 4500) {
      renda -= 4500;
      imposto += (renda * 0.28) + (1500 * 0.18) + (1000 * 0.08);
      System.out.println("R$ " + String.format("%.2f",imposto));
    }
    
    }
}
