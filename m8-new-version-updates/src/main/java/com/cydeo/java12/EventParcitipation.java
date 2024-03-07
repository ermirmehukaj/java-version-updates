package com.cydeo.java12;

import java.util.List;

public class EventParcitipation {
    private List<String> guestNameList;
    private Integer totalNumberOfParticipants;

    public EventParcitipation(List<String> guestNameList,
                              Integer totalNumberOfParticipants) {
        this.guestNameList = guestNameList;
        this.totalNumberOfParticipants = totalNumberOfParticipants;}

    @Override
    public String toString() {
        return "EventParticipation{" +
                "guestNameList=" + guestNameList +
                ", totalNumberOfParticipants=" + totalNumberOfParticipants +
                '}';
    }
}
