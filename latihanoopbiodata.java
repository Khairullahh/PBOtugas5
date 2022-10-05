package test;

public class latihanoopbiodata {
    private String nim;
    private String nama;
    private int umur;
    private String Gender;
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getGender() {
        String Gender = "gapunya kelamin";
        if (this.Gender == "p") {
            Gender = "pria";
        }
        return  Gender;
    }
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public static void main(String[] args) {
        latihanoopbiodata mahasiswa = new latihanoopbiodata();
        mahasiswa.setNim("2021071009");
        mahasiswa.setNama("Kay");
        mahasiswa.setUmur(19);
        mahasiswa.setGender("p");

        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Umur: " + mahasiswa.getUmur());
        System.out.println("jeniskelamin: " + mahasiswa.getGender());
    }

}
