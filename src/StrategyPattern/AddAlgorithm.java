package StrategyPattern;

//concrete class that implements Interface Strategy
public class AddAlgorithm implements IStrategy {

    @Override
    public int doOperation(int num1, int num2) {
        return (num1 + num2);
    }
}
