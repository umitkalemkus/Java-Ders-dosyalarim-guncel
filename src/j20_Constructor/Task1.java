package j20_Constructor;

public class Task1 {

    /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
      int width;
      int length;


    public Task1(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int area () {
       int area= width*length;
    return area;
    }

    public int perimeter (){
        int perimeter  = 2*(width + length);

        return perimeter;
    }


}
