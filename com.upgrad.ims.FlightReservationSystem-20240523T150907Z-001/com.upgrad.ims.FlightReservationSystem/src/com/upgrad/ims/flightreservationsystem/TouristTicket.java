/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upgrad.ims.flightreservationsystem;

/**
 *
 * @author nahid
 */
import java.util.Arrays;

public class TouristTicket extends Ticket {
    String hotelAddress;
    String[] selectedTouristLocation=new String[5];


    public TouristTicket(String pnr, String from, String to, String departureTime, String arrivalTime, String seatNumber, float price, boolean canceled, Flight flight, Passenger passenger, String hotelAddress, String[] selectedTouristLocation) {
        super(pnr, from, to, departureTime, arrivalTime, seatNumber, price, canceled, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation= selectedTouristLocation;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getSelectedTouristLocation() {
        return "selected Tourist Locations=" + Arrays.toString(selectedTouristLocation);
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

}
