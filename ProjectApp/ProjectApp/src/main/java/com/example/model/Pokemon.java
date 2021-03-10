package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Food")
public class Pokemon {

	@Id
	@Column(name="poke_id")
	private int id;
	
	@Column(name="name", unique=true, nullable=false)
	private String name;
	
	@Column(name="type", nullable=false)
	private String type;
	
	@Column(name="hp", nullable =false)
	private int hp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", name=" + name + ", type=" + type + ", hp=" + hp + "]";
	}

	public Pokemon(int id, String name, String type, int hp) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.hp = hp;
	}

	public Pokemon() {
		super();
	}
	
	


}
