Feature: When I enter the main page as a user, various actions must be performed on the Contact Us page at the top of the page.
  @UI
  Scenario: Die Page Contact Us angelickt werden und die Daten sollten eingetippt werden
    Given Navigiere zu "https://test.kesifplus.com/"
    Then die Page Contact Us angelickt werden und die Daten sollten eingetippt werden
    And Verifiziere ob das Kontaktformular gespeichert wurde
