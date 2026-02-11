package test09;

public class cytech09 {

	public static void main(String[] args) {
		
		String [] sub = {"国語","数学","理科","社会"};
		
		int [][] scores = {
			{20,95,50,55},
			{30,40,70,20},
			{40,45,60,80},
			{50,50,25,30},
		};
		
		for(int i = 0;i < scores.length;i++) {
			System.out.println((i+1) + "人目の学生");
			
			for(int j=0 ; j<scores[i].length ; j++) {
				System.out.println(sub[j] + ":" + scores[i][j] + "点");
			}
			
			System.out.println();
		}
		
	}

}
