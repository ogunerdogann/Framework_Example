Feature: Wenn ich als Benutzer die Homepage betrete, sollte ich das KesifPlus-Logo oben links sehen können.

  Background:
    Given Navigiere zu "https://test.kesifplus.com/"
    @UI
  Scenario: das KesifPlus-Logo oben links sollte angezeigt werden
    Given verifiziere, ob das KesifPlus Logo angezeigt wird