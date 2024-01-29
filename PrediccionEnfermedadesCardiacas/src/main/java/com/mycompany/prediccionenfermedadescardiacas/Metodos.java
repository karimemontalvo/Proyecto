package com.mycompany.prediccionenfermedadescardiacas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Clase que contiene métodos relacionados con el procesamiento de una lista de objetos CCPEC
public class Metodos {

    // Método para obtener la cantidad total de elementos en la lista ccpec
    public int total(List<CCPEC> ccpec) {
        return ccpec.size(); // tamaño de la lista
    }

    // Método para contar la cantidad de hombres en la lista ccpec
    public double contarHombres(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> "M".equals(paciente.getSexo())) //Filtrar por mujeres
                .count();// contador
    }

    // Método para obtener los primeros 30 elementos de la lista ccpec
    public List<CCPEC> primerosTreinta(List<CCPEC> ccpec) {
        return ccpec.stream()
                .limit(30) //limite hasta de 30 personas
                 
                .collect(Collectors.toList());// Recopilar en una lista
    }

    // Método para contar la cantidad de mujeres en la lista ccpec
    public double contarMujeres(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> "F".equals(paciente.getSexo())) //Filtrar por mujeres
                .count();// contador
    }

    // Método para contar la cantidad de hombres mayores de 70 en la lista ccpec
    public double contarHombresMayoresDe70(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> "M".equals(paciente.getSexo()) && //Filtrar por hombres
                        paciente.getEdad() > 70) //filtrar mayor de 70 años 
                .count(); // contador
    }

    // Método para contar la cantidad de pacientes con angina en la lista ccpec
    public double contarCCPECConAngina(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> "Y".equals(paciente.getAnginaEjercicio()))//Filtrar personas con agina durante el ejercicio
                .count();// contador
    }

    // Método para contar la cantidad de pacientes con enfermedad cardiaca en la lista ccpec
    public double contarCCPECConEnfermedadCardiaca(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> paciente.getEnfermedadCardiaca() == 1)// Filtra personas con enfermedad cardiaca
                .count();// contador
    }

    // Método para contar la cantidad de hombres y mujeres con enfermedad cardiaca por separado
public String contarHombresMujeresConEnfermedadCardiaca(List<CCPEC> ccpec) {
    double cantidadHombresConEnfermedadCardiaca = ccpec.stream()
            // Filtra personas masculinos con enfermedad cardiaca
            .filter(paciente -> "M".equals(paciente.getSexo()) && paciente.getEnfermedadCardiaca() == 1)
            // Cuenta la cantidad de hombres con enfermedad cardiaca
            .count();
    double cantidadMujeresConEnfermedadCardiaca = ccpec.stream()
            // Filtra personas femeninos con enfermedad cardiaca 
            .filter(paciente -> "F".equals(paciente.getSexo()) && paciente.getEnfermedadCardiaca() == 1)
            // Cuenta la cantidad de mujeres con enfermedad cardiaca
            .count();

    // Retornar resultados como cadena
    return "Hombres con enfermedad cardiaca: " + cantidadHombresConEnfermedadCardiaca
            + "\nMujeres con enfermedad cardiaca: " + cantidadMujeresConEnfermedadCardiaca;
}
    // Método para obtener la presión arterial de mujeres en la lista ccpec
public List<String> obtenerPresionArterialMujeres(List<CCPEC> ccpec) {
    return ccpec.stream()
            // Filtra los personas que son de género femenino
            .filter(paciente -> "F".equals(paciente.getSexo()))
            // Mapea cada personas femenino a un String que representa su presión arterial en reposo
            .map(mujer -> "Presión arterial en reposo de mujer: (edad) " + mujer.getEdad() + " (Presión arterial) " + mujer.getPresionEnReposo())
            .collect(Collectors.toList());  // Recopilar en una lista
}


   // Método para obtener la presión arterial de hombres en la lista ccpec
