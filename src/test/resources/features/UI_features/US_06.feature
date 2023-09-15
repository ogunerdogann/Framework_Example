Feature: Wenn ich als Benutzer die Startseite aufrufe, sollte ich in der Lage sein, Merkmal 1, Merkmal 2 und Merkmal 3 zu sehen.
  @UI
  Scenario: Die Features müssen sichtbar sein
    Given Navigiere zu "https://test.kesifplus.com/"
    Then Die Features müssen angezeigt werden
    When Features müssen beim hovering over bewegt werden und verifiziere ob sich die bewegt haben
