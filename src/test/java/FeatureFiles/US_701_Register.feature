Feature: User Registration Functionality

  Scenario: Create a New User Account

    Given Navigate to Magento WebSite

    And Click on the Element in TopNav
      | createAccount |

    And User Sending the Keys in Dialog
      | firstName        | abuzer                  |
      | lastName         | komurcu                 |
      | RegisterEMail    | abuzerkomurcu@gmail.com |
      | RegisterPassword | Abuzer3435              |
      | confirmPassword  | Abuzer3435              |

    And Click on the Element in Dialog
      | createAccountButton |

    Then My Account Text Should be Displayed








