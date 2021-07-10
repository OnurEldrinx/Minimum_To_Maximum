import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        int x,y,z,min,max,middle;

        System.out.print("x: ");
        x = keyboard.nextInt();
        System.out.print("y: ");
        y = keyboard.nextInt();
        System.out.print("z: ");
        z = keyboard.nextInt();

        // x is min
        if (x<y && x<z){

            min = x;

            if (y<z){

                middle = y;
                max = z;



            }else{

                middle = z;
                max = y;


            }

            System.out.println(min + " < " + middle + " < " + max);

        }

        // y is min
        if (y<x && y<z){

            min = y;

            if (x<z){

                middle = x;
                max = z;



            }else{

                middle = z;
                max = x;


            }

            System.out.println(min + " < " + middle + " < " + max);

        }

        // z is min
        if (z<x && z<y){

            min = z;

            if (x<y){

                middle = x;
                max = y;



            }else{

                middle = y;
                max = x;


            }

            System.out.println(min + " < " + middle + " < " + max);

        }










    }
}
