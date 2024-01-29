/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prediccionenfermedadescardiacas;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kary
 */
public class Menu {

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        // Se establece la ruta del archivo CSV asegurarse  de que la ruta sea correcta.
        IPersonasRepository csvReader = new CsvReader("C:\\Users\\Kary\\Documents\\PryHFPD\\PryHFPD\\src\\main\\java\\com\\mycompany\\pryhfpd\\resources\\heart.csv");
        List<CCPEC> personas = csvReader.obtenerPersonas();
        Metodos leerFuncional = new Metodos();
        int opcion;
        do {
            System.out.println("---- Menú Principal ----");
            System.out.println("1. ¿Cuántas personas hay en el conjunto de datos?");
            System.out.println("2. ¿Cuántos hombres hay en el conjunto de datos?");
            System.out.println("3. ¿Quienes son los primeros 30 personas  en el conjunto de datos?");
            System.out.println("4. ¿Cuántas mujeres hay en el conjunto de datos?");
            System.out.println("5. ¿Cuántos hombres mayores de 70 años hay en el conjunto de datos?");
            System.out.println("6. ¿Cuántas personas experimentan angina durante el ejercicio?");
            System.out.println("7. ¿Cuántas personas tienen enfermedad cardiaca?");
            System.out.println("8. ¿Cuántos hombres y cuántas mujeres tienen enfermedad cardiaca?");
            System.out.println("9. ¿Cuál es la presión arterial en reposo de las mujeres en el conjunto de datos?");
            System.out.println("10. ¿Cuál es la presión arterial en reposo de los hombres en el conjunto de datos?");
            System.out.println("11. ¿Cuál es la frecuencia cardiaca maxima promedio en el conjunto de datos?");
            System.out.println("12. ¿Cuál es el valor medio del descenso del segmento ST en el electrocardiograma?");
            System.out.println("13. ¿Cuántas personas experimentan angina durante el ejercicio y están en ayunas?");
            System.out.println("14. ¿Cuántas personas experimentan angina durante el ejercicio y tienen enfermedad cardíaca?");
            System.out.println("15. ¿Cuántos hombres no experimentan angina durante el ejercicio y tienen enfermedad cardíaca?");
            System.out.println("16. ¿Cuántas mujeres no experimentan angina durante el ejercicio y tienen enfermedad cardíaca?");
            System.out.println("17. ¿Cuántos datos faltantes hay?");
            System.out.println("18. ¿Cuál es la presión arterial en reposo promedio en el conjunto de datos?");
            System.out.println("19. ¿Cuál es el nivel de colesterol promedio en el conjunto de datos?");
            System.out.println("20. ¿Cuál es la edad promedio de quienes tienen un electrocardiograma en reposo en estado normal?");
            System.out.println("21. ¿Cuántas personas, tienen niveles de colesterol dentro del rango saludable de 125 a 200 mg/dL?");
            System.out.println("22. ¿Cuántas personas, tienen niveles de colesterol mayor a 200 mg/dL?");
            System.out.println("23. ¿Cuál es el promedio de edades de quienes no tienen problemas cardiacos pero sufren de dolor de pecho de angina típica (ATA)?");
            System.out.println("24. De las personas cuyos niveles de colesterol total están fuera del rango saludable de 125 a 200 mg/dL, ¿quién tiene enfermedad cardíaca según la información disponible?");
            System.out.println("25. De las personas con niveles de colesterol total dentro del rango saludable de 125 a 200 mg/dL, ¿quién tiene enfermedad cardíaca según la información proporcionada?");
            System.out.println("26. ¿Cuántos personas tienen hipertrofia ventricular izquierda (LVH) en el electrocardiograma en reposo y no experimentan angina durante el ejercicio?");
            System.out.println("27. ¿Cuál es el promedio de edad de quienes no tienen problemas cardiacos, no sufren de dolor de pecho (NAP), con niveles de colesterol total dentro del rango saludable de 125 a 200 mg/dL y estando en ayunas?");
            System.out.println("28. De las personas con niveles de colesterol total dentro del rango saludable de 125 a 200 mg/dL, ¿Quiénes sufren de dolor de pecho de angina típica (ATA) ?");
            System.out.println("29. De las personas con niveles de colesterol total dentro del rango saludable de 125 a 200 mg/dL, ¿Quiénes sufren de dolor de pecho asintomático (ASY)? ");
            System.out.println("30. De las personas cuyos niveles de colesterol total están fuera del rango saludable de 125 a 200 mg/dL, ¿Quiénes no sufren de dolor de pecho (NAP)?");

            System.out.println("0. Salir");

            System.out.print("Ingrese el número de la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int totalPacientes = leerFuncional.total(personas);
                    System.out.println("La cantidad total de personas es: " + totalPacientes);
                    break;
                case 2:
                    double cantidadHombres = leerFuncional.contarHombres(personas);
                    System.out.println("La cantidad total de hombres es: " + cantidadHombres);

                    break;
                case 3:
                    List<CCPEC> primerosTreintaPacientes = leerFuncional.primerosTreinta(personas);
                    System.out.println("Los primeros 30 personas son: ");
                    for (int i = 0; i < primerosTreintaPacientes.size(); i++) {
                        System.out.println(primerosTreintaPacientes.get(i));
                    }
                    
                    break;
                case 4:
                    double cantidadMujeres = leerFuncional.contarMujeres(personas);
                    System.out.println("La cantidad total de mujeres es: " + cantidadMujeres);
                    break;
                case 5:
                    double mayoresDe70 = leerFuncional.contarHombresMayoresDe70(personas);
                    System.out.println("La cantidad total de hombres mayores de 70 es: " + mayoresDe70);
                    break;
                case 6:
                    double personasConAngina = leerFuncional.contarCCPECConAngina(personas);
                    System.out.println("La cantidad total de personas que experimentan angina durante el ejercicio: " + personasConAngina);
                    break;
                case 7:
                    System.out.println("La cantidad total de personas que sufren de enfermedad cardiaca: "
                            + leerFuncional.contarCCPECConEnfermedadCardiaca(personas));
                    break;
                case 8:
                    System.out.println("Cantidad de personas con enfermedad cardiaca:"
                            + leerFuncional.contarHombresMujeresConEnfermedadCardiaca(personas));
                    break;
                case 9:
                    
                    List<String> obtenerPresionArterialMujeres = leerFuncional.obtenerPresionArterialMujeres(personas);
                    System.out.println("Presion arterial de mujeres:");
                    for (int i = 0; i < obtenerPresionArterialMujeres.size(); i++) {
                        System.out.println(obtenerPresionArterialMujeres.get(i));
                    }
                  
                    break;
                case 10:
                    List<String> obtenerPresionArterialHombres = leerFuncional.obtenerPresionArterialHombres(personas);
                    System.out.println("Presion arterial de Hombres:");
                    for (int i = 0; i < obtenerPresionArterialHombres.size(); i++) {
                        System.out.println(obtenerPresionArterialHombres.get(i));
                    }
                 
                    break;
                case 11:
                    System.out.println(" La frecuencia cardiaca maxima promedio es: " + leerFuncional.obtenerFrecuenciaCardiacaMaximaPromedio(personas));
                    break;
                case 12:
                    System.out.println(" El valor medio de DescansoST es : " + leerFuncional.obtenerValorMedioDescensoST(personas));
                    break;
                case 13:
                    System.out.println(" Personas con anginas en ayunas : " + leerFuncional.contarCCPECAnginaEnAyunas(personas));
                    break;
                case 14:
                    System.out.println(" Personas con anginas con enfermedad cardiaca : " + leerFuncional.contarCCPECAnginaConEnfermedadCardiaca(personas));
                    break;
                case 15:
                    System.out.println(" Personas sin anginas con enfermedad cardiaca : " + leerFuncional.contarHombresSinAnginaConEnfermedadCardiaca(personas));
                    break;
                case 16:
                    System.out.println(" Mujeres sin anginas con enfermedad cardiaca : "
                            + leerFuncional.contarMujeresSinAnginaConEnfermedadCardiaca(personas));
                    break;
                case 17:
                    System.out.println(" Datos Faltante : "
                            + leerFuncional.contarDatosFaltantes(personas));
                    break;
                case 18:
                    System.out.println(" Presion arterial promedio : "
                            + leerFuncional.calcularPresionArterialPromedio(personas));
                    break;
                case 19:
                    System.out.println(" Colesterol promedio : "
                            + leerFuncional.calcularColesterolPromedio(personas));
                    break;
                case 20:
                    System.out.println(" Edad promedio de personas con un electrocardigrama normal: "
                            + leerFuncional.calcularEdadPromedioConECGNormal(personas));
                    break;
                case 21:
                    System.out.println(" Personas con colesterol saludable (125 a 200 mg/dL) : "
                            + leerFuncional.contarPersonasConColesterolSaludable(personas));
                    break;
                case 22:
                    System.out.println(" Personas con sobrepeso  ( colesterol mayor de 200 mg/dL) : "
                            + leerFuncional.contarPersonasConColesterolMayor200(personas));
                    break;
                case 23:
                    System.out.println(" Edad promedio de personas  sin problemas cardiacos pero sufren de dolor de pecho de angina típica "
                            + leerFuncional.calcularEdadPromedioSinProblemasCardiacosConAnginaTypica(personas));
                    break;
                case 24:
                    List<CCPEC> personasConColesterolFueraDeRangoYEnfermedadCardiaca = leerFuncional.obtenerPersonasConColesterolFueraDeRangoYEnfermedadCardiaca(personas);
                    System.out.println(" Edad promedio de personas  sin problemas cardiacos pero sufren de dolor de pecho de angina típica: ");
                    for (int i = 0; i < personasConColesterolFueraDeRangoYEnfermedadCardiaca.size(); i++) {
                        System.out.println(personasConColesterolFueraDeRangoYEnfermedadCardiaca.get(i));
                    }
                    break;
                case 25:
                    
                    List<CCPEC> obtenerPersonasConColesterolEnRangoYEnfermedadCardiaca = leerFuncional.obtenerPersonasConColesterolEnRangoYEnfermedadCardiaca(personas);
                    System.out.println("Personas con colesterol mayor de 200 mg/dL :");
                    for (int i = 0; i < obtenerPersonasConColesterolEnRangoYEnfermedadCardiaca.size(); i++) {
                        System.out.println(obtenerPersonasConColesterolEnRangoYEnfermedadCardiaca.get(i));
                    }
                                        
                    break;
                case 26:
                    System.out.println(" Personas con hipertrofia ventricular izquierda (LVH) sin experimentar angina durante el ejercicio "
                            + leerFuncional.contarCCPECConLVHSinAngina(personas));
                    break;
                case 27:
                    System.out.println("Edad promedio de personas sin problemas cardiacas, sin dolor de pecho, y con colesterol saludable (125 a 200 mg/dL) estando en ayunas   : "
                            + leerFuncional.calcularEdadPromedioSinProblemasCardiacosConNAPyColesterolEnRangoYAyunas(personas));
                    break;
                case 28:
                    List<CCPEC> personasConColesterolEnRangoYAnginaTypica = leerFuncional.obtenerPersonasConColesterolEnRangoYAnginaTypica(personas);
                    System.out.println("Personas con colesterol saludable (125 a 200 mg/dL) pero sufren de dolor de pecho de angina típica : ");
                    for (int i = 0; i < personasConColesterolEnRangoYAnginaTypica.size(); i++) {
                        System.out.println(personasConColesterolEnRangoYAnginaTypica.get(i));
                    }
                    
                    break;
                case 29:
                    
                    List<CCPEC> obtenerPersonasConColesterolEnRangoYDolorAsintomatico = leerFuncional.obtenerPersonasConColesterolEnRangoYDolorAsintomatico(personas);
                    System.out.println("Personas con colesterol saludable (125 a 200 mg/dL) que sufren de dolor asintomatico :  ");
                    for (int i = 0; i < obtenerPersonasConColesterolEnRangoYDolorAsintomatico.size(); i++) {
                        System.out.println(obtenerPersonasConColesterolEnRangoYDolorAsintomatico.get(i));
                    }
                  
                    break;
                case 30:
                    
                    List<CCPEC> obtenerPersonasConColesterolFueraDeRangoYSinDolorPecho = leerFuncional.obtenerPersonasConColesterolFueraDeRangoYSinDolorPecho(personas);
                    System.out.println("Personas con colesterol mayor de 200 mg/dL  sin experimentar dolor de pecho : ");
                    for (int i = 0; i < obtenerPersonasConColesterolFueraDeRangoYSinDolorPecho.size(); i++) {
                        System.out.println(obtenerPersonasConColesterolFueraDeRangoYSinDolorPecho.get(i));
                    }
                  
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
