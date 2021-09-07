import java.text.SimpleDateFormat;
import java.util.Date;

public class datetreino {
    public static void main(String[] args){

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);

        System.out.println("BaianorJoestar");

    }
}
