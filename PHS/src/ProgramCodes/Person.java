package ProgramCodes;

public abstract class Person {

	private String idNum;
	private String lastName;
	private String firstName;
	private String midName;
	private String contactNum;
	private String homeAddress;
        private String gender;

        public String getGender()
        {
            return gender;
        }
        
        public void setGender(String Gender)
        {
            this.gender = Gender;
        }
	public String getIdNum() {
		return this.idNum;
	}

	/**
	 * 
	 * @param idNum
	 */
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMidName() {
		return this.midName;
	}

	/**
	 * 
	 * @param midName
	 */
	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getContactNum() {
		return this.contactNum;
	}

	/**
	 * 
	 * @param contactNum
	 */
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public String getHomeAddress() {
		return this.homeAddress;
	}

	/**
	 * 
	 * @param homeAddress
	 */
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Person(String idNum, String lastName, String firstName, String midName, String contactNum, String homeAddress) {
		// TODO - implement Person.Person
                this.idNum = idNum;
                this.lastName = lastName;
                this.firstName = firstName;
                this.midName = midName;
                this.contactNum = contactNum;
                this.homeAddress = homeAddress;
		throw new UnsupportedOperationException();
	}

	public Person() {
		// TODO - implement Person.Person
	}

}