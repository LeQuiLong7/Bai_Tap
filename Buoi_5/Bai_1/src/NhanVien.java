public class NhanVien extends CanBo {

    private String congViec;

    public NhanVien() {

    }

    public NhanVien(String id, String hoTen, int namSinh, String diaChi, String congViec) {
        super(id, hoTen, namSinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    
}
