package com.example.roux19.carcassonne.carcassonne;

import com.example.roux19.carcassonne.game.GamePlayer;
import com.example.roux19.carcassonne.game.actionMsg.GameAction;

/**
 * Created by roux19 on 2/27/2017.
 */
public class PlaceFollowerAction extends GameAction
{

    private int zone;

    public PlaceFollowerAction(int initZone, GamePlayer player )
    {
        super(player);

        zone = initZone;
    }

    public int getZone() {
        return zone;
    }
}
