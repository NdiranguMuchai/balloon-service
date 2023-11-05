package com.ndirangu.ballloonservice;

import com.ndirangu.ballloonservice.decorators.LetteringDecorator;
import com.ndirangu.ballloonservice.decorators.VinesDecorator;
import com.ndirangu.ballloonservice.entities.BalloonGarland;
import com.ndirangu.ballloonservice.entities.MulticolouredBalloonGarland;

public class GarlandMaker {
    public static void main(String[] args) {
        BalloonGarland extravagantGarland = new MulticolouredBalloonGarland("Jungle Themed Balloon Garland");
        System.out.printf("The price of a %s is $%.2f %n", extravagantGarland.getDescription(), extravagantGarland.price());

        BalloonGarland simpleGarland = new MulticolouredBalloonGarland("Pastel Colours Balloon Garland");
        System.out.printf("The price of a %s is $%.2f %n", simpleGarland.getDescription(), simpleGarland.price());

        System.out.println();
        //add decorations
        extravagantGarland = new VinesDecorator(extravagantGarland);
        System.out.printf("The price of a %s is $%.2f %n", extravagantGarland.getDescription(), extravagantGarland.price());

        simpleGarland = new LetteringDecorator(simpleGarland);
        System.out.printf("The price of a %s is $%.2f %n", simpleGarland.getDescription(), simpleGarland.price());

    }
}
