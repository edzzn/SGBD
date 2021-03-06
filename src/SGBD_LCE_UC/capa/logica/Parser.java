package SGBD_LCE_UC.capa.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


/**
 * Created by edzzn on 7/10/17.
 */
public class Parser {

    private int operacion;
    private Object[] comando;
    private String codigo;

    /*
    * Operacion
    * 1 - crearTabla
    * 2 - modificarTabla
    * 3 - EliminarTabla
    * 4 - unirTablas
    *
    * 5 - CrearRegistro
    * 6 - modificarRegistro
    * 7 - eliminarRegistro
    * 8 - seleccionarRegistros
    *
    * /

    /**
     *
     * @param codigo
     */
    Parser (String codigo){
        this.codigo = codigo.replace(" ", "");
        this.operacion = this.getOperacionString(this.codigo);
        this.parserizar(operacion, this.codigo);
    }

    public static void main(String[] argv){
//        String comando = "UNIR nombre_tabla1, nombre_tabla2 POR nombre_campo=\"Algo\" ORDENADO asc VER 50";
//        Object[] comandoArr = unirTabla(comando);
//        System.out.println(comando);
//        mostrarArray(comandoArr);
//
//        System.out.println("");
//        comando = "UNIR nombre_tabla1, nombre_tabla2 POR nombre_campo=\"Algo\" ORDENADO dsc VER 50";
//        comandoArr = unirTabla(comando);
//        System.out.println(comando);
//        mostrarArray(comandoArr);
//
//        System.out.println("");
//        comando = "UNIR nombre_tabla1, nombre_tabla2 POR nombre_campo=\"Algo\" ORDENADO dsc";
//        comandoArr = unirTabla(comando);
//        System.out.println(comando);
//        mostrarArray(comandoArr);
//
//        System.out.println("");
//        comando = "UNIR nombre_tabla1, nombre_tabla2 POR nombre_campo=\"Algo\" VER 50";
//        comandoArr = unirTabla(comando);
//        System.out.println(comando);
//        mostrarArray(comandoArr);
//
//        System.out.println("");
//        comando = "UNIR nombre_tabla1, nombre_tabla2 POR nombre_campo=\"Algo\"";
//        comandoArr = unirTabla(comando);
//        System.out.println(comando);
//        mostrarArray(comandoArr);

//        String comando = "SELECCIONAR DE nombre_tabla DONDE nombre_campo = \"Algo\" ORDENADO asc VER 20 ";
//       
//        Object[] comandoArray = seleccionarRegistro(comando);
//        mostrarArray(comandoArray);
//
//        System.out.println("");
//        comando = "SELECCIONAR DE nombre_tabla DONDE nombre_campo = \"Algo\" ORDENADO dsc";
//       
//        comandoArray = seleccionarRegistro(comando);
//        mostrarArray(comandoArray);
//
//        System.out.println("");
//        comando = "SELECCIONAR DE nombre_tabla DONDE nombre_campo = \"Algo\" VER 20 ";
//       
//        comandoArray = seleccionarRegistro(comando);
//        mostrarArray(comandoArray);
//
//        System.out.println("");
//        comando = "SELECCIONAR DE nombre_tabla DONDE nombre_campo = \"Algo\" VER 05";
//       
//        comandoArray = seleccionarRegistro(comando);
//        mostrarArray(comandoArray);
//
//        System.out.println("");
//        comando = "SELECCIONAR DE nombre_tabla DONDE nombre_campo = \"Algo\"";
//       
//        comandoArray = seleccionarRegistro(comando);
//        mostrarArray(comandoArray);
//
//
//


//        String comando = "BORRAR REGISTRO nombre_tabla CLAVE valorCampoClave";
//       
//        Object[] comandoArray = eliminarRegistro(comando);
//        mostrarArray(comandoArray);

        //        String comando = "ACTUALIZAR REGISTRO nombre_tabla CLAVE valorCampoClave CAMPO campo POR valor_campo_nuevo";
//       
//        Object[] comandoArray = modificarRegistro(comando);
//        mostrarArray(comandoArray);


//        String comando = "ACTUALIZAR REGISTRO nombre_tabla CLAVE valorCampoClave CAMPO campo POR valor_campo_nuevo";
//       
//        Object[] comandoArray = crearRegistro(comando);
//        mostrarArray(comandoArray);



        //        String comando = "INSERTAR EN nombre_tabla VALORES vC1, vC2, vC3";
//       
//        Object[] comandoArray = crearRegistro(comando);
//        mostrarArray(comandoArray);



        //        String comando = "ELIMINAR nombre_tabla";
//       
////        Object[] comandoArray = modificarTabla(comando);
//        Object[] comandoArray = {comando.substring(8)};
//        mostrarArray(comandoArray);



//        String comando = "MODIFICAR TABLA nombre_tabla CAMPO nombre_campo POR nombre_campo";
//       
//        Object[] comandoArray = modificarTabla(comando);
//        mostrarArray(comandoArray);


        //        String comando = "CREAR TABLA nombre_tabla CAMPOS camp1, camp2, camp3, camp4 CLAVE camp2 LONGITUD 1, 2, 2, 4 ENCRIPTADO camp3, camp4";
//       
//        Object[] comandoArray = crearTabla(comando);
//        System.out.println("Con Encriptacion");
//        System.out.println(comando);
//
//        mostrarArray(comandoArray);
////
//        System.out.println();
//        String comando2 = "CREAR TABLA nombre_tabla CAMPOS camp1, camp2, camp3, camp4 CLAVE camp2 LONGITUD 1, 2, 3, 4";
//        comando2 = comando2.replace(" ","");
//        Object[] comandoArray2 = crearTabla(comando2);
//        System.out.println("Sin Encriptacion");
//        System.out.println(comando2);
//        mostrarArray(comandoArray2);
    }

