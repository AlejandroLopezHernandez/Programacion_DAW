package Persistencia_Datos.Ejercicio_Dia_D;

public class Cifrador {
   public String cifrar (String entrada_cifrar){
    int desplazamiento = 1;
    StringBuilder texto_cifrado = new StringBuilder();
    char caracter_cifrado = 0;
    char caracter_original = 0;
    

    for (int i = 0; i < entrada_cifrar.length(); i++) {
        caracter_original = entrada_cifrar.charAt(i);
        caracter_cifrado = (char)(caracter_original + desplazamiento);
        texto_cifrado.append(caracter_cifrado);
    }
    return texto_cifrado.toString();
   }

   public String descifrar (String entrada_descifrar){
    StringBuilder texto_descifrado = new StringBuilder();
    char caracter_descifrado = 0;
    char caracter_cifrado_original = 0;

    for (int i = 0; i < entrada_descifrar.length(); i++) {
        caracter_cifrado_original = entrada_descifrar.charAt(i);
        caracter_descifrado = (char)(caracter_cifrado_original - 1);
        texto_descifrado.append(caracter_descifrado);
    }
    return texto_descifrado.toString();
   }
}
