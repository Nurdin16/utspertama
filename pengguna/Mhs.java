package pengguna;

 public class Mhs { 
    private String nama;
    private String nim;
    private int semester;

   public Mhs (String username,String password,String nama,String nim,int smt)
    {
        
        this.nama = nama;
        this.nim = nim;
        this.semester = smt;
    }


    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSemester() {
        return this.semester;
    }

}
