package id.co.prg7_assesment_057.vo;

import id.co.prg7_assesment_057.model.Layanan;

public class LayananVo {
    private Integer idLayanan;
    private String namaLayanan;
    private String deskripsiLayanan;
    private Integer hargaLayanan;
    private Integer statusLayanan;

    public LayananVo() {
    }

    public LayananVo(Layanan layanan) {
        this.idLayanan = layanan.getIdLayanan();
        this.namaLayanan = layanan.getNamaLayanan();
        this.deskripsiLayanan = layanan.getDeskripsiLayanan();
        this.hargaLayanan = layanan.getHargaLayanan();
        this.statusLayanan = layanan.getStatusLayanan();
    }

    public Integer getIdLayanan() {
        return idLayanan;
    }

    public void setIdLayanan(Integer idLayanan) {
        this.idLayanan = idLayanan;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }

    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public String getDeskripsiLayanan() {
        return deskripsiLayanan;
    }

    public void setDeskripsiLayanan(String deskripsiLayanan) {
        this.deskripsiLayanan = deskripsiLayanan;
    }

    public Integer getHargaLayanan() {
        return hargaLayanan;
    }

    public void setHargaLayanan(Integer hargaLayanan) {
        this.hargaLayanan = hargaLayanan;
    }

    public Integer getStatusLayanan() {
        return statusLayanan;
    }

    public void setStatusLayanan(Integer statusLayanan) {
        this.statusLayanan = statusLayanan;
    }
}
