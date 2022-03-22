import java.util.Random;

public class ArrayGenerator {
    int tam = 100;
    int lista[]= new int[tam];
    int numerosAleatoios[] = new int[tam];
    int numero1 = 0;
    int numero2 = 0;
    int suma = 1;
    String respuesta = "";
    int contador = 0;
    int contador2 =0;
    int numeros_aleatorios;
    Random random = new Random();
    String result = "";


    public ArrayGenerator(){
        do {

            numero1=numero2;
            numero2=suma;
            suma=numero1+numero2;
            lista[contador] = suma;
            respuesta += lista[contador] + " ";
            //System.out.println("lista fibonacis" + lista[contador]);
            contador +=1;
        }while(contador<tam);

        contador=0;
        do {
            contador2 =0;
            //System.out.println("contador "+ contador);

            numeros_aleatorios =random.nextInt(0+140)+0;
            //numeros_aleatorios =(int) Math.random()*1000 +1;

            //System.out.println("numero aleatorios " + numeros_aleatorios);
            do{

                //System.out.println("numeros alatorios " + numeros_aleatorios);
                if(numeros_aleatorios != lista[contador2]){
                    //System.out.println("numeros alatorios " + numeros_aleatorios);
                    //System.out.println("numeros fibos " + lista[contador2]);
                    numerosAleatoios[contador] = numeros_aleatorios;
                    //System.out.println("lista aleatorios "+ numerosAleatoios[contador2]);
                }
                contador2 +=1;
            }while (contador2<tam);
            contador +=1;
        }while(contador<tam);
    }

    public String toString(){
        contador = 0;
        do{
            //System.out.println("numeros alatorios " + numerosAleatoios[contador]);
            result += numerosAleatoios[contador] + " ";
            contador +=1;
        }while (contador <tam);
        return result;

    }




}