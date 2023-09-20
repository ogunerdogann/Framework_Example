Feature: Wenn ich als Benutzer die Startseite aufrufe,
  sollten unten auf der Seite die Überschriften Get In Touch With Us, Download, Help zu sehen sein.

  Background:
    Given Navigiere zu "https://test.kesifplus.com/"

    @UI
    Scenario: Die Titel unten auf der Seite Get In Touch With Us, Download, Help unten auf der Seite sollten angezeigt werden
      Given scrolle zum Get In Touch With Us Text
      Then verifiziere, ob die Titel angezeigt werden