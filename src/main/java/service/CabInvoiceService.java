package service;

import entity.Ride;

import java.util.ArrayList;

public class CabInvoiceService {
    public int getRideFare(Integer distance, Integer timeinminutes) {
        int fare = (distance*10)+timeinminutes;
        return Math.max(fare,5)==5?5:fare;
    }
    public int getAggregateFare(ArrayList<Ride> data) {
        return data.stream()
                .map(ride -> this.getRideFare(ride.getDistance(),ride.getTime()))
                .reduce(0, Integer::sum);
    }
}
