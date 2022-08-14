public class CongNhan extends CanBo {

    private String capBac;
 
    public CongNhan() {

    }

    public CongNhan(String id, String hoTen, int namSinh, String diaChi, String capBac) {
        super(id, hoTen, namSinh, diaChi);
        this.capBac = capBac;
    }


    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }
        
}
