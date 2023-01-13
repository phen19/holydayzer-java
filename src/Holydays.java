import java.util.Arrays;
import java.util.List;

public class Holydays {
    
    Holyday[] feriados = new Holyday[11];
    private String[] datas = {"01/01/2023",
    "21/02/2023",
    "17/04/2023",
    "21/04/2023",
    "01/05/2023",
    "08/06/2023",
    "07/09/2023",
    "12/10/2023",
    "02/11/2023",
    "15/11/2023",
    "25/12/2023"};
    private String[] feriado = {"Confraternização mundial",
    "Carnaval",
    "Páscoa",
    "Tiradentes",
    "Dia do trabalho",
    "Corpus Christi",
    "Independência do Brasil",
    "Nossa Senhora Aparecida",
    "Finados",
    "Proclamação da República",
    "Natal"};

   public Holydays(){
    for (int i=0; i<11; i++){
        feriados[i] = new Holyday(datas[i], feriado[i]);
      };
   } 

   public void checkData (String data){
    boolean hasHoliday = false;
    String found = "";
    for(int i =0; i<11; i++){
        if(data.equals(feriados[i].data)){
            hasHoliday = true;
            found = feriados[i].feriado;
        }
    }

    if(hasHoliday){
        System.out.println("O feriado da data " + data + " é " + found);
    }else{
        System.out.println("Infelizmente não há feriado na data de " + data);
    }
   }

   public void getAll(){
    System.out.println("LISTA DOS FERIADOS");
    for(int i=0; i<feriados.length; i++){
        System.out.print("----\n" + 
        "Dia: "+ feriados[i].data + "\n" +
        "Feriado: "+ feriados[i].feriado +"\n"+
        "----\n");
    }
   }
}