package control;

public class LoginControler {

     //Datos del usuario temporal
     String[][] credenciales = {
        {"marlopez",    "MarL#2025"},
        {"daniperez",   "DaniP@91"},
        {"wilgonzalez", "WilGz!88"},
        {"daniaquiro",  "DanA*732"},
        {"pedroes",     "Pedro_55"},
        {"nidilop",     "NidiLop7#"},
        {"gaspergot",   "GasGo@01"}
    };
    

     public boolean validacionDatos (String Eusuario, String ENcontraseña){

        boolean res = false;

        for (int i = 0; i < credenciales.length; i++) {
            

            if (credenciales[i][0].equals(Eusuario) && credenciales[i][1].equals(ENcontraseña)) {
                res = true;
            }else {
                res = false;
            }

        }
            return res;

            
        }
    }  
    
