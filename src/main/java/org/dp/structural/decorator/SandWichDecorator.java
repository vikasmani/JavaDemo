package org.dp.structural.decorator;

import java.math.BigDecimal;

public abstract class SandWichDecorator extends Sandwich{


    @Override
    public abstract BigDecimal price();
}
