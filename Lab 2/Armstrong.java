public class Armstrong {
    public static void main(String[] args) {
int number = 153;
int numberOfDigits = String.valueOf(number).length();
int sum = 0;
int temp = number;
while (temp > 0) {
    int remainder = temp % 10;
    sum += Math.pow(remainder, numberOfDigits);
    temp = temp / 10;
}
if (sum == number) {
    System.out.println(number + " is an Armstrong number");
} else {
    System.out.println(number + " is not an Armstrong number");
}


    }

}
