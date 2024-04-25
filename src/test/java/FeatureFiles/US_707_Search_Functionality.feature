Feature: Search Functionality

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

  Scenario: Confirmation of the ID of a randomly selected product with the search function.

    And User Sending the Keys in TopNav
      | searchInput | MJ08 |

    And Click on the Element in TopNav
      | searchButton |

    And Sees the Lando Gym Jacket product listed in the search results

    And Clicks on the Lando Gym Jacket product by following the Home > Men > Tops > Jackets link.

    And Confirms that the SKU number on the product page is correct
