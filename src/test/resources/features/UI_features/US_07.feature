Feature: Wenn ich als Benutzer die Startseite aufrufe, sollte ich den Text About us
  unter dem Titel KesifPlus Solutions.

  Background:
    Given Navigiere zu "https://test.kesifplus.com/"
  @UI
  Scenario: Das Text 'More About Us' unter dem KesifPlus Solutions Titel sollte angezeigt werden
    Given scrolle zum More About Us Taste
    Then verifiziere, ob das Text angezeigt wird

