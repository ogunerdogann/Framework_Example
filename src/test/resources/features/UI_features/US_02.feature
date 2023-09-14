@UI
Feature: Der Seitentitel und die Url der Seiten


  Background:
    Given Navigiere zu "http://www.kesifplus.com/"


  Scenario: Die Seiten-URL sollte sich nach der Navigation zu relevanten Seiten ändern
    Given Der Nutzer klickt auf taps und verifiziert die entsprechende URL
      | Home       | https://www.kesifplus.com/           |
      | About Us   | https://www.kesifplus.com/about-us   |
      | Contact Us | https://www.kesifplus.com/contact-us |
      | Consulting | https://www.kesifplus.com/consulting |
      | Account    | https://www.kesifplus.com/login      |

  Scenario: Der Seitentitel sollte sich nach dem Navigieren auf den entsprechenden Seiten ändern
    Given Der Nutzer klickt auf die Registerkarten und überprüft den Seitentitel
      | Home       | KesifPlus - Bireysel ve Kurumsal Çözümler! |
      | About Us   | KesifPlus - Bireysel ve Kurumsal Çözümler! |
      | Contact Us | KesifPlus - Bireysel ve Kurumsal Çözümler! |
      | Consulting | KesifPlus - Bireysel ve Kurumsal Çözümler! |
      | Account    | KesifPlus - Bireysel ve Kurumsal Çözümler! |


  Scenario: mit ENUM CLASS
    Given ENUM CLASS