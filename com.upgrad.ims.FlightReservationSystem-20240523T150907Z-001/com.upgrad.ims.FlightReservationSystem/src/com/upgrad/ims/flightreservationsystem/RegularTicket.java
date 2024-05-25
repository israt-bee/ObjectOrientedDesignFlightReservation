/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upgrad.ims.flightreservationsystem;

/**
 *
 * @author nahid
 */
public class RegularTicket extends Ticket {
    String specialServices;

    public RegularTicket(String pnr, String from, String to, String departureTime, String arrivalTime,
                         String seatNumber, float price, boolean canceled, Flight flight, Passenger passenger, String specialServices) {
        super(pnr, from, to, departureTime, arrivalTime, seatNumber, price, canceled, flight, passenger);
        this.specialServices=specialServices;
    }

    public void updateSpecialServices(String specialServices){
        this.specialServices=specialServices;
    }
}
