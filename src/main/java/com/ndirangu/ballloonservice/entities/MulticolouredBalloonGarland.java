package com.ndirangu.ballloonservice.entities;

import java.math.BigDecimal;

public class MulticolouredBalloonGarland extends BalloonGarland{


    public MulticolouredBalloonGarland(String desc) {
        description = desc;
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(120.40);
    }

}
