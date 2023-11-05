package com.ndirangu.ballloonservice.entities;

import java.math.BigDecimal;

public abstract class BalloonGarland {

    protected String description = "Balloon Garland";

    public String getDescription(){
        return description;
    }

    public abstract BigDecimal price();
}
