Feature: Wenn ich als Benutzer die Startseite aufrufe, sollte die "About Us" Button am oberen Rand der Seite erscheinen

  @UI
  Scenario:
    Given Navigiere zu "https://test.kesifplus.com/"
    When About us sollte angezeigt und angeklickt werden
    Then Beim Anklicken auf About Us sollte sich die Url entsprechend ändern
      | https://test.kesifplus.com/about-us |