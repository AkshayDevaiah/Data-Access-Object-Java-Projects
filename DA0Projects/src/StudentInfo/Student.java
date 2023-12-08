package StudentInfo;

public class Student {
		private int id;
		private String name;
		Student(int id1,String name1){
			id=id1;
			name=name1;
		}
		public void setId(int id) {
			this.id=id;
		}
		public void setName(String Name) {
			this.name=name;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
	}
