package Percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, Kurangi jajan anda");

        }else if (uangDiDompet>totalBelanja){
            double kembali = uangDiDompet - totalBelanja;
            System.out.println("Uang Cukup, angsul:"+kembali);

        }else {
            System.out.println("Uang pas.. UwU..");
        }

    }
}
