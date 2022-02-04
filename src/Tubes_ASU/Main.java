package Tubes_ASU;

import Tubes_ASU.interfaces.TemperatureInterface;
import Tubes_ASU.service.TemperatureService;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        // exception handler
        try {

            // Instanciate object
            TemperatureInterface temperatureInterface = new TemperatureService();

            // Perulangan while
            while (true) {
                System.out.println("|=======================================|");
                System.out.println("|\t\t\t Konversi Suhu \t\t\t\t|");
                System.out.println("|=======================================|");
                System.out.println("[1] Konversi dari Celcius ke Farenheit");
                System.out.println("[2] Konversi dari Celcius ke Reamur");
                System.out.println("[3] Konversi dari Celcius ke Kelvin");
                System.out.println("[4] Konversi dari Farenheit ke Celcius");
                System.out.println("[5] Konversi dari Farenheit ke Reamur");
                System.out.println("[6] Konversi dari Farenheit ke Kelvin");
                System.out.println("[7] Konversi dari Kelvin ke Celcius");
                System.out.println("[8] Konversi dari Kelvin ke Farenheit");
                System.out.println("[9] Konversi dari Kelvin ke Reamur");
                System.out.println("[10] Konversi dari Reamur ke Celcius");
                System.out.println("[11] Konversi dari Reamur ke Farenheit");
                System.out.println("[12] Konversi dari Reamur ke Kelvin");
                System.out.println("[13] Histori Konversi");
                System.out.println("[14] Keluar");

                // Inputan Pilihan Menu
                int pilih = temperatureInterface.input("Masukan Pilihan Anda");

                // Percabangan untuk pilihan konversi
                if (pilih == 1) {

                    // Mengubah data field pilih menjadi 1
                    temperatureInterface.setPilih(1);

                    // Exception handler
                    try {

                        // Inputan suhu
                        int input = temperatureInterface.input("Masukan Suhu Dalam Celcius");

                        // Mengubah data field suhu dengan nilai yang diinputkan sebelumnya
                        temperatureInterface.setSuhu(input);
                        System.out.println("\n==== HASIL KONVERSI SUHU ===");

                        // Pemanggilan method konversi suhu
                        temperatureInterface.hitungSuhu();
                        System.out.println();

                        // Throw exception handler untuk inputan yang salah
                    } catch (InputMismatchException e) {

                        // Output jika inputan salah
                        throw new InputMismatchException("Coba lagi. (Input valid: Sebuah integer diperlukan");
                    }
                } else if (pilih == 2) {

                    // Mengubah data field pilih menjadi 2
                    temperatureInterface.setPilih(2);

                    // Exception handler
                    try {

                        // Inputan suhu
                        int input = temperatureInterface.input("Masukan Suhu Dalam Celcius");

                        // Mengubah data field suhu dengan nilai yang diinputkan sebelumnya
                        temperatureInterface.setSuhu(input);
                        System.out.println("\n==== HASIL KONVERSI SUHU ===");

                        // Pemanggilan method konversi suhu
                        temperatureInterface.hitungSuhu();
                        System.out.println();

                        // Throw exception handler untuk inputan yang salah
                    } catch (InputMismatchException e) {

                        // Output jika inputan salah
                        throw new InputMismatchException("Coba lagi. (Input valid: Sebuah integer diperlukan");
                    }
                } else if (pilih == 3) {

                    // Mengubah data field pilih menjadi 3
                    temperatureInterface.setPilih(3);

                    // Exception handler
                    try {

                        // Inputan suhu
                        int input = temperatureInterface.input("Masukan Suhu Dalam Celcius");

                        // Mengubah data field suhu dengan nilai yang diinputkan sebelumnya
                        temperatureInterface.setSuhu(input);
                        System.out.println("\n==== HASIL KONVERSI SUHU ===");

                        // Pemanggilan method konversi suhu
                        temperatureInterface.hitungSuhu();
                        System.out.println();

                        // Throw exception handler untuk inputan yang salah
                    } catch (InputMismatchException e) {

                        // Output jika inputan salah
                        throw new InputMismatchException("Coba lagi. (Input valid: Sebuah integer diperlukan");
                    }
                } else if (pilih == 4) {

                    // Mengubah data field pilih menjadi 4
                    temperatureInterface.setPilih(4);

                    // Exception handler
                    try {

                        // Inputan suhu
                        int input = temperatureInterface.input("Masukan Suhu Dalam Farenheit");

                        // Mengubah data field suhu dengan nilai yang diinputkan sebelumnya
                        temperatureInterface.setSuhu(input);
                        System.out.println("\n==== HASIL KONVERSI SUHU ===");

                        // Pemanggilan method konversi suhu
                        temperatureInterface.hitungSuhu();
                        System.out.println();

                        // Throw exception handler untuk inputan yang salah
                    } catch (InputMismatchException e) {

                        // Output jika inputan salah
                        throw new InputMismatchException("Coba lagi. (Input valid: Sebuah integer diperlukan");
                    }
                } else if (pilih == 5) {

                    // Mengubah data field pilih menjadi 5
                    temperatureInterface.setPilih(5);

                    // Exception handler
                    try {

                        // Inputan suhu
                        int input = temperatureInterface.input("Masukan Suhu Dalam Farenheit");

                        // Mengubah data field suhu dengan nilai yang diinputkan sebelumnya
                        temperatureInterface.setSuhu(input);
                        System.out.println("\n==== HASIL KONVERSI SUHU ===");

                        // Pemanggilan method konversi suhu
                        temperatureInterface.hitungSuhu();
                        System.out.println();

                        // Throw exception handler untuk inputan yang salah
                    } catch (InputMismatchException e) {

                        // Output jika inputan salah
                        throw new InputMismatchException("Coba lagi. (Input valid: Sebuah integer diperlukan");
                    }
                } else if (pilih == 6) {

                    // Mengubah data field pilih menjadi 6
                    temperatureInterface.setPilih(6);

                    // Exception handler
                    try {

                        // Inputan suhu
                        int input = temperatureInterface.input("Masukan Suhu Dalam Farenheit");

                        // Mengubah data field suhu dengan nilai yang diinputkan sebelumnya
                        temperatureInterface.setSuhu(input);
                        System.out.println("\n==== HASIL KONVERSI SUHU ===");

                        // Pemanggilan method konversi suhu
                        temperatureInterface.hitungSuhu();
                        System.out.println();

                        // Throw exception handler untuk inputan yang salah
                    } catch (InputMismatchException e) {
                        throw new InputMismatchException("Coba lagi. (Input valid: Sebuah integer diperlukan");
                    }
                } else if (pilih == 7) {
                    temperatureInterface.setPilih(7);
                    try {
                        int input = temperatureInterface.input("Masukan Suhu Dalam Kelvin");
                        temperatureInterface.setSuhu(input);
                        System.out.println("\n==== HASIL KONVERSI SUHU ===");
                        temperatureInterface.hitungSuhu();
                        System.out.println();
                    } catch (InputMismatchException e) {

                        // Output jika inputan salah
                        throw new InputMismatchException("Coba lagi. (Input valid: Sebuah integer diperlukan");
                    }
                } else if (pilih == 8) {

                    // Mengubah data field pilih menjadi 8
                    temperatureInterface.setPilih(8);

                    // Exception handler
                    try {

                        // Inputan suhu
                        int input = temperatureInterface.input("Masukan Suhu Dalam Kelvin");

                        // Mengubah data field suhu dengan nilai yang diinputkan sebelumnya
                        temperatureInterface.setSuhu(input);
                        System.out.println("\n==== HASIL KONVERSI SUHU ===");

                        // Pemanggilan method konversi suhu
                        temperatureInterface.hitungSuhu();
                        System.out.println();
                    } catch (InputMismatchException e) {
                        throw new InputMismatchException("Coba lagi. (Input valid: Sebuah integer diperlukan");
                    }
                } else if (pilih == 9) {
                    temperatureInterface.setPilih(9);
                    try {
                        int input = temperatureInterface.input("Masukan Suhu Dalam Kelvin");
                        temperatureInterface.setSuhu(input);
                        System.out.println("\n==== HASIL KONVERSI SUHU ===");
                        temperatureInterface.hitungSuhu();
                        System.out.println();

                        // Throw exception handler untuk inputan yang salah
                    } catch (InputMismatchException e) {

                        // Output jika inputan salah
                        throw new InputMismatchException("Coba lagi. (Input valid: Sebuah integer diperlukan");
                    }
                } else if (pilih == 10) {

                    // Mengubah data field pilih menjadi 10
                    temperatureInterface.setPilih(10);

                    // Exception handler
                    try {

                        // Inputan suhu
                        int input = temperatureInterface.input("Masukan Suhu Dalam Reamur");

                        // Mengubah data field suhu dengan nilai yang diinputkan sebelumnya
                        temperatureInterface.setSuhu(input);
                        System.out.println("\n==== HASIL KONVERSI SUHU ===");

                        // Pemanggilan method konversi suhu
                        temperatureInterface.hitungSuhu();
                        System.out.println();

                        // Throw exception handler untuk inputan yang salah
                    } catch (InputMismatchException e) {

                        // Output jika inputan salah
                        throw new InputMismatchException("Coba lagi. (Input valid: Sebuah integer diperlukan");
                    }
                } else if (pilih == 11) {

                    // Mengubah data field pilih menjadi 12
                    temperatureInterface.setPilih(11);

                    // Exception handler
                    try {

                        // Inputan suhu
                        int input = temperatureInterface.input("Masukan Suhu Dalam Reamur");

                        // Mengubah data field suhu dengan nilai yang diinputkan sebelumnya
                        temperatureInterface.setSuhu(input);
                        System.out.println("\n==== HASIL KONVERSI SUHU ===");

                        // Pemanggilan method konversi suhu
                        temperatureInterface.hitungSuhu();
                        System.out.println();

                        // Throw exception handler untuk inputan yang salah
                    } catch (InputMismatchException e) {

                        // Output jika inputan salah
                        throw new InputMismatchException("Coba lagi. (Input valid: Sebuah integer diperlukan");
                    }
                } else if (pilih == 12) {

                    // Mengubah data field pilih menjadi 12
                    temperatureInterface.setPilih(12);

                    // Exception handler
                    try {

                        // Inputan suhu
                        int input = temperatureInterface.input("Masukan Suhu Dalam Reamur");

                        // Mengubah data field suhu dengan nilai yang diinputkan sebelumnya
                        temperatureInterface.setSuhu(input);
                        System.out.println("\n==== HASIL KONVERSI SUHU ===");

                        // Pemanggilan method konversi suhu
                        temperatureInterface.hitungSuhu();
                        System.out.println();

                        // Throw exception handler untuk inputan yang salah
                    } catch (InputMismatchException e) {

                        // Output jika inputan salah
                        throw new InputMismatchException("Coba lagi. (Input valid: Sebuah integer diperlukan");
                    }
                } else if (pilih == 13) {
                    System.out.println("\n==== HISTORI KONVERSI SUHU ===");

                    // Memanggil method histori konversi suhu
                    temperatureInterface.printArray();
                    System.out.println();
                } else if (pilih == 14) {
                    System.out.println("Anda memilih keluar program");

                    // Memberhentikan program
                    break;
                } else {

                    // Output jika inputan tidak ada yang benar
                    System.out.println("Pilihan tidak dimengerti");
                }
            }

            // Throw exception handler untuk inputan yang salah
        } catch (InputMismatchException e) {

            // Output jika inputan salah
            throw new InputMismatchException("Coba lagi. (Input valid: Sebuah integer diperlukan");
        }
    }
}
