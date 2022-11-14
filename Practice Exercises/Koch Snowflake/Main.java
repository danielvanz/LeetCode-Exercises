import javax.swing.plaf.synth.SynthScrollBarUI;

public class Main {

    static double perimeter = 0;
    static int lastLength = 0; 
    static int amountTriangles = 3;

    public static void main(String[] args) {

        int length = 531441   ;
        int iterations = 9;

        perimeter = 4 * length * Math.pow((5.0/3), iterations);
        System.out.println(perimeter);
    }

    static void start(int length, int iterations){
        // lastLength = length;
        // for (int i = 0; i <= iterations; i++) {
        //  addLength(lastLength, i);
        // }
        // System.out.println(perimeter);
        
    }

    static void addLength(int addLength, int i){



        
        // if (i == 0){
        //     perimeter = addLength * 3;
        // }
        // else if (i == 1){

        //     perimeter = perimeter + addLength;
        //     lastLength = addLength / 3;

        // }
        // else{

        //     int addedOnce = lastLength / 3;
        //     int addedTriangle = addedOnce * 2;
        //     int addedWhole = addedTriangle * amountTriangles;
        //     amountTriangles = amountTriangles * 2;
        //     lastLength = addLength / 3;

        //     perimeter = perimeter + addedWhole;

        // }
    }
    
}