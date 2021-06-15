package cabinvoice;


import entity.Ride;
import org.junit.Assert;
import org.junit.Test;
import service.CabInvoiceService;

import java.util.ArrayList;

public class Tests {
    @Test
    public void givenDistanceAndTimeShouldReturnTotalFareOfJourney() {
        CabInvoiceService cabInvoiceService = new CabInvoiceService();
        int fare = cabInvoiceService.getRideFare(10,60);
        Assert.assertEquals(160,fare);
    }

    @Test
    public void givenDistanceAndTimeReturnMinimumFare() {
        CabInvoiceService cabInvoiceService = new CabInvoiceService();
        int fare = cabInvoiceService.getRideFare(0,1);
        Assert.assertEquals(5,fare);
    }
    @Test
    public void givenArrayListsOfDistanceAndTimeShouldReturnAggregateFare() {
        CabInvoiceService cabInvoiceService = new CabInvoiceService();
        ArrayList<Ride> data = new ArrayList<>();
        data.add(new Ride(10,5));
        data.add(new Ride(50,60));
        data.add(new Ride(70,120));
        int aggreagatefare = cabInvoiceService.getAggregateFare(data);
        Assert.assertEquals(1485,aggreagatefare);
    }
}
