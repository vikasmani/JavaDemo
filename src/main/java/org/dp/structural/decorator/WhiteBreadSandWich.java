package org.dp.structural.decorator;

import java.math.BigDecimal;

public class WhiteBreadSandWich extends Sandwich {
    public WhiteBreadSandWich(String des) {
        description = des;
    }

    public BigDecimal price(){
        return new BigDecimal("3.0");
    }

}
