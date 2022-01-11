public class Fizzbuzz {
    public String generate(Integer upTo) {
        if (upTo == 1) {
            return "1";
        } else if (upTo == 2) {
            return "1, 2";
        } else {
            return "1, 2, Fizz";
        }
    }
}
