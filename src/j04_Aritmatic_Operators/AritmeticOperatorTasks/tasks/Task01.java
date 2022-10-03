package j04_Aritmatic_Operators.AritmeticOperatorTasks.tasks;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++;//5       x= x+1
        x += x;//6    x= x+1
        --x;//5       x= x-1
        x = 7 + x;//12
        x *= x;// 12*12
        x -= 3; //256-3 =253

        System.out.println(" x = " + x );
        
        int a = 3;
        double d = 4.5;

        d+=a; //d = a+d 7.5
        a+=d; // a= a+d  7.5 +3 =10.5      10 (Integer oldugu icin) d=7.5
        d-=a;  // d =d-a 7.5    7.5-10 = -2.5    d=-2.5  a=10
        a-=d;  // a= a-d  10- - 2.5 =  12,5     (Integer oldugu icin)  12

        System.out.println(" d = " + ++d );       // d= -2.5 +1 =-1.5
        System.out.println(" a = " + a-- );      //  a= 12 yazdirdiktan sonra ise => a= 12-1 =11 degerini alir.
        
        

	}

}
