package app.skills;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;
@Entity
public class Students {
	@Id
   int id;
   String name;
   @OneToMany
   List<Skill> skill;
public Students() {
	super();
	// TODO Auto-generated constructor stub
}
public Students(int id, String name, List<Skill> skill) {
	super();
	this.id = id;
	this.name = name;
	this.skill = skill;
}
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
public List<Skill> getSkill() {
	return skill;
}
public void setSkill(List<Skill> skill) {
	this.skill = skill;
}
   
   
}
