package ForLoop2;

public class FindMin {
        public static void main(String[] args) {
		int[] ages= {54,62,53,90,87,32,5};
		int mini=ages[0];
		for(int i=0;i<ages.length;i++) {
		if(ages[i]<mini) {
		mini=ages[i];
		}
		
		}
		System.out.println(mini);
		}

	}



