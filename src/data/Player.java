package data;

public class Player {

	private String firstName;
	private String lastName;
	private int age;
	private boolean sex;
	private String city;
	private Position position;
	private int speed;
	private int agility;
	private int sprint;
	private int stamina;
	private int power;
	private int endurance;
	private int jumping;
	private int balance;
	private int strength;

	public Player(String firstName, String lastName, int age, boolean sex, String city, Position position, int speed,
			int agility, int sprint, int stamina, int power, int endurance, int jumping, int balance, int strength) {

		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setSex(sex);
		setCity(city);
		setPosition(position);
		setSpeed(speed);
		setAgility(agility);
		setSprint(sprint);
		setStamina(stamina);
		setPower(power);
		setEndurance(endurance);
		setJumping(jumping);
		setBalance(balance);
		setStrength(strength);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age > 18 || age < 3) {

			System.out.println("Rekrutowani zawodnicy mog¹ byæ w wieku 3-18 lat");
		} else

			this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {

		if (speed < 0 || speed > 100) {
			System.out.println("Podana wartoœæ powinna znalezc siê w zakresie od 0 do 100");
		} else
			this.speed = speed;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		if (agility < 0 || agility > 100) {
			System.out.println("Podana wartoœæ powinna znalezc siê w zakresie od 0 do 100");
		} else
			this.agility = agility;
	}

	public int getSprint() {
		return sprint;
	}

	public void setSprint(int sprint) {
		if (sprint < 0 || sprint > 100) {
			System.out.println("Podana wartoœæ powinna znalezc siê w zakresie od 0 do 100");
		} else
			this.sprint = sprint;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		if (stamina < 0 || stamina > 100) {
			System.out.println("Podana wartoœæ powinna znalezc siê w zakresie od 0 do 100");
		} else
			this.stamina = stamina;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		if (power < 0 || power > 100) {
			System.out.println("Podana wartoœæ powinna znalezc siê w zakresie od 0 do 100");
		} else

			this.power = power;
	}

	public int getEndurance() {
		return endurance;
	}

	public void setEndurance(int endurance) {

		if (endurance < 0 || endurance > 100) {
			System.out.println("Podana wartoœæ powinna znalezc siê w zakresie od 0 do 100");
		} else
			this.endurance = endurance;
	}

	public int getJumping() {
		return jumping;
	}

	public void setJumping(int jumping) {
		if (jumping < 0 || jumping > 100) {
			System.out.println("Podana wartoœæ powinna znalezc siê w zakresie od 0 do 100");
		} else
			this.jumping = jumping;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance < 0 || balance > 100) {
			System.out.println("Podana wartoœæ powinna znalezc siê w zakresie od 0 do 100");
		} else
			this.balance = balance;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		if (strength < 0 || strength > 100) {
			System.out.println("Podana wartoœæ powinna znalezc siê w zakresie od 0 do 100");
		} else
			this.strength = strength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + agility;
		result = prime * result + balance;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + endurance;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + jumping;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + power;
		result = prime * result + (sex ? 1231 : 1237);
		result = prime * result + speed;
		result = prime * result + sprint;
		result = prime * result + stamina;
		result = prime * result + strength;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (age != other.age)
			return false;
		if (agility != other.agility)
			return false;
		if (balance != other.balance)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (endurance != other.endurance)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (jumping != other.jumping)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (position != other.position)
			return false;
		if (power != other.power)
			return false;
		if (sex != other.sex)
			return false;
		if (speed != other.speed)
			return false;
		if (sprint != other.sprint)
			return false;
		if (stamina != other.stamina)
			return false;
		if (strength != other.strength)
			return false;
		return true;
	}

}
