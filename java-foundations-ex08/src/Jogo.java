import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public void iniciarPartida(Equipe time1, Equipe time2){
        Scanner input = new Scanner(System.in);
        int temperatura;
        int count = 0;
        System.out.println("Digite a temperatura: ");
            temperatura = input.nextInt();
        if(temperatura>0&&temperatura<20){
            diaNormal(time1, time2);
            
        }else if(temperatura>=20&&temperatura<40){
            diaQuente(time1, time2);
        }
        else{
            System.out.println("Muito frio para jogar");
        }
    }

    private void diaQuente(Equipe time1, Equipe time2){
        Random random = new Random();
        int golsTime1 = random.nextInt(5, 10);
        int golsTime2 = random.nextInt(5, 10);
        estatisticas(time1, time2, golsTime1, golsTime2);
        
    }

    private void diaNormal(Equipe time1, Equipe time2){
        Random random = new Random();
        int golsTime1 = random.nextInt(0, 4);
        int golsTime2 = random.nextInt(0, 4);
        estatisticas(time1, time2, golsTime1, golsTime2);
    }

    private void estatisticas(Equipe time1, Equipe time2, int golsTime1, int golsTime2){
        time1.setGolsMarcados(golsTime1);
        time2.setGolsMarcados(golsTime2);
        time1.setGolsSofridos(golsTime2);
        time2.setGolsSofridos(golsTime1);
        if(golsTime1>golsTime2){
            time1.setVitorias(time1.getVitorias()+1);
            time2.setDerrotas(time2.getDerrotas()+1);
        }else if(golsTime2>golsTime1){
            time1.setDerrotas(time1.getDerrotas()+1);
            time2.setVitorias(time2.getVitorias()+1);
        }else{
            time1.setEmpates(time1.getEmpates()+1);
            time2.setEmpates(time2.getEmpates()+1);
        }
    }
    

}