    public Object[] crearTabla(String comando){
        try {

            Object[] comandoArr = new Object[5];

            /*
            * [0] = String nombre_tabla1
            * [1] = ArrayList<String> campos
            * [2] = String campo_clave
            * [3] = ArrayList<Integer> Longitudes
            * [4] = ArrayList<String> campos encriptados
            *
            * */

            String resto =  comando.substring(10);

            String[] arrAux = resto.split("CAMPOS");

            comandoArr[0] = arrAux[0];
            resto = arrAux[1];

            arrAux = resto.split("CLAVE");
            comandoArr[1] = new ArrayList<String>(Arrays.asList(arrAux[0].split(",")));
            resto = arrAux[1];

            arrAux = resto.split("LONGITUD");
            comandoArr[2] = arrAux[0];
            resto = arrAux[1];

            arrAux = resto.split("ENCRIPTADO");
            String [] cadenaLongitud = arrAux[0].split(",");
            ArrayList<Integer> vectorLongitud = new ArrayList<Integer>();

            for(int i = 0; i < cadenaLongitud.length; i++) {
                vectorLongitud.add(Integer.parseInt(cadenaLongitud[i]));
            }
            comandoArr[3] = vectorLongitud;

            if(arrAux.length > 1){
                comandoArr[4] = new ArrayList<String>(Arrays.asList(arrAux[1].split(",")));
            }

            return comandoArr;
        } catch (Exception e){
            System.out.println("Algo salio mal");
            return null;
        }
    }

    public Object[] modificarTabla(String comando) {
        try {

            Object[] comandoArr = new Object[3];

            /*
            * [0] = String nombre_tabla
            * [1] = String nombre_campo
            * [2] = String nuevo_nombre_campo
            *
            * */

            String resto = comando.substring(14);
            String[] arrAux = resto.split("CAMPO");
            comandoArr[0] = arrAux[0];
            resto = arrAux[1];

            arrAux = resto.split("POR");
            comandoArr[1] = arrAux[0];
            comandoArr[2] = arrAux[1];

            return comandoArr;
        } catch (Exception e){
            System.out.println("Algo salio mal");
            return null;
        }
    }

    public Object[] eliminarTabla(String comando){
       /*
       * [0] = nombre_tabla a eliminar
       * */

        Object[] commandoArr = {comando.substring(13)};
        return commandoArr;
    }

    public Object[] crearRegistro(String comando){
        try{
           

            Object[] comandoArr = new Object[2];

            /*
            * [0] = String nombre_tabla
            * [1] = ArrayList<String> vCampos
            *
            * */

            String resto =  comando.substring(10);
            String[] auxArr = resto.split("VALORES");
            comandoArr[0] = auxArr[0]; // nombre_tabla
            comandoArr[1] = new ArrayList<String>(Arrays.asList(auxArr[1].split(",")));
            return comandoArr;
        } catch (Exception e){
            System.out.println("Algo salio mal");
            return null;
        }
    }

    public Object[] modificarRegistro(String comando){
        try {


            Object[] comandoArr = new Object[5];

            /*
            * [0] = String Nombre Tabla
            * [1] = String valor campo_clave
            * [2] = String campo
            * [3] = String campoNuevo
            * [4] = Int posición Campo clave
            *		              
            * */		              

            String resto = comando.substring(18);
            String[] auxArr = resto.split("CLAVE");
            comandoArr[0] = auxArr[0]; // nombre_tabla
            resto = auxArr[1];

            auxArr = resto.split("CAMPO");
            comandoArr[1] = auxArr[0]; // valor_campo_clave
            resto = auxArr[1];

            auxArr = resto.split("POR");
            comandoArr[2] = auxArr[0]; // campo
            comandoArr[3] = auxArr[1];

            return comandoArr;

        } catch (Exception e){
            System.out.println("Algo salio mal");
            return null;
        }
    }

    public Object[] eliminarRegistro(String comando){
        try{
           
            Object[] comandoArr = new Object[3];

            /*
            * [0] =  String nombre_tabla
            * [1] = String valorCampoClave
            * [2] = Int posiciónCampo
            *
            * */

            String resto = comando.substring(14);
            String[] auxArr = resto.split("CLAVE");
            comandoArr[0] =  auxArr[0];
            comandoArr[1] = auxArr[1];
            return comandoArr;
        } catch (Exception e){
            System.out.println("Algo salio mal");
            return null;
        }
    }

    public Object[] seleccionarRegistro(String comando){
        try {
           

            Object[] comandoArr = new Object[6];
            /*
            * [0] = nombre_tabla
            * [1] = nombre_campo
            * [2] = valor campo
            * [3] = Ordenado asc/dsc
            * [4] = numElementosMostrar
            * [5] = posCampo
            *
            * */

            String resto = comando.substring(13);
            System.out.println("REsto: "+ resto);
            String nombre_tabla = resto.substring(0, resto.indexOf("DONDE")); //nombre_tabla
            comandoArr[0] = nombre_tabla;

            resto = resto.substring(resto.indexOf(nombre_tabla) + nombre_tabla.length()+5);
            //        System.out.println("Resto  " +resto);
            comandoArr[1] = resto.substring(0, resto.indexOf("="));
            System.out.println("nombre campo¨: " + comandoArr[1]);

            comandoArr[2] = resto.substring(resto.indexOf("\"")+1, resto.lastIndexOf("\""));
            System.out.println("Lllega aca");
            System.out.println("ValoC¨: " + comandoArr[2]);


            if(resto.contains("ORDENADO")){
                String ordenado = resto.substring(resto.indexOf("ORDENADO") + 8, resto.indexOf("ORDENADO") + 11 );
                System.out.println(ordenado);
                if(ordenado.equalsIgnoreCase("dsc") || ordenado.equalsIgnoreCase("asc")){
                    comandoArr[3] = ordenado;
                }
            }
            if(resto.contains("VER")){
                int num;
                String pattern = "(?<=VER).[0-9]+";
                // Create a Pattern object
                Pattern r = Pattern.compile(pattern);
                Matcher m = r.matcher(comando);
                if (m.find( )) {
                    comandoArr[4] = Integer.parseInt(m.group(0));
                }
            }

            return comandoArr;
        } catch (Exception e){
            System.out.println("Algo salio mal");
            return null;
        }
    }

