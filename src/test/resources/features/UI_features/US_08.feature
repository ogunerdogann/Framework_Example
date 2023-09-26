Feature:  Wenn ich als Benutzer die Startseite aufrufe, sollte ich den Abschnitt "Plan & Pricing" sehen können

  Background:
    Given Navigiere zu "https://test.kesifplus.com/"
  @UI

  Scenario: TC_01 Buttons für verwandte Optionen(related options) müssen angezeigt werden

    When Butttons für verwandte Optionen müssen angezeigt werden
  @UI
  Scenario: TC_02 Buttons für verwandte Optionen(related options) müssen angeklickt werden

    Then Buttons für verwandte Optionen müssen angeklickt werden