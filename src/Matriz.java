import java.util.Scanner;

public class Matriz {
    Boolean matrizConDatos = false;
    String opcion;
    int xTam=4;
    int yTam =4;
    int [][] cuadroMatricial = new int[xTam][yTam];
    int data;
    int sumaFila =0;
    int sumaColumna = 0;
    int sumaDiagonal = 0;
    int sumaDiagonaInversa =0;
    int promedio =0;

    public Matriz(){
        /*for (int fila = 0; fila < 4; fila ++){
            for (int columna = 0; columna < 4; columna ++){
                cuadroMatricial[x][y]= -1;
            }
        }*/
    }
    public void mostrarMenu() {
        System.out.println("*********  MENU  ********");
        System.out.println("Elija una Opcion asegurese primero de llenar la matriz para realizar operaciones:");
        System.out.println(" ");
        System.out.println("(1) --> Llenar Datos en Matriz 4 x 4");
        System.out.println("(2) --> Sumar Fila");
        System.out.println("(3) --> Sumar Columna");
        System.out.println("(4) --> Sumar Diagonal Principal");
        System.out.println("(5) --> Sumar Diagonal Secundaria");
        System.out.println("(6) --> Calcular la Media de los datos en la Matriz");
        System.out.println("*************************");
        System.out.println(" ");
        System.out.println("Opcion: ");

        Scanner consola = new Scanner(System.in);
        opcion = consola.next();

        System.out.println("Opcion Selecionada: " + opcion);

        switch (opcion){
            case "1":
                insertarData();
                break;
            case "2":
                sumarFila();
                break;
            case "3":
                sumarColumna();
                break;
            case "4":
                sumarDiagonalPrincipal();
                break;
            case "5":
                sumarDiagonalInversa();
                break;
            case "6":
                imprimirMedia();
                break;
            default:
                System.out.println("La Opcion: " + opcion + " no es valida");
                break;
        }
    }
    public void imprimirRequisito(){
        matrizConDatos = false;
        System.out.println("La Opcion: " + opcion + " no se puede procesar hasta primero llenar la Matriz");
        mostrarMenu();
    }
    public void insertarData() {
        matrizConDatos = true;
        System.out.println("entrando a 1");
        for (int fila = 0; fila < xTam; fila ++){
            for (int columna = 0; columna < yTam; columna ++){
                System.out.println("ingrese valor para la matriz en posicion: fila: " + fila + " columna: " + columna);
                Scanner datos = new Scanner(System.in);
                data = datos.nextInt();

                cuadroMatricial[fila][columna]= data;
            }
        }
        //imprimirMatriz();
        mostrarMenu();
    }
    public void imprimirMatriz(){
        System.out.println("matriz llenada es:");
        for (int fila = 0; fila < xTam; fila ++){
            for (int columna = 0; columna < yTam; columna ++){
                System.out.println(cuadroMatricial[fila][columna]);
            }
        }
    }
    public void sumarFila() {
        if(matrizConDatos) {
            System.out.println("ingrese el Valor de la Fila a Sumar: ");
            Scanner userFila = new Scanner(System.in);
            int entradaFila = userFila.nextInt();
            if(entradaFila >=0 && entradaFila <xTam){
                for (int columna = 0; columna< yTam; columna ++ ){
                    sumaFila +=  cuadroMatricial[entradaFila][columna];
                }
                System.out.println("La suma de la fila: " + entradaFila + " es : " + sumaFila );
            }else{
                System.out.println("El valor de la Fila: " + entradaFila + " no es Valido; ingrese un valor entre 0 y 3" );
            }
        }else{
            imprimirRequisito();
        }

    }

    public void sumarColumna() {
        if(matrizConDatos){
            System.out.println("ingrese el Valor de la Columna a Sumar,Rango valido [0-3]: ");
            Scanner userColumna = new Scanner(System.in);
            int entradaColumna = userColumna.nextInt();
            if(entradaColumna >=0 && entradaColumna < yTam){
                for (int fila = 0; fila< xTam; fila ++ ){
                    sumaColumna +=  cuadroMatricial[fila][entradaColumna];
                }
                System.out.println("La suma de la columna: " + entradaColumna + " es : " + sumaColumna );
            }else{
                System.out.println("El valor de la Columna: " + entradaColumna + " no es Valido; ingrese un valor entre 0 y 3" );
                sumarColumna();
            }

        }else{
            imprimirRequisito();
        }

    }

    public void sumarDiagonalPrincipal() {
        if(matrizConDatos){
            for(int fila = 0; fila < xTam; fila ++){
                for(int columna = 0; columna < yTam; columna ++){
                    if (fila == columna){
                        sumaDiagonal +=cuadroMatricial[fila][columna];
                    }
                }

            }
            System.out.println("La suma de la Diagonal Principal es: " + sumaDiagonal);
        }else{
            imprimirRequisito();
        }
    }

    public void sumarDiagonalInversa() {
        if(matrizConDatos){
            for(int fila = 0; fila < xTam; fila ++){
                for(int columna = 0; columna < yTam; columna ++){
                    if ((fila + columna) == cuadroMatricial.length-1){
                        sumaDiagonaInversa +=cuadroMatricial[fila][columna];
                    }
                }
            }
            System.out.println("La suma de la Diagonal Inversa es: " + sumaDiagonaInversa);
        }else{
            imprimirRequisito();
        }
    }

    public void imprimirMedia() {
        if(matrizConDatos){
            for(int fila = 0; fila < xTam; fila ++){
                for (int columna = 0; columna < yTam; columna ++){
                    promedio += cuadroMatricial[fila][columna];
                }
            }
            promedio = promedio / (xTam * yTam);

            System.out.println("El Promedio de los datos en la matriz " + xTam +" x " +yTam + " es: " + promedio);
        }else{
            imprimirRequisito();
        }
    }
}
