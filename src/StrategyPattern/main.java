package StrategyPattern;

public class main {

    public static void main(String[] args) {
        Context context1 = new Context(new ConcreteAlgor1());
        Context context2 = new Context(new ConcreteAlgor2());

        System.out.println(context1.getStrategyInterface().algorithm());
        System.out.println(context2.getStrategyInterface().algorithm());

    }
}
