@UI
Feature: Als Benutzer sollte ich auf der Account-Seite verschiedene Aktionen durchführen können.

  Background:
    Given Navigiere zu "http://www.kesifplus.com/"
    And Klicke auf account Button

  Scenario: TC01 Verifiziere die Boxen auf der Account Seite
    When Verifiziere ob Email, Password und Don't have an account? Register Buttons anklickbar sind
    Then Verifiziere ob Keep Me Signed In checkbox ankreuzbar ist

  Scenario Outline: TC02 Login mit ungültigen Anmeldeinformationen
    And die ungultige "<email>" und "<password>" sollten eingegeben werden und "<message>" sollte verifiziert werden

    Examples:
      | email   | password     | message                                                                                        |
      | burkay  | abcdef123456 | Die E-Mail-Adresse muss ein @-Zeichen enthalten. In der Angabe \"burkay\" fehlt ein @-Zeichen. |
      | burkay@ | abcdef123456 | Gib etwas nach dem @-Zeichen ein. Die Angabe „burkay@“ ist unvollständig.                      |

  Scenario: TC03 Register a new account
    When Benutzer sollte sich anmelden
    Then Verifiziere ob die Message "Register Successfully!" anzegeigt wird
    And Benutzer sollte sich mit angemeldeten Kontoinformationen einloggen
