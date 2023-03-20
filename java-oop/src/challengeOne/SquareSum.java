package challengeOne;
// Square numbers and return their sum
class SquareSum {
    double squareSum(double num1, double num2, double num3) {
        double sum = 0;
        sum = ((num1*num1)+(num2*num2)+(num3*num3));
        return sum;
    }
}
class SquareSumTest {
    public static void main(String[] args) {
        SquareSum sqrsumop = new SquareSum(); // instancia de un objeto SquareSum
        System.out.println(sqrsumop.squareSum(2,3,4)); // llamado a la func sqrSum con pasando params
    }
}