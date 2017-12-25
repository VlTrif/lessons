public class Mathematic {
    private double first;
    private double second;
    private char action;
    private double result;

    public Mathematic(double first, double second, char action) {
        this.first = first;
        this.second = second;
        this.action = action;
    }

    public double response(){
        if(action == '+'){
            result = first + second;
        } else if (action == '-') {
            result = first - second;
        } else if (action == '*') {
            result = first * second;
        } else if (action == '/') {
            result = first / second;
        }
        return result;
    }
}