    public Object[] unirTabla(String comando){
        try {
           

            Object[] comandoArr = new Object[6];
            /*
            * [0] = nombre_tabla1
            * [1] = nombre_tabla2
            * [2] = nombre_campo
            * [3] = valor campo
            * [4] = Ordenado asc/dsc
            * [5] = numElementosMostrar
            *
            * */

            String resto = comando.substring(4);
            String nombres_tablas = resto.substring(0, resto.indexOf("POR")); //nombres_tablas
            String[] auxArr = nombres_tablas.split(",");
            comandoArr[0] = auxArr[0];
            comandoArr[1] = auxArr[0];

            resto = resto.substring(resto.indexOf("POR") + 3);
//            System.out.println("Resto  " +resto);
            comandoArr[2] = resto.substring(0, resto.indexOf("="));
            comandoArr[3] = resto.substring(resto.indexOf("\"")+1, resto.lastIndexOf("\""));


            if(resto.contains("ORDENADO")){
                String ordenado = resto.substring(resto.indexOf("ORDENADO") + 8, resto.indexOf("ORDENADO") + 11 );
//                System.out.println(ordenado);
                if(ordenado.equalsIgnoreCase("dsc") || ordenado.equalsIgnoreCase("asc")){
                    comandoArr[4] = ordenado;
                }
            }

            if(resto.contains("VER")){
                int num;
                String pattern = "(?<=VER).[0-9]+";
                // Create a Pattern object
                Pattern r = Pattern.compile(pattern);
                Matcher m = r.matcher(comando);
                if (m.find( )) {
                    comandoArr[5] = Integer.parseInt(m.group(0));
                }
            }

            return comandoArr;
        } catch (Exception e){
            System.out.println("Algo salio mal");
            return null;
        }
    }

    private int getOperacionString(String codigo){
        System.out.println("Codigo en GetOperacion " + codigo);
        if(codigo.contains("CREARTABLA"))
            return 1;
        else if(codigo.contains("MODIFICARTABLA"))
            return 2;
        else if(codigo.contains("ELIMINARTABLA"))
            return 3;
        else if(codigo.contains("UNIR"))
            return 4;
        else if(codigo.contains("INSERTAREN"))
            return 5;
        else if(codigo.contains("ACTUALIZAR"))
            return 6;
        else if(codigo.contains("BORRARREGISTRO"))
            return 7;
        else if(codigo.contains("SELECCIONARDE"))
            return 8;
        else
            throw new SecurityException("Lo sentimos, no se ha entendido esa orden.");
    }

    private void parserizar(int operacion, String codigo){
        switch (operacion){
            case 1:
                this.comando = crearTabla(codigo);
                break;
            case 2:
                this.comando = modificarTabla(codigo);
                break;
            case 3:
                this.comando = eliminarTabla(codigo);
                break;
            case 4:
                this.comando = unirTabla(codigo);
                break;
            case 5:
                this.comando = crearRegistro(codigo);
                break;
            case 6:
                this.comando = modificarRegistro(codigo);
                break;
            case 7:
                this.comando = eliminarRegistro(codigo);
                break;
            case 8:
                this.comando = seleccionarRegistro(codigo);
                break;
            default:
                throw new SecurityException("Lo sentimos, no se ha entendido esa orden.");
        }
    }

    public Object[] getComando(){
        return this.comando;
    }

    public int getOperacion(){
        return operacion;
    }


    public static void mostrarArray(Object[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Array[" + i + "] =  "+ arr[i] + " ");
        }
    }
}
