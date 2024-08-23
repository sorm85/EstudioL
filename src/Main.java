import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public String msj = "El Resultado de la resta de Main es";
    public int random = 0;
    public static int random2 = 0;

    public static void main(String[] args) {

        suma();

        for (int i = 0; i < 5; i++) {
            Main main2 = new Main();
            main2.random = i*2;
            main2.imprimeRandom();

        }
        for (int i = 0; i < 2000; i++) {

            Cubo cubo = new Cubo();
            cubo.x = i * 5;
            cubo.y = i * 6;
            cubo.color2 = i;
            System.out.println(cubo.print());


        }
//        random2 =
        System.out.println("suma con metodo de retorno: "+new Main().sumaConRetorno(5,7));

    }

    /* Esta clase lo que hace es sumar jaja */


    public static void suma (){
        Main mainClass = new Main();
        mainClass.sumaConNumeroPorMain(78,42);
        mainClass.restaConNumeroPorMain(78,42);
        mainClass.MultiConNumeroPorMain(78,42);
        mainClass.DivisonConNumeroPorMain(42,78);
        SumaEnStatic(42,78);


    }


    public void imprimeRandom (){
        System.out.println(random);
    }


    public static void SumaEnStatic (int internal1, int intenal2 ){
        System.out.println("SUMA CON STATIC: "+(internal1+intenal2));
    }

    public int  sumaConRetorno (int x, int y){
        int resultado = 0;
        resultado = x + y;
        return resultado;
    }
    public void sumaConNumeroPorMain (int internal1, int internal2){

        int resultado = internal1 + internal2;
        System.out.println(msj+resultado);

    }
    public void restaConNumeroPorMain (int internal1, int internal2){

        int resultado = internal1 - internal2;
        System.out.println(msj+resultado);

    }
    public void MultiConNumeroPorMain (int internal1, int internal2){

        System.out.println(msj+(internal1*internal2));

    }
    public void DivisonConNumeroPorMain (int internal1, int internal2){
        if (internal2 >= internal1){
            System.out.println("error, el 1er numero debe ser mator que el segundo");

        } else {
            System.out.println(msj+( internal1 / internal2));
        }




    }
}

class Cubo {
    public int x = 0;
    public int y = 0;
    public int color2 = 0;
    String msg = "";

    public String print (){

        msg = "El numero x: "+x+" el numero y: "+y+" y el color es: "+color2;
        return msg;
    }
}