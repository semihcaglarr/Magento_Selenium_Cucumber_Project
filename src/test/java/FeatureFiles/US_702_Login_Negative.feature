Feature: Login Negative Functionality

  Background:
    Given Navigate to Magento WebSite

  Scenario: Login Attempt for Unregistered Users

    And Click on the Element in TopNav
      | signIn |

    And Click on the Element in Dialog
      | signInButton |

    And Required message for E-Mail should be displayed

    And User Sending the Keys in Dialog
      | loginEmail | abuzerkomurcu@gmail.com |

    And Click on the Element in Dialog
      | signInButton |

    And Required message for Password should be displayed

    And User Sending the Keys in Dialog
      | loginPassword | Abuzer3436 |

    And Click on the Element in Dialog
      | signInButton |

    And Sign-in was Incorrect messsage should be displayed

    And User Sending the Keys in Dialog
      | loginEmail    | abuzerkomurcu@gmail.com |
      | loginPassword | Abuzer3435              |

    And Click on the Element in Dialog
      | signInButton |

    Then Welcome message should be displayed























