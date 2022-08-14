public class KySu extends CanBo{
    private String nganhDaoTao;
    

    public KySu(String id, String hoTen, int namSinh, String diaChi, String nganhDaoTao) {
        super(id, hoTen, namSinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
    public String getNganhDaoTao() {
        return nganhDaoTao;
    }
    
}
