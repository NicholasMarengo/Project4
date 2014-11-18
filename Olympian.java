
public class Olympian {
		
		private String name;
		private Sex sex;
		private int age;
		
		public Olympian(){
			this.name = "";
			this.sex = Sex.M;
			this.age = 0;
		}
		
		public Sex getSex(){
			return this.sex;
		}
		
		public Olympian(String newName, Sex newSex, int newAge) {
			this.name = newName;
			this.sex = newSex;
			this.age = newAge;
		}
		
		public void setInfo(String newName, Sex newSex, int newAge) {
			this.name = newName;
			this.sex = newSex;
			this.age = newAge;
		}
		
		public String getInfo() {
			return this.name + " : " + this.sex + " : " + this.age;
		}
		
}		