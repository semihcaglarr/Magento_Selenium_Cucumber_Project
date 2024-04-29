Feature: Tab Menu Functionality

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

  Scenario: Tab Menu Control

    Given Accuracy check of what appears in Tab Menu

    When Accuracy check of what appears in WomenTops Menu

    And Accuracy check of what appears in WomenBottoms Menu

    And Accuracy check of what appears in MenTops Menu

    And Accuracy check of what appears in MenBottoms Menu

    And Accuracy check of what appears in Gear Menu

    And Accuracy check of what appears in Training Menu









