import pengguna.Mhs;

class Main {
    public static void main(String[] args) {
//TAMBAH KOMENTAR
Mhs mhs = new mhs(username:"iniusername",password:"ini_password");

mhs.setNama(nama:"Nurdin Kurniawan");
mhs.setNim(nim:"G.111.19.0026");
mhs.setSemester(smt:8);

System.out.println("Nama Mhs: " + mhs.getNama());
System.out.println("Nim Mhs: " + mhs.getNim());
System.out.println("Smt Mhs: " + mhs.getSemester());
System.out.println("Username: " + mhs.getUsername());
System.out.println("Password: " + mhs.getPassword());
    }
}