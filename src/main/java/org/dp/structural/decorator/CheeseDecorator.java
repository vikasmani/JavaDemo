package org.dp.structural.decorator;

import java.math.BigDecimal;

public class CheeseDecorator extends SandWichDecorator{

    Sandwich currentSandwich;

    public CheeseDecorator(Sandwich currentSandwich) {
        this.currentSandwich = currentSandwich;
    }

    @Override
    public String getDescription(){
        return currentSandwich.getDescription() + ", Cheese";
    }

    @Override
    public BigDecimal price(){
        return currentSandwich.price().add(new BigDecimal("0.5"));
    }

}
