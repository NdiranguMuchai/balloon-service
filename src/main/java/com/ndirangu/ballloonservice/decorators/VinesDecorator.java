package com.ndirangu.ballloonservice.decorators;

import com.ndirangu.ballloonservice.entities.BalloonGarland;

import java.math.BigDecimal;

public class VinesDecorator extends BalloonGarlandDecorator {
    public BalloonGarland balloonGarland;

    public VinesDecorator(BalloonGarland balloonGarland) {
        this.balloonGarland = balloonGarland;
    }

    @Override
    public String getDescription() {
        return balloonGarland.getDescription() + ", with vines";
    }

    @Override
    public BigDecimal price() {
        return balloonGarland.price().add(BigDecimal.valueOf(20.50));
    }
}
