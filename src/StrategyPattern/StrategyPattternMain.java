package StrategyPattern;

public class StrategyPattternMain {

    public static void main(String[] args) {
        int a = 10, b = 20;

        Context addContext = new Context(new AddAlgorithm());
        System.out.println(addContext.getContextAndExecuteStrategy(a, b));

        Context substractContext = new Context(new SubstractAlgorithm());
        System.out.println(substractContext.getContextAndExecuteStrategy(a, b));
    }
}