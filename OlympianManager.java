import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class OlympianManager {
		private Olympian[] olympianArray = new Olympian[15];
		private String olys;
		
		public OlympianManager(String filePath) {
			olympianArray = new Olympian[olympians];
			for(int i = 0; i< olympianArray.length; i++){
				olympianArray[i] = new Olympian();
			}
			try {
				
				BufferedReader inputStream = new BufferedReader(new FileReader(filePath));
				
				String line2;
				Boolean firstLine = false;
				Integer current = 0;
				
				while((line2 = inputStream.readLine()) != null) {
						if(firstLine == true) {
							List<String> fileList = Arrays.asList(line2.split(","));
						
						int age = Integer.parseInt(fileList.get(2).replaceAll("\\s", ""));
						
							String cleansed = fileList.get(1).replaceAll("\\s", "");
						
							if(cleansed.equals("M")){
							olympianArray[current].setInfo(fileList.get(0), Sex.M, age);
						}else {
							olympianArray[current].setInfo(fileList.get(0), Sex.M, age);
						}
						
						current++;
						}else {
							firstLine = true;
						}
					}
				
			}catch (Exception e) {
				
			}		
		}	
		
		
		
			
		/*	
			Olympian[] olympians = new Olympian[16];
			olympians[0] = new Olympian("Tito", Sex.M, 18);
			olympians[1] = new Olympian("Brandon", Sex.M, 19);
			olympians[2] = new Olympian("Alyssa", Sex.F, 19);
			olympians[3] = new Olympian("Duane", Sex.M, 19);
			olympians[4] = new Olympian("Rachelle", Sex.F, 19);
			olympians[5] = new Olympian("Jae", Sex.M, 18);
			olympians[6] = new Olympian("Zack", Sex.M, 19);
			olympians[7] = new Olympian("Jon", Sex.M, 19);
			olympians[8] = new Olympian("Gab", Sex.F, 18);
			olympians[9] = new Olympian("Talia", Sex.F, 20);
			olympians[10] = new Olympian("Brian", Sex.M, 99);
			olympians[11] = new Olympian("Ethan", Sex.M, 19);
			olympians[12] = new Olympian("Max", Sex.M, 19);
			olympians[13] = new Olympian("Will", Sex.M, 19);
			olympians[14] = new Olympian("Nicholas", Sex.M, 19);
			olympians[15] = new Olympian("Jack", Sex.M, 19);}
			*/	
			
			public Olympian[] getObjectOlympians() {
				return this.olympianArray;
			}
			
			public void printOlympians(){
				for(int i = 0; i < olympianArray.length; i++) {
					System.out.println(olympianArray[i].getInfo());
				}
			}
}			
			