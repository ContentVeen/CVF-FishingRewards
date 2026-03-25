package com.fishingrewards.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class TreasureBoostEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player player;
    private double multiplier = 1.0;

    public TreasureBoostEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
