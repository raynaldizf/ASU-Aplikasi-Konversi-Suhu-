package Tubes_ASU.interfaces;

// Inheritance dari interface array
public interface TemperatureInterface extends ArrayInterface{

    // Untuk inputan scanner
    int input(String info);

    // Untuk mengubah data field suhu
    void setSuhu(double suhu);

    // Untuk mengambil data field suhu
    double getSuhu();

    // Untuk mengkonversi suhu dan memasukannya ke dalam array
    void hitungSuhu();

    // Untuk mengubah data field pilih
    void setPilih(int pilih);

    // Untuk mengambil data field pilih
    int getPilih();

}
