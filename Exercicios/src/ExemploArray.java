public class ExemploArray {
    public static void main(String[] args){

        String[] names = new String[10];

        names[0] = "Bruno";
        names[1] = "Ana";
        names[2] = "Larissa";
        names[3] = "Eduardo";
        names[4] = "João";


        // acessa o indice
        /*
        for(int i =0; i <= names.length; i++)  {
            System.out.println(names[i]);
        }
         */

        // acessa o valor do array
        for(String name : names){
            System.out.println(name);
        }
    }
}
