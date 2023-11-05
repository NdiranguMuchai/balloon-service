package com.ndirangu.ballloonservice.decorators;

import com.ndirangu.ballloonservice.entities.BalloonGarland;

import java.math.BigDecimal;

public class LetteringDecorator extends BalloonGarlandDecorator {

    public BalloonGarland currentGarland;

    public LetteringDecorator(BalloonGarland balloonGarland) {
        currentGarland = balloonGarland;
    }

    @Override
    public String getDescription() {
        return currentGarland.getDescription() + " , with lettering";
    }

    @Override
    public BigDecimal price() {
        return currentGarland.price().add(BigDecimal.valueOf(50.40));
    }
}
