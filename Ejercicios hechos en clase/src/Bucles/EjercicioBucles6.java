package Bucles;
//Telemetría para medir las conexiones de dos servidores: server1 y server2
public class EjercicioBucles6 {
    public static void main (String[]args){
        int [] server1conexiones = {50, 0, 200, 150, 0 ,250, 1500 };
        int [] server2conexiones = {75,120 , 250, 0 , 300, 175, 100 };
        String [] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        //Variables deel problema
        int diaPuntaServer1 =0 ;
        int diaPuntaServer2 = 0;
        int conexionesSemanaServer1 = 0;
        int conexionesSemanaServer2 = 0;
        int diasCaidosServer1 = 0;
        int diasCaidosServer2 = 0;
        //Solución al problema

        //Obtenemos el día de la semana que tiene más conexiones
for (int i= 0; i<server1conexiones.length; i++ ){
    if (server1conexiones[i]> diaPuntaServer1){
        diaPuntaServer1 = server1conexiones[i];
        diaPuntaServer1++;
    }
   
    //Obtenemos el número total de conexiones en una semana 
    conexionesSemanaServer1 = conexionesSemanaServer1 + server1conexiones[i];
    }
    //Ahora obtenemos el número de días que el servidor ha estado caído
    for (int i=0; i < server1conexiones.length; i++){
 if (server1conexiones[i]==0){
        diasCaidosServer1++;
    }
    }
    //Ahora hacemos lo mismo con el otro servidor
for (int x =0; x < server2conexiones.length; x++){
    if (server2conexiones[x]> diaPuntaServer2){
        diaPuntaServer2 = server2conexiones[x];
        diaPuntaServer2++;
    }
    conexionesSemanaServer2 = conexionesSemanaServer2 + server2conexiones[x];
     }
     for (int x = 0; x < server2conexiones.length; x ++){
         if (server2conexiones[x] == 0){
        diasCaidosServer2++;
    }
     }
     //Realizamos un informe de los servidores
System.out.println("El dia con mayor número de conexiones del servidor 1 es " + diasSemana + "con un numero de conexiones de " + diaPuntaServer1);
System.out.println("El dia con mayor número de conexiones del servidor 2 es " + diasSemana + "con un numero de conexiones de " + diaPuntaServer2);
System.err.println("El total de conexiones de el servidor 1 es de " + conexionesSemanaServer1);
System.err.println("El total de conexiones de el servidor 2 es de " + conexionesSemanaServer2);
System.out.println("El numero de dias que el servidor 1 ha estado caido es de " + diasCaidosServer1+ " dias");
System.out.println("El numero de dias que el servidor 2 ha estado caido es de " + diasCaidosServer2+ " dias");
}
    }