public List<String> obtenerPresionArterialHombres(List<CCPEC> ccpec) {
    return ccpec.stream()
            // Filtra los personas que son de género masculino
            .filter(paciente -> "M".equals(paciente.getSexo())) // Filtrar por Hombres
            // Mapea cada personas masculino a un String que representa su presión arterial en reposo
            .map(hombre -> "Presión arterial en reposo de hombre: (edad) " + hombre.getEdad() + " (Presión arterial) " + hombre.getPresionEnReposo())
            .collect(Collectors.toList()); // Recopilar en una lista
}



    // Método para obtener el promedio de la frecuencia cardíaca máxima en la lista ccpec
    public double obtenerFrecuenciaCardiacaMaximaPromedio(List<CCPEC> ccpec) {
        return ccpec.stream()
                .mapToInt(CCPEC::getMaxFC)
                .average()
                .orElse(0.0);// calcular el promedio de la frecuencia cardíaca máxima
    }

    // Método para obtener el valor medio del descenso ST en la lista ccpec
    public double obtenerValorMedioDescensoST(List<CCPEC> ccpec) {
        return ccpec.stream()
                .mapToDouble(CCPEC::getDescensoST)
                .average()
                .orElse(0.0); //calcular el valor medio del descenso ST
    }

    // Método para contar la cantidad de personas con angina en ayunas en la lista ccpec
    public double contarCCPECAnginaEnAyunas(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> "Y".equals(paciente.getAnginaEjercicio()) && // Filtrar por angina durante el ejercicio
                        paciente.getAyunas() == 1)// Filtrar por personas en ayunas
                .count(); //contador
    }

    // Método para contar la cantidad de personas con angina y enfermedad cardiaca en la lista ccpec
    public double contarCCPECAnginaConEnfermedadCardiaca(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> "Y".equals(paciente.getAnginaEjercicio()) && // Filtrar por angina durante el ejercicio
                        paciente.getEnfermedadCardiaca() == 1) // Filtrar personas con enfermedad cardiaca
                .count();// contador
    }

    // Método para contar la cantidad de hombres sin angina y con enfermedad cardiaca en la lista ccpec
    public double contarHombresSinAnginaConEnfermedadCardiaca(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> "M".equals(paciente.getSexo()) &&//Filtrar por hombres
                        "N".equals(paciente.getAnginaEjercicio()) && // Filtrar por angina durante el ejercicio
                        paciente.getEnfermedadCardiaca() == 1) // Filtrar personas con enfermedad cardiaca
                .count();// contador 
    }

    // Método para contar la cantidad de mujeres sin angina y con enfermedad cardiaca en la lista ccpec
    public double contarMujeresSinAnginaConEnfermedadCardiaca(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> "F".equals(paciente.getSexo()) &&//Filtrar por mujeres
                        "N".equals(paciente.getAnginaEjercicio()) && // Filtrar por angina durante el ejercicio
                        paciente.getEnfermedadCardiaca() == 1) // Filtrar personas con enfermedad cardiaca
                .count(); // contador
    }

    // Método para contar la cantidad de datos faltantes en la lista ccpec
