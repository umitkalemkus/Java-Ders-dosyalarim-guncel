package j26_Inheritance.Inheritance02;

public class Mammal extends Hayvancık {// hayvancik parentin child klasidir- babadir
    public Mammal() {//parametresiz constractor
        this('y');//bu klasin parametreli constartr call edildi.
        System.out.println("Agam ahan da mammal p'siz cons...");
    }
    public Mammal(char c) {//parametreli constractor

        super(17); //parent hayvancik class

        System.out.println("Agam ahan da mammal p'li cons...");
    }

    public void mC(){

        System.out.println("mC------- > Mammal class method call.");




    }
    int m=1;
    int c=4;

    @Override
    public void mM() {//EZEN METHOD

        System.out.println("mM------- > Mammal class method call.");

    }
}
