public class Fizzbuzz {
    public String generate(Integer upTo) {
        String returnString = "";
        for (int i = 1; i <= upTo; i++) {
            String numberString = "";
            if (i % 3 == 0) {
                numberString = numberString.concat("Fizz");
            }
            if (i % 5 == 0) {
                numberString = numberString.concat("Buzz");
            }
            if (numberString.equals("")) {
                numberString += i;
            }
            if (i != upTo) {
                numberString = numberString.concat(", ");
            }
            returnString = returnString.concat(numberString);
        }
        return returnString;
    }
}
