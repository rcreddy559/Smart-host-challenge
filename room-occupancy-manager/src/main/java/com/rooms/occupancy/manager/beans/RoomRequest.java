package com.rooms.occupancy.manager.beans;

import io.swagger.annotations.ApiModel;

@ApiModel("")
public class RoomRequest {
    private Integer premiumRooms;
    private Integer economyRooms;

    public RoomRequest(final Integer premiumRooms, final Integer economyRooms) {
        this.premiumRooms = premiumRooms;
        this.economyRooms = economyRooms;
    }



    public static RoomRequest of(final Integer premiumRooms, final Integer economyRooms) {
        return new RoomRequest(premiumRooms, economyRooms);
    }

    public Integer getPremiumRooms() {
        return premiumRooms;
    }

    public void setPremiumRooms(final Integer premiumRooms) {
        this.premiumRooms = premiumRooms;
    }

    public Integer getEconomyRooms() {
        return economyRooms;
    }

    public void setEconomyRooms(final Integer economyRooms) {
        this.economyRooms = economyRooms;
    }

    @Override
    public String toString() {
        return "RoomRequest{" +
                "premiumRooms=" + premiumRooms +
                ", economyRooms=" + economyRooms +
                '}';
    }
}
