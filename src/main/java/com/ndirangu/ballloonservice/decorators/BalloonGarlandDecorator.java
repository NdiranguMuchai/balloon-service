package com.ndirangu.ballloonservice.decorators;

import com.ndirangu.ballloonservice.entities.BalloonGarland;

import java.math.BigDecimal;

public abstract class BalloonGarlandDecorator  extends BalloonGarland {

    public abstract BigDecimal price();
}
