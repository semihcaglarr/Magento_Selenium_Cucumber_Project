Feature: Login Positive Functionality

  Background:
    Given Navigate to Magento WebSite

  Scenario:Verifying the Login Process for Registered Users

    And Click on the Element in TopNav
      | signIn |

    And User Sending the Keys in Dialog
      | loginEmail    | abuzerkomurcu@gmail.com |
      | loginPassword | Abuzer3435              |

    And Click on the Element in Dialog
      | signInButton |

    And Welcome message should be displayed










