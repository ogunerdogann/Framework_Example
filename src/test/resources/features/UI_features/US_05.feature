Feature: Wenn ich als Benutzer die Homepage aufrufe, sollte ich oben rechts ein Suchfeld sehen können.

  Background:
    Given Navigiere zu "https://test.kesifplus.com/"
  @UI
  Scenario: Das Suchfeld oben rechts auf Homepage sollte angezeigt werden
    Given verifiziere, ob das Suchfeld angezeigt wird