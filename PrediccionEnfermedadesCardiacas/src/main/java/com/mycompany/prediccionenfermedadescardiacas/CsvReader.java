package com.mycompany.prediccionenfermedadescardiacas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CsvReader implements IPersonasRepository {

    private static final String SEPARADOR = ",";
    private final String ruta;

    public CsvReader(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public List<CCPEC> obtenerPersonas() {
        Path path = Path.of(ruta);

        try {
            return Files.lines(path)
                    .skip(1) // Saltar la primera línea si contiene encabezados
                    .map(linea -> linea.split(SEPARADOR))
                    .map(this::mapearAPaciente)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            // Manejar la excepción apropiadamente
            e.printStackTrace(); // O usa un logger para registrar la excepción
            return Collections.emptyList(); // o lanza una excepción personalizada o retorna un valor predeterminado
        }
    }

    private CCPEC mapearAPaciente(String[] campos) {
        int edad = Integer.parseInt(campos[0]);
        String sexo = campos[1];
        String tipoDolorPecho = campos[2];
        int presionEnReposo = Integer.parseInt(campos[3]);
        int colesterol = Integer.parseInt(campos[4]);
        int ayunas = Integer.parseInt(campos[5]);
        String electroEnReposo = campos[6];
        int maxFC = Integer.parseInt(campos[7]);
        String anginaEjercicio = campos[8];
        double descensoST = Double.parseDouble(campos[9]);
        String pendienteST = campos[10];
        int enfermedadCardiaca = Integer.parseInt(campos[11]);

        return new CCPEC(edad, sexo, tipoDolorPecho, presionEnReposo, colesterol, ayunas,
                electroEnReposo, maxFC, anginaEjercicio, descensoST, pendienteST, enfermedadCardiaca);
    }

}
