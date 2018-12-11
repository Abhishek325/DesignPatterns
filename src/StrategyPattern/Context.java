package StrategyPattern;

//This class connects both Strategy and Algorithms
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int getContextAndExecuteStrategy(int num1, int num2) {
        return this.strategy.doOperation(num1, num2);
    }
}
