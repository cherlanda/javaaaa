/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cherlanda.app;

/**
 *
 * @author sayut_000
 */
public class Decision {
    private String cashPointId;
    private String lokasi;
    private double sislok;
    private double tarikan;
    private double forecastAccuracy;

    public String getCashPointId() {
        return cashPointId;
    }

    public void setCashPointId(String cashPointId) {
        this.cashPointId = cashPointId;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public double getSislok() {
        return sislok;
    }

    public void setSislok(double sislok) {
        this.sislok = sislok;
    }

    public double getTarikan() {
        return tarikan;
    }

    public void setTarikan(double tarikan) {
        this.tarikan = tarikan;
    }

    public double getForecastAccuracy() {
        return forecastAccuracy;
    }

    public void setForecastAccuracy(double forecastAccuracy) {
        this.forecastAccuracy = forecastAccuracy;
    }
}
