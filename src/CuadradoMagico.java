import java.util.Scanner;

class cuadradoMagico{
    public cuadradoMagico(){
        System.out.println("Ingrese la dimension para el Cuadrado Magico (debe ser impar)");
        Scanner consola = new Scanner(System.in);
        int dimension = consola.nextInt();

        if(dimension %2 !=0){
            int n=dimension;//Tamanho del cuadrado
            int [][]cuadrado=new int[n] [n];
            ceros(cuadrado);// lo rellenamos de ceros
            cuadrado(n,cuadrado);//lo rellenamos
            imprimir(cuadrado);
        }else{
            System.out.println("Ingrese una dimension impar");
        }
    }


    public static void cuadrado(int n, int[][]cuadrado){
        int c=n/2;
        int f=0;
        int ci=0, fi=0;

        cuadrado[f][c]=1;

        for(int i=2;i<=n*n;i++){
            if (f-1<0){
                f=n-1;
            }else{
                f=f-1;
            }
            if (c+1>n-1){
                c=0;
            }else{
                c=c+1;
            }
            if (cuadrado[f][c]==0){
                cuadrado[f][c]=i;
                fi=f;ci=c;//guardamos la ultima posicion rellenada
            }
            else{
                f=fi+1;c=ci;//recuperamos la ultima posicion rellenada
                cuadrado[f][c]=i;
            }
        }

    }
    public static void ceros(int[][] c){
        for (int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                c[i][j]=0;
            }

        }
    }
    public static void imprimir(int[][] c){
        for (int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();

        }
    }
}

