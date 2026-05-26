/********************************************
*	DEVELOPER:	<name>
* COLLABORATORS: <names>
*	LAST MODIFIED:	<date>
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class Main 
{
  public static void main(String[] args) 
	{
    

    //Person 1: Using individual setters
    DACArecipient person1 = new DACArecipient();
    person1.setSurname("Mendez");
    person1.setGivenName("Javier");
    person1.setUscisNumber("56-3-445");
    person1.setCountryOfOrigin("Venezuela");
    person1.setBirthday(2451564);
    person1.setValidFromDate(3956753);
    person1.setExpirationDate(3956840);
    person1.setSex('M');
    
    //Person 2: Using the setAll method
    DACArecipient person2 = new DACArecipient();
    person2.setAll("Chapeton-Lamas", "Nery", "12-4-789" , "Guatemala", 2451564, 3000000, 4000000, 'M');
  
    //Print results using getters
    printRecipient(person1,"Person 1");
    printRecipient(person2, "Person 2");
  }

    public static void printRecipient(DACArecipient p, String label) {
      System.out.println("\n" + label);
      System.out.println("-----------------------------");
      System.out.println("Surname: " + p.getSurname());
      System.out.println("Given name: " + p.getGivenName());
      System.out.println("USCIS number: " + p.getUscisNumber());
      System.out.println("Country of Origin: " + p.getCountryOfOrigin());
      System.out.println("Birthday(JDN): " + p.getBirthday());
      System.out.println("Valid From(JDN): " + p.getValidFromDate());
      System.out.println("Expiration(JDN): " + p.getExpirationDate());
      System.out.println("Sex: " + p.getSex());
    
  
    }
}
