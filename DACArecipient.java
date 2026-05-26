/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * <TODO: add @author info here for all group-mates!>
 *
 *	@version 1.0
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
<class name>
-----------------------------------------
<data, i.e. variables>
-----------------------------------------
<actions, i.e. methods>
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	private String surname, givenName, uscisNumber, countryOfOrigin;
	private int birthday, validFromDate, expirationDate;
	private char sex;

	
	/***** ACCESSORS *****/ //getters
	public String getSurname(){
		return this.surname;
	}
	public String getGivenName(){
		return this.givenName;
	}
	public String getUscisNumber(){
		return this.uscisNumber;
	}
	public String getCountryOfOrigin(){
		return this.countryOfOrigin;
	}
	public int getBirthday(){
		return this.birthday;
	}
	public int getValidFromDate(){
		return this.validFromDate;
	}
	public int getExpirationDate(){
		return this.expirationDate;
	}
	public char getSex(){
		return this.sex;
	}


	/***** MUTATORS *****/ //setters
	public void setSurname(String surname){
		this.surname = surname;
	}
	public void setGivenName(String givenName){
		this.givenName = givenName;
	}
	public void setUscisNumber(String uscisNumber){
		this.uscisNumber = uscisNumber;
	}
	public void setCountryOfOrigin(String countryOfOrigin){
		this.countryOfOrigin = countryOfOrigin;
	}
	public void setBirthday(int birthday){
		this.birthday = birthday;
	}
	public void setValidFromDate(int validFromDate){
		this.validFromDate = validFromDate;
	}
	public void setExpirationDate(int expirationDate){
		this.expirationDate = expirationDate;
	}
	public void setSex(char sex){
		this.sex = sex;
	}
	
	public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex){
		this.surname = surname;
		this.givenName = givenName;
		this.uscisNumber = uscisNumber;
		this.countryOfOrigin = countryOfOrigin;
		this.birthday = birthday;
		this.validFromDate = validFromDate;
		this.expirationDate = expirationDate;
		this.sex = sex;
	}
}
