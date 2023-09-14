@UI
Feature: Der Seitentitel und die Url der Seiten


  Background:
    Given Navigiere zu "https://test.kesifplus.com/"


  Scenario: Die Seiten-URLs sollten sich nach der Navigation zu relevanten Seiten ändern
    Given Die Tabs müssen geklickt werden und die entsprechenden URLs müssen verifiziert werden
      | Home       | https://www.kesifplus.com/           |
      | About Us   | https://www.kesifplus.com/about-us   |
      | Contact Us | https://www.kesifplus.com/contact-us |
      | Consulting | https://www.kesifplus.com/consulting |
      | Account    | https://www.kesifplus.com/login      |

  Scenario: Die Seitentitel sollten sich nach der Navigation zu relevanten Seiten ändern
    Given Die Tabs müssen geklickt werden und die entsprechenden Seitentitel müssen verifiziert werden
      | Home       | KesifPlus - Bireysel ve Kurumsal Çözümler! |
      | About Us   | KesifPlus - Bireysel ve Kurumsal Çözümler! |
      | Contact Us | KesifPlus - Bireysel ve Kurumsal Çözümler! |
      | Consulting | KesifPlus - Bireysel ve Kurumsal Çözümler! |
      | Account    | KesifPlus - Bireysel ve Kurumsal Çözümler! |


  Scenario: mit ENUM CLASS
    Given ENUM CLASS