package StudentUsingCollections;


public class Student {
	    private int id;
	    private String name;
	    private String skill;
	    public Student(int id, String name, String skill) {
	        this.id = id;
	        this.name = name;
	        this.skill = skill;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getSkill() {
	        return skill;
	    }

	    public void setSkill(String skill) {
	        this.skill = skill;
	    }

//	    public String toString() {
//	        return "ID: " + id +"  Student Name: " + name + " Skill: " + skill;
//	    }
	
}
