Feature: Product Ordering Functionality

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

  Scenario: Ordering and confirmation of products by a registered user

    Given Add a Randomly Selected Product to The Shopping Cart

    And Click on the Element in TopNav
    |shoppingCartGreen|

    When Click on the Element in MidNav
    |proceedToCheckOut|

    When Enter and Confirm Shipping Address and Payment Details

    Then Successful order message should be displayed




