public class Fizzbuzz {
    public String generate(Integer upTo) {
        String returnString = "";
        for (int i = 1; i <= upTo; i++) {
            if (i % 3 == 0) {
                returnString = returnString.concat("Fizz");
            } else {
                returnString += i;
            }
            if (i != upTo) {
                returnString = returnString.concat(", ");
            }
        }
        return returnString;
    }
}
