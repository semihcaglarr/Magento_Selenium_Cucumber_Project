Feature: Add Product to Basket Functionality

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


    Scenario: Registered User Randomly Adds or Removes Products to The Basket

      Given Add a Randomly Selected Product to The Basket









