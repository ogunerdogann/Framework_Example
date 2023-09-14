Feature: Wenn ich als Benutzer die Homepage betrete, sollte ich das Banner Our Solutions unter dem Logo sehen können.
  @UI
  Scenario: Our Solutions müssen sichbar und anklickbar sein
    Given Navigiere zu "https://test.kesifplus.com/"
    Then Verifiziere ob Our Solutions sichbar und anklickbar sind

