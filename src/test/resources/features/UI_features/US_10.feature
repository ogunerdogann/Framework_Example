@UI

Feature: Wenn ich als Benutzer die Startseite aufrufe, sollten die Buttons
  für soziale Medien unter der Überschrift "Team Solutions" unten auf der Seite sichtbar sein

  Background:
    When Navigiere zu "https://test.kesifplus.com/"

  Scenario: TC_01 Facebook button
    And Facebook button sollte angezeigt und geklickt werden
    Then Wenn der Facebook button angeklickt wird, muss an die Facebook-Seite weitergeleitet werden

  Scenario: TC_02 Twitter button
    And Twitter button sollte angezeigt und geklickt werden
    Then Wenn der Twitter button angeklickt wird, muss an die Twitter-Seite weitergeleitet werden

  Scenario: TC_03 Linkedin button
    And Linkedin button sollte angezeigt geklickt werden
    Then Wenn der Linkedin button angeklickt wird, muss an die Linkedin-Seite weitergeleitet werden

  Scenario: TC_04 Pinterest button
    And Pinterest button sollte angezeigt geklickt werden
    Then Wenn der Pinterest button angeklickt wird, muss an die Pinterest-Seite weitergeleitet werden
