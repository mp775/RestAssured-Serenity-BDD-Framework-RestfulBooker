package com.herokuapp.booker.model;

/**
 * Created by Jay
 */
public class BookingPojo {

    private String firstname;
    private String lastname;
    private String totalprice;
    private String depositpaid;
    private BookingDates bookingdates;
    private String additionalneeds;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice;
    }

    public String isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(String depositpaid) {
        this.depositpaid = depositpaid;
    }

    public BookingDates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public static BookingPojo getRequestBody(String firstname, String lastname, String totalprice, String depositpaid,
                                             BookingDates bookingDates, String additionalneeds) {
        BookingPojo bookingPojo = new BookingPojo();
        if (firstname != null) {
            bookingPojo.setFirstname(firstname);
        }
        if (lastname != null) {
            bookingPojo.setLastname(lastname);
        }
        if (totalprice != null) {
            bookingPojo.setTotalprice(totalprice);
        }
        if (depositpaid != null) {
            bookingPojo.setDepositpaid(depositpaid);
        }
        if (bookingDates != null) {
            bookingPojo.setBookingdates(bookingDates);
        }
        if (additionalneeds != null) {
            bookingPojo.setAdditionalneeds(additionalneeds);
        }
        return bookingPojo;
    }
}