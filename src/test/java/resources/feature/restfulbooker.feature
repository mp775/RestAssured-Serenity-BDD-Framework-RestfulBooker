Feature: Testing different request on the restful booker app

  Scenario Outline: Create a new booking & verify if the booking is created
    When I create a new booking by providing the information firstName "<firstName>" lastName "<lastName>" totalPrice "<totalPrice>" depositPaid "<depositPaid>" checkIn "<checkIn>" checkOut "<checkOut>" additionalNeeds "<additionalNeeds>"
    Then I verify that the booking is created
    Examples:
      | firstName | lastName | totalPrice | depositPaid | checkIn    | checkOut   | additionalNeeds |
      | Prime     | prime1   | 500        | true        | 2022-01-07 | 2022-01-20 | Breakfast       |











