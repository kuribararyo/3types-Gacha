package entity;

import value.ID;
import value.Name;
import value.Rerity;

public class Character {
	private ID id;
	private Rerity rerity;
	private Name name;
	
	public Character( ID id, Rerity rerity, Name name) {
		this.id = id;
		this.rerity = rerity;
		this.name = name;
	}

	public ID getId() {
		return id;
	}
	
	public Rerity getRerity() {
		return rerity;
	}
	
	public Name getName() {
		return name;
	}

}
