package j12_Loops.L01_ForLoop.WhileLoopTasks.Tasks;


public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.


		 */
		int number = 0;

		System.out.println("********* FOR DONGUSU ***********");
		for (int i = 100; i <1000 ; i++) {
		if (i%4 ==0 && i%6==0 ){
			System.out.println(i);
			number++;
		}
		}

		System.out.println("There are  " +  number  + "   numbers"   );

		System.out.println("********* WHILE DONGUSU ***********");

		int number1 = 0;
		int number2 = 100;
		while (number2<1000)
		{if (number2%4==0 && number2%6==0){
			System.out.println(number2);
			number1++;
		   }
		}
		System.out.println("There are  " +  number1  + "   numbers"   );
	}

}
