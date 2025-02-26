import java.util.Scanner;

public class TomYJerryAuxiliarEjer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       
        System.out.print("coloque la cantidad total de pasar>>>> ");
        int niveles = scan.nextInt();

       
        System.out.print("coloque cantidad de niveles que Tom puede pasar>>> ");
        int cantidadDeTom = scan.nextInt();
        int[] nivelesDeTom = new int[cantidadDeTom];
        System.out.println("coloque los niveles que Tom puede pasar>>>>  ");
        for (int i = 0; i < cantidadDeTom; i++) {
            nivelesDeTom[i] = scan.nextInt();
        }

       
        System.out.print("Ingrese la cantidad de niveles que Jerry puede pasar: ");
        int cantidadDeJerry = scan.nextInt();
        int[] nivelesDeJerry = new int[cantidadDeJerry];
        System.out.println("Ingrese los niveles que Jerry puede superar: ");
        for (int i = 0; i < cantidadDeJerry; i++) {
            nivelesDeJerry[i] = scan.nextInt();
        }

      
        boolean[] completados = new boolean[niveles + 1];
        for (int i = 0; i < cantidadDeTom; i++) {
            completados[nivelesDeTom[i]] = true;
        }
        for (int i = 0; i < cantidadDeJerry; i++) {
            completados[nivelesDeJerry[i]] = true;
        }

        
        boolean puedenCompletar = true;
        for (int i = 1; i <= niveles; i++) {
            if (!completados[i]) {
                puedenCompletar = false;
                break;
            }
        }

      
        if (puedenCompletar) {
            System.out.println("Chi");
        } else {
            System.out.println("Nao");
        }

          
    }
}
