package service;

import entity.Invoice;
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

    public Invoice getInvoice(ArrayList<Ride> data) {
        Double totalfare = (double)this.getAggregateFare(data);
        return new Invoice(data.size(),totalfare,totalfare/ data.size());
    }
}
