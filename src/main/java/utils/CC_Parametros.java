package main.java.utils;

public interface CC_Parametros {
    String url = "https://www.saucedemo.com/";
    
    String nombreAutomatizador = "[Flujo-Automatizado]";
    String nombreProyecto = "[*Proyecto*]";
    
    String curDir = System.getProperty("user.dir");
    String gloDir = curDir + "\\CC_Logs_2p\\";
    
    //Archivo CSV con los datos de entrada
    int gloColumnas = 5;
    String gloNombreCSV = "CSVParametersCarritoCompras.csv";
    //Fin
}
