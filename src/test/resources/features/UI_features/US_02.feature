@UI
Feature: Der Seitentitel und die Url der Seiten


  Background:
    Given Navigiere zu "https://test.kesifplus.com/"


  Scenario: Die Seiten-URLs sollten sich nach der Navigation zu relevanten Seiten ändern
    Given Die Tabs müssen geklickt werden und die entsprechenden URLs müssen verifiziert werden
      | Home       | https://test.kesifplus.com/           |
      | About Us   | https://test.kesifplus.com/about-us   |
      | Contact Us | https://test.kesifplus.com/contact-us |
      | Consulting | https://test.kesifplus.com/consulting |
      | Account    | https://test.kesifplus.com/login      |

  Scenario Outline: With Scenario Outline
    Then die "<tabs>" geklickt werden und die entsprechenden "<urls>" müssen verifiziert werden

    Examples:
      | tabs       | urls                                  |
      | /          | https://test.kesifplus.com/           |
      | About-Us   | https://test.kesifplus.com/about-us   |
      | Contact-Us | https://test.kesifplus.com/contact-us |
      | Consulting | https://test.kesifplus.com/consulting |
      | Login      | https://test.kesifplus.com/login      |

  Scenario: Die Seitentitel sollten sich nach der Navigation zu relevanten Seiten ändern
    Given Die Tabs müssen geklickt werden und die entsprechenden Seitentitel müssen verifiziert werden
      | Home       | KesifPlus - Bireysel ve Kurumsal Çözümler! |
      | About Us   | KesifPlus - Bireysel ve Kurumsal Çözümler! |
      | Contact Us | KesifPlus - Bireysel ve Kurumsal Çözümler! |
      | Consulting | KesifPlus - Bireysel ve Kurumsal Çözümler! |
      | Account    | KesifPlus - Bireysel ve Kurumsal Çözümler! |


  Scenario: mit ENUM CLASS
    Given ENUM CLASS