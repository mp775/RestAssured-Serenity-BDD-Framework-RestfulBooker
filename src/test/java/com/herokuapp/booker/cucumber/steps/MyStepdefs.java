package com.herokuapp.booker.cucumber.steps;

import com.herokuapp.booker.bookininfo.BookingSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

public class MyStepdefs {

    static ValidatableResponse response;

    @Steps
    BookingSteps bookingSteps;
    @When("^I create a new booking by providing the information firstName \"([^\"]*)\" lastName \"([^\"]*)\" totalPrice \"([^\"]*)\" depositPaid \"([^\"]*)\" checkIn \"([^\"]*)\" checkOut \"([^\"]*)\" additionalNeeds \"([^\"]*)\"$")
    public void iCreateANewBookingByProvidingTheInformationFirstNameLastNameTotalPriceDepositPaidCheckInCheckOutAdditionalNeeds(String firstName, String lastName, String totalPrice, String depositPaid, String checkIn, String archeckOutg5, String additionalNeeds) {
        // Write code here that turns the phrase above into concrete actions
       bookingSteps.createBooking(firstName,lastName,totalPrice,depositPaid,checkIn,archeckOutg5,additionalNeeds);
    }

    @Then("^I verify that the booking is created$")
    public void iVerifyThatTheBookingIsCreated() {
    }
}