public int contarDatosFaltantes(List<CCPEC> ccpec) {
    return (int) ccpec.stream()
            // Se utiliza flatMap para transformar cada objeto CCPEC en un Stream 
            //(presión en reposo, colesterol, y máxima frecuencia cardíaca)
            .flatMap(paciente -> Stream.of(
                    paciente.getPresionEnReposo(),
                    paciente.getColesterol(),
                    paciente.getMaxFC()
            ))
            // Se filtran los datos que son iguales a 0 (considerados como datos faltantes)
            .filter(dato -> dato == 0)
            // Se cuenta la cantidad de datos faltantes
            .count();
}

    // Método para calcular el promedio de la presión arterial en reposo en la lista ccpec
    public double calcularPresionArterialPromedio(List<CCPEC> ccpec) {
        return ccpec.stream()
                .mapToDouble(CCPEC::getPresionEnReposo)
                .average()
                .orElse(0.0); // calcular el promedio  de la presion en reposo
    }

    // Método para calcular el promedio del colesterol en la lista ccpec
    public double calcularColesterolPromedio(List<CCPEC> ccpec) {
        return ccpec.stream()
                .mapToDouble(CCPEC::getColesterol)
                .average()
                .orElse(0.0);// calcular el promedio del colesterol
    }

    // Método para calcular el promedio de la edad de pacientes con electrocardiograma normal en la lista ccpec
    public double calcularEdadPromedioConECGNormal(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> "Normal".equals(paciente.getElectroEnReposo()))// Filtrar por electrocardiograma normal
                .mapToDouble(CCPEC::getEdad)
                .average()
                .orElse(0.0); // calcular edad promedio
    }

    // Método para contar la cantidad de personas con niveles de colesterol saludables en la lista ccpec
    public double contarPersonasConColesterolSaludable(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> paciente.getColesterol() >= 125 && paciente.getColesterol() <= 200)// Filtrar por niveles en el rango saludable
                .count();// contador
    }

    // Método para contar la cantidad de personas con niveles de colesterol mayores a 200 en la lista ccpec
    public double contarPersonasConColesterolMayor200(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> paciente.getColesterol() > 200) // Filtrar por niveles mayor de 200 
                .count(); // contador
    }

    // Método para calcular el promedio de la edad de personas sin problemas cardiacos y con angina típica en la lista ccpec
    public double calcularEdadPromedioSinProblemasCardiacosConAnginaTypica(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> paciente.getEnfermedadCardiaca() == 0 // Filtrar personas sin enfermedad cardiaca
                        && "ATA".equals(paciente.getAnginaEjercicio())) // Filtrar por angia durante el ejercicio igual a ATA
                .mapToDouble(CCPEC::getEdad)
                .average()
                .orElse(0.0); // calcula la edad promedio
    }

    // Método para obtener personas con colesterol fuera de rango y enfermedad cardiaca en la lista ccpec
    public List<CCPEC> obtenerPersonasConColesterolFueraDeRangoYEnfermedadCardiaca(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> paciente.getColesterol() < 125 || paciente.getColesterol() > 200) // Filtrar por niveles fuera del rango saludable
                .filter(paciente -> paciente.getEnfermedadCardiaca() == 1) // Filtrar persona con enfermedad cardiaca
                .collect(Collectors.toList()); // Recopilar en una lista
    }

    // Método para obtener personas con colesterol en rango y enfermedad cardiaca en la lista ccpec
    public List<CCPEC> obtenerPersonasConColesterolEnRangoYEnfermedadCardiaca(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> paciente.getColesterol() >= 125 && paciente.getColesterol() <= 200) // Filtrar por niveles en el rango saludable
                .filter(paciente -> paciente.getEnfermedadCardiaca() == 1) // Filtrar persona con enfermedad cardiaca
                .collect(Collectors.toList()); // Recopilar en una lista
    }

    // Método para contar la cantidad de personas con LVH sin angina en la lista ccpec
    public double contarCCPECConLVHSinAngina(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> "LVH".equals(paciente.getElectroEnReposo())  // Filtrar por Electrocardiograma igual a LVH
                        && "N".equals(paciente.getAnginaEjercicio())) // y sin angina durante el ejercicio
                .count(); // contador
    }

    // Método para calcular el promedio de la edad de personas sin problemas cardiacos, con NAP, colesterol en rango y en ayunas en la lista ccpec
    public double calcularEdadPromedioSinProblemasCardiacosConNAPyColesterolEnRangoYAyunas(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> paciente.getEnfermedadCardiaca() == 0) // Filtrar personas sin enfermadad cardiaca
                .filter(paciente -> "NAP".equals(paciente.getTipoDolorPecho())) // Filtrar por tipo de dolor de pecho NAP
                .filter(paciente -> paciente.getColesterol() >= 125 && paciente.getColesterol() <= 200)// Filtrar por niveles en el rango saludable
                .filter(paciente -> paciente.getAyunas() == 1) // Filtrar personas en ayunas
                .mapToDouble(CCPEC::getEdad)
                .average() // edad promedio
                .orElse(0.0); 
    }

    // Método para obtener personas con colesterol en rango y angina típica en la lista ccpec
    public List<CCPEC> obtenerPersonasConColesterolEnRangoYAnginaTypica(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> paciente.getColesterol() >= 125 && paciente.getColesterol() <= 200) // Filtrar por niveles en el rango saludable
                .filter(paciente -> "ATA".equals(paciente.getTipoDolorPecho())) // Filtrar por personas con dolor de pecho ATA
                .collect(Collectors.toList());// Recopilar en una lista
    }

    // Método para obtener personas con colesterol en rango y dolor asintomático en la lista ccpec
    public List<CCPEC> obtenerPersonasConColesterolEnRangoYDolorAsintomatico(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> paciente.getColesterol() >= 125 && paciente.getColesterol() <= 200) // Filtrar por niveles en el rango saludable
                .filter(paciente -> "ASY".equals(paciente.getTipoDolorPecho())) // Filtrar por personas con dolor de pecho ASY
                .collect(Collectors.toList());// Recopilar en una lista
    }

    // Método para obtener personas con colesterol fuera de rango y sin dolor de pecho en la lista ccpec
    public List<CCPEC> obtenerPersonasConColesterolFueraDeRangoYSinDolorPecho(List<CCPEC> ccpec) {
        return ccpec.stream()
                .filter(paciente -> paciente.getColesterol() < 125 || paciente.getColesterol() > 200) // Filtrar por niveles fuera del rango saludable
                .filter(paciente -> "NAP".equals(paciente.getTipoDolorPecho())) // Filtrar por personas sin dolor de pecho
                .collect(Collectors.toList());// Recopilar en una lista
    }
}
