/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prediccionenfermedadescardiacas;

// Clase de  Características Clínicas sobre la Predicción de Enfermedades Cardíacas
 

public class CCPEC {
    private int edad;
    private String sexo;
    private String tipoDolorPecho;
    private int presionEnReposo;
    private int colesterol;
    private int ayunas;
    private String electroEnReposo;
    private int maxFC;
    private String anginaEjercicio;
    private double descensoST;
    private String pendienteST;
    private int enfermedadCardiaca;

    public CCPEC(int edad, String sexo, String tipoDolorPecho, int presionEnReposo, int colesterol, int ayunas,
                    String electroEnReposo, int maxFC, String anginaEjercicio, double descensoST,
                    String pendienteST, int enfermedadCardiaca) {
        this.edad = edad;
        this.sexo = sexo;
        this.tipoDolorPecho = tipoDolorPecho;
        this.presionEnReposo = presionEnReposo;
        this.colesterol = colesterol;
        this.ayunas = ayunas;
        this.electroEnReposo = electroEnReposo;
        this.maxFC = maxFC;
        this.anginaEjercicio = anginaEjercicio;
        this.descensoST = descensoST;
        this.pendienteST = pendienteST;
        this.enfermedadCardiaca = enfermedadCardiaca;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoDolorPecho() {
        return tipoDolorPecho;
    }

    public void setTipoDolorPecho(String tipoDolorPecho) {
        this.tipoDolorPecho = tipoDolorPecho;
    }

    public int getPresionEnReposo() {
        return presionEnReposo;
    }

    public void setPresionEnReposo(int presionEnReposo) {
        this.presionEnReposo = presionEnReposo;
    }

    public int getColesterol() {
        return colesterol;
    }

    public void setColesterol(int colesterol) {
        this.colesterol = colesterol;
    }

    public int getAyunas() {
        return ayunas;
    }

    public void setAyunas(int ayunas) {
        this.ayunas = ayunas;
    }

    public String getElectroEnReposo() {
        return electroEnReposo;
    }

    public void setElectroEnReposo(String electroEnReposo) {
        this.electroEnReposo = electroEnReposo;
    }

    public int getMaxFC() {
        return maxFC;
    }

    public void setMaxFC(int maxFC) {
        this.maxFC = maxFC;
    }

    public String getAnginaEjercicio() {
        return anginaEjercicio;
    }

    public void setAnginaEjercicio(String anginaEjercicio) {
        this.anginaEjercicio = anginaEjercicio;
    }

    public double getDescensoST() {
        return descensoST;
    }

    public void setDescensoST(double descensoST) {
        this.descensoST = descensoST;
    }

    public String getPendienteST() {
        return pendienteST;
    }

    public void setPendienteST(String pendienteST) {
        this.pendienteST = pendienteST;
    }

    public int getEnfermedadCardiaca() {
        return enfermedadCardiaca;
    }

    public void setEnfermedadCardiaca(int enfermedadCardiaca) {
        this.enfermedadCardiaca = enfermedadCardiaca;
    }

    @Override
    public String toString() {
        return "Paciente{" + "edad=" + edad + ", sexo=" + sexo + ", tipoDolorPecho=" + tipoDolorPecho + ", presionEnReposo=" + presionEnReposo + ", colesterol=" + colesterol + ", ayunas=" + ayunas + ", electroEnReposo=" + electroEnReposo + ", maxFC=" + maxFC + ", anginaEjercicio=" + anginaEjercicio + ", descensoST=" + descensoST + ", pendienteST=" + pendienteST + ", enfermedadCardiaca=" + enfermedadCardiaca + '}';
    }

}