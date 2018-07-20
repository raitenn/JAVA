public class Test2{
     public static void main(String[] args){
         
          for(int i = 2; i <= 20; i++){


          	if(i % 5 == 0){
          		if(i % 3 == 0){
          			System.out.println("カツ丼¥850");
          		}
          		else{
          			System.out.println("カツ丼");
          		}
          		
			}
			else if(i % 3 == 0){
				System.out.println("¥850");
			}
          	else{
          		System.out.println(i);
          	}
     	}
	}
}