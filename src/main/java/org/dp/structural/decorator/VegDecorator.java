package org.dp.structural.decorator;

import java.math.BigDecimal;

public class VegDecorator extends SandWichDecorator{

    Sandwich currentSandwich;
    public VegDecorator(Sandwich currentSandwich) {
        this.currentSandwich = currentSandwich;
    }

    @Override
    public String getDescription(){
        return currentSandwich.getDescription() + ", Veg";
    }

    @Override
    public BigDecimal price(){
        return currentSandwich.price().add(new BigDecimal("1.0"));
    }
}
