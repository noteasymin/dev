package kakao;

import java.util.Scanner;

public class blind_naming {

	public static String solution(String new_id) {
		String userid = new_id;
		String answer = "";
		String havetodeletestring = null;

		userid = userid.toLowerCase(); // 1단계

		
		  // 2단계 
		  for(int i=0 ; i<128;i++){
		  
		if(i>96 && i<123)
			continue;
		
		if(i>47 && i<58)
			continue;
		
		if(i==45 || i==95 || i==46)
			continue;
		
		for(int j=0;j<i;j++) {
		  char[] havetodeletechar = null;
		  havetodeletechar[j] = (char)i;
		  havetodeletestring += Character.toString(havetodeletechar[j]);
		}
		
		 
		  userid = userid.replace(havetodeletestring," ");
		 
		  }
		 

		answer = userid;

		return answer;
	}

	public static void main(String[] args) {
		String new_id;
		String solutionid;

		Scanner sc = new Scanner(System.in);
		new_id = sc.nextLine();

		solutionid = solution(new_id);
		System.out.println(solutionid);
	}

}
