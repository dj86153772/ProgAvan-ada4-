import java.util.Scanner;

public class Exercicio09 {
		
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int seg,min,horas;
        int segundos;

        System.out.println("Informe a dura��o do evento em segundos: ");
        segundos = sc.nextInt();

        horas= segundos/3600;
        min=(segundos-(horas*3600))/60;
        seg= (segundos - (horas*3600)-(min*60));

        System.out.printf("HH:MM:SS = %d:%d:%d",horas,min,seg);
        sc.close();
    }

	}

		

