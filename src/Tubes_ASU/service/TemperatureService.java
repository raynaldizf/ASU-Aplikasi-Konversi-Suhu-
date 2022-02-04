package Tubes_ASU.service;

// Import class temperature interface

import Tubes_ASU.interfaces.TemperatureInterface;

import java.util.Scanner;

// Implements interface
public class TemperatureService implements TemperatureInterface {

    // instanciate var history protected
    private String[] histori = new String[10]; // panjang array 10

    // instanciate var pilih
    private int pilih;

    // instanciate var suhu
    private double suhu;

    // instanciate scanner
    private static Scanner scanner = new Scanner(System.in);

    // Ovveride method getAll
    @Override
    public String[] getAll() {

        // Mengembalikan nilai array history
        return histori;
    }

    // Constructor tanpa parameter
    public TemperatureService() {

    }

    // Overload constructor
    public TemperatureService(double suhu) {
        this.suhu = suhu;
    }

    // Ovveride method printArray
    @Override
    public void printArray() {
        String[] model = getAll();
        for (int i = 0; i < histori.length; i++) {
            String temp = model[i];
            int no = i + 1;
            if (histori[i] != null) {
                System.out.println(no + ". " + temp);
            }
        }
    }

    // Method untuk megnecek apakah array full atau tidak
    public boolean isFull() {
        boolean isFull = true;
        for (int i = 0; i < histori.length; i++) {
            if (histori[i] == null) {
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // mengembalikan nilai boolean isFull
        return isFull;
    }

    // method untuk mengubah panjang array jika penuh
    public void resizeIfFull() {
        // jika penuh, resize ukuran array 2x lipat
        if (isFull()) {
            String[] temp = histori;
            histori = new String[histori.length * 2];

            for (int i = 0; i < temp.length; i++) {
                histori[i] = temp[i];
            }
        }
    }

    // Override method input
    @Override
    // Method untuk inputan
    public int input(String info) {
        System.out.print(info + " : ");
        int data = scanner.nextInt();
        return data;
    }

    // Override method setSuhu
    @Override
    // Untuk mebubah data field suhu
    public void setSuhu(double suhu) {
        this.suhu = suhu;
    }

    // Override method getSuhu
    @Override
    // Untuk megnambil dara filed suhu
    public double getSuhu() {
        return suhu;
    }

    // Override method setPilih
    @Override
    // Untuk mengubah data field pilih
    public void setPilih(int pilih) {
        this.pilih = pilih;
    }

    // Override method getPilih
    @Override
    // Untuk mengambil data field pilih
    public int getPilih() {
        return pilih;
    }

    // Method konversi suhu celcius ke farenheit
    double celciusToFarenheit(double suhu) {
        return (suhu * 1.8) + 32;
    }

    // Method konversi suhu celcius ke reamur
    double celciusToReamur(double suhu) {
        return (suhu * 0.8);
    }

    // Method konversi suhu celcius ke kelvin
    double celciusToKelvin(double suhu) {
        return (suhu + 273.15);
    }

    // Method konversi suhu farenheit ke celcius
    double farenheitToCelcius(double suhu){
        return (suhu - 32) / 1.8;
    }

    // Method konversi suhu farenheit ke reamur
    double farenheitToReamur(double suhu){
        return (suhu - 32) * 0.44;
    }

    // Method konversi suhu farenheit ke kelvin
    double farenheitToKelvin(double suhu){
        return (suhu + 459.67) / 1.8;
    }

    // Method konversi suhu kelvin ke celcius
    double kelvinToCelcius(double suhu){
        return suhu - 273.15;
    }

    // Method konversi suhu kelvin ke farenheit
    double kelvinToFarenheit(double suhu){
        return (suhu * 1.8) - 459.67;
    }

    // Method konversi suhu kelvin ke reamur
    double kelvinToReamur(double suhu){
        return (suhu - 273.15) * 0.8;
    }

    // Method konversi suhu reamur ke celcius
    double reamurToCelcius(double suhu){
        return suhu / 0.8;
    }

    // Method konversi suhu reamur ke farenheit
    double reamurToFarenheit(double suhu){
        return (suhu * 2.25) + 32;
    }

    // Method konversi suhu reamur ke kelvin
    double reamurToKelvin(double suhu){
        return (suhu / 0.8) + 273.15;
    }

    // Override method hitungSuhu
    @Override
    public void hitungSuhu() {
        // memanggil method resizeIsFull
        resizeIfFull();

        //Percabangan pilihan
        if (getPilih() == 1) { // jika nilai pilih = 1

            // Memanggil method get suhu untuk mengambil nilai field suhu
            double jamal = celciusToFarenheit(getSuhu());

            // menampilkan output suhu dan hasil konveri
            System.out.println("1. " + getSuhu() + " Celcius = " + jamal + " Farenheit");

            // Memasukan data ke dalam array jika null
            for (int i = 0; i < histori.length; i++) {
                if (histori[i] == null) {
                    histori[i] = suhu + " Celcius = " + jamal + " Farenheit";
                    break;
                }
            }
        }else if (getPilih()==2){ // jika nilai pilih = 2

            // Memanggil method get suhu untuk mengambil nilai field suhu
            double jamal = celciusToReamur(getSuhu());

            // menampilkan output suhu dan hasil konveri
            System.out.println("1. " + getSuhu() + " Celcius = "+ jamal+" Reamur");

            // Memasukan data ke dalam array jika null
            for (int i = 0; i < histori.length; i++) {
                if (histori[i] == null) {
                    histori[i] = suhu + " Celcius = "+ jamal+" Reamur";
                    break;
                }
            }
        }else if (getPilih()==3){ // jika nilai pilih = 3

            // Memanggil method get suhu untuk mengambil nilai field suhu
            double jamal = celciusToKelvin(getSuhu());

            // menampilkan output suhu dan hasil konveri
            System.out.println("1. " + getSuhu() + " Celcius = "+ jamal+" Kelvin");

            // Memasukan data ke dalam array jika null
            for (int i = 0; i < histori.length; i++) {
                if (histori[i] == null) {
                    histori[i] = suhu + " Celcius = "+ jamal+" Kelvin";
                    break;
                }
            }
        }else if (getPilih()==4){ // jika nilai pilih = 4

            // Memanggil method get suhu untuk mengambil nilai field suhu
            double jamal = farenheitToCelcius(getSuhu());

            // menampilkan output suhu dan hasil konveri
            System.out.println("1. " + getSuhu() + " Farenheit = "+ jamal+" Celcius");

            // Memasukan data ke dalam array jika null
            for (int i = 0; i < histori.length; i++) {
                if (histori[i] == null) {
                    histori[i] = suhu + " Farenheit = "+ jamal+" Celcius";
                    break;
                }
            }
        }else if (getPilih()==5){ // jika nilai pilih = 5

            // Memanggil method get suhu untuk mengambil nilai field suhu
            double jamal = farenheitToReamur(getSuhu());

            // menampilkan output suhu dan hasil konveri
            System.out.println("1. " + getSuhu() + " Farenheit = "+ jamal+" Reamur");

            // Memasukan data ke dalam array jika null
            for (int i = 0; i < histori.length; i++) {
                if (histori[i] == null) {
                    histori[i] = suhu + " Farenheit = "+ jamal+" Reamur";
                    break;
                }
            }
        }else if (getPilih()==6){ // jika nilai pilih = 6

            // Memanggil method get suhu untuk mengambil nilai field suhu
            double jamal = farenheitToKelvin(getSuhu());

            // menampilkan output suhu dan hasil konveri
            System.out.println("1. " + getSuhu() + " Farenheit = "+ jamal+" Kelvin");

            // Memasukan data ke dalam array jika null
            for (int i = 0; i < histori.length; i++) {
                if (histori[i] == null) {
                    histori[i] = suhu + " Farenheit = "+ jamal+" Kelvin";
                    break;
                }
            }
        }else if ((getPilih()==7)){ // jika nilai pilih = 7

            // Memanggil method get suhu untuk mengambil nilai field suhu
            double jamal = kelvinToCelcius(getSuhu());

            // menampilkan output suhu dan hasil konveri
            System.out.println("1. " + getSuhu() + " Kelvin = "+ jamal+" Celcius");

            // Memasukan data ke dalam array jika null
            for (int i = 0; i < histori.length; i++) {
                if (histori[i] == null) {
                    histori[i] = suhu + " Kelvin = "+ jamal+" Celcius";
                    break;
                }
            }
        }else if (getPilih()==8){ // jika nilai pilih = 8

            // Memanggil method get suhu untuk mengambil nilai field suhu
            double jamal = kelvinToFarenheit(getSuhu());

            // menampilkan output suhu dan hasil konveri
            System.out.println("1. " + getSuhu() + " Kelvin = "+ jamal+" Farenheit");

            // Memasukan data ke dalam array jika null
            for (int i = 0; i < histori.length; i++) {
                if (histori[i] == null) {
                    histori[i] = suhu + " Kelvin = "+ jamal+" Farenheit";
                    break;
                }
            }
        }else if (getPilih()==9){ // jika nilai pilih = 9

            // Memanggil method get suhu untuk mengambil nilai field suhu
            double jamal = kelvinToReamur(getSuhu());

            // menampilkan output suhu dan hasil konveri
            System.out.println("1. " + getSuhu() + " Kelvin = "+ jamal+" Reamur");

            // Memasukan data ke dalam array jika null
            for (int i = 0; i < histori.length; i++) {
                if (histori[i] == null) {
                    histori[i] = suhu + " Kelvin = "+ jamal+" Reamur";
                    break;
                }
            }
        }else if (getPilih()==10){ // jika nilai pilih = 10

            // Memanggil method get suhu untuk mengambil nilai field suhu
            double jamal = reamurToCelcius(getSuhu());

            // menampilkan output suhu dan hasil konveri
            System.out.println("1. " + getSuhu() + " Reamur = "+ jamal+" Celcius");

            // Memasukan data ke dalam array jika null
            for (int i = 0; i < histori.length; i++) {
                if (histori[i] == null) {
                    histori[i] = suhu + " Reamur = "+ jamal+" Celcius";
                    break;
                }
            }
        }else if (getPilih()==11){ // jika nilai pilih = 11

            // Memanggil method get suhu untuk mengambil nilai field suhu
            double jamal = reamurToFarenheit(getSuhu());

            // menampilkan output suhu dan hasil konveri
            System.out.println("1. " + getSuhu() + " Reamur = "+ jamal+" Farenheit");

            // Memasukan data ke dalam array jika null
            for (int i = 0; i < histori.length; i++) {
                if (histori[i] == null) {
                    histori[i] = suhu + " Reamur = "+ jamal+" Farenheit";
                    break;
                }
            }
        }else if (getPilih()==12){ // jika nilai pilih = 12

            // Memanggil method get suhu untuk mengambil nilai field suhu
            double jamal = reamurToKelvin(getSuhu());

            // menampilkan output suhu dan hasil konveri
            System.out.println("1. " + getSuhu() + " Reamur = "+ jamal+" Kelvin");

            // Memasukan data ke dalam array jika null
            for (int i = 0; i < histori.length; i++) {
                if (histori[i] == null) {
                    histori[i] = suhu + " Reamur = "+ jamal+" Kelvin";
                    break;
                }
            }
        }else {
            System.out.println("Pilihan tidak ditemukan");
        }
    }
}