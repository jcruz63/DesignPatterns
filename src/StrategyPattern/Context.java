package StrategyPattern;

public class Context {

    /**
     *  StrategyInterface encapsulates what is different
     *  or what we would want to change during run time
     */
    StrategyInterface strategyInterface;

    public Context(
            StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }

    public StrategyInterface getStrategyInterface() {
        return strategyInterface;
    }

    public void setStrategyInterface(
            StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }
}
