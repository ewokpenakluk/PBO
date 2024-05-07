package tugas9;

public class main {
    public static void main(String[] args) {
    	dokter pg = new dokter("203040068", "2404576", "SPECIALIST","100.000.000");
        System.out.println(pg.getKodeDokter() + " - " + pg.getIdJabatan() + " - " + pg.getJabatan() + " - " + pg.getGaji());
    }
}