package part01;

import java.util.ArrayList;
import java.util.List;

public class sample1 {
	public static void main(String[] args) {
		int sum= 0;
		System.out.println("args");
		List<MemDTO> aList = new ArrayList<MemDTO>();
		aList.add(new MemDTO("홍길동",30));
		aList.add(new MemDTO("노진솔",27));
		aList.add(new MemDTO("이문용",23));
		
		for(int k=0;k<aList.size();k++) {
			MemDTO dto = aList.get(k);
			System.out.println(dto);
			System.out.println(dto.getName()+":::"+dto.getAge());
		}
		display();
		for(int i=0;i<5;i++){
			sum=sum+i;
			System.out.printf("i=%d sum%d\n",i,sum);
		}
	}//end main(
	
	public static void display() {
		int add=0;
		for(int j=0;j<5;j++) {
			add=add+j;
			System.out.printf("j=%d sum%d\n",j,add);
		}
	}
}//end class
