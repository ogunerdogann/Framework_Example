Feature: When I enter the home page as a user, I should see the page title is "KesifPlus".

  Background:
    Given Navigiere zu "https://test.kesifplus.com/"

  @UI
  Scenario: Der Titel sollte auf Chrome Browser richtig angezeigt werden
  # "https://test.kesifplus.com/"
  # And Der Titel sollte auf verschiedenen Betriebssystemen korrekt angezeigt werden. (Windows | Mac)
    Then Der Seitentitel sollte "KesifPlus - Bireysel ve Kurumsal Çözümler!" enthalten.

    @firefox
    @UI
    Scenario: Der Titel sollte auf Firefox Browser richtig angezeigt werden
      Then Der Seitentitel sollte "KesifPlus - Bireysel ve Kurumsal Çözümler!" enthalten.

    @edge
    @UI
    Scenario: Der Titel sollte auf Edge Browser richtig angezeigt werden
     Then Der Seitentitel sollte "KesifPlus - Bireysel ve Kurumsal Çözümler!" enthalten.
