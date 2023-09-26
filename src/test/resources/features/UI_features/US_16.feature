Feature:Wenn ich als Benutzer die Startseite betrete, sollen verschiedene Aktionen
  auf der Consulting-Seite im oberen Bereich der Seite durchgeführt werden.
  @UI
  Scenario:
    Given Navigiere zu "https://test.kesifplus.com/"
    When Beim Anklicken auf Consulting sollte sich die Url entsprechend ändern
