Feature: Address Addition Functionality

  Background:
    Given Navigate to Magento WebSite

    When Click on the Element in TopNav
      | signIn |

    And User Sending the Keys in Dialog
      | loginEmail    | abuzerkomurcu@gmail.com |
      | loginPassword | Abuzer3435              |

    And Click on the Element in Dialog
      | signInButton |

    Then Welcome message should be displayed

  Scenario Outline: Adding an Address to The System for a Registered User.

    Given Click on the Element in TopNav
      | actionSwitch |
      | myAccount    |

    And Click on the Element in LeftNav
      | addressBook |

    And Click on the Element in Dialog
    |addNewAddressButton|

    When User Sending the Keys in Dialog
      | phoneNumber    | <Telephone> |
      | streetAddress1 | <Address1>  |
      | streetAddress2 | <Address2>  |
      | city           | <City>      |

    And Click on the Element in Dialog
      | stateSelect      |
      | value42NewMexico |

    And User Sending the Keys in Dialog
      | zipCode | <PostalCode> |

    And Click on the Element in Dialog
      | saveAddressButton |

    Then Save Address message should be displayed

    Examples:
      | Telephone   | Address1                | Address2              | City        | PostalCode |
      | 05555555555 | Coors Rd SW             | 4257 Isleta Boulevard | Albuquerque | 87045      |
      | 05555555554 | Southwest               | Gustavo Fring         | Tijuana     | 22000      |
      | 05555555553 | Av. Adolfo Lopez Mateos | Prados Tepeyac        | Guadalajara | 45050      |











