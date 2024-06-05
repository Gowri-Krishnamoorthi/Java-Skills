package app.skills;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Skill {
	@Id
   String skillname;
   int efficiency;
    @ManyToOne
   Students stu;
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(String skillname, int efficiency, Students stu) {
		super();
		this.skillname = skillname;
		this.efficiency = efficiency;
		this.stu = stu;
	}
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	public int getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(int efficiency) {
		this.efficiency = efficiency;
	}
	public Students getStu() {
		return stu;
	}
	public void setStu(Students stu) {
		this.stu = stu;
	}
    
    
}
