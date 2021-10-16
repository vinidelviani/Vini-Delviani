package com.example.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Data {
    private @Id @GeneratedValue Long id;
    private Long nip;
    private String nama;
    private String alamat;
    private String jabatan;
    private String pot_pajak;
    private Long gaji;

    Data() {
    }

    Data(Long nip, String nama, String alamat, String jabatan, String pot_pajak, Long gaji) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.jabatan = jabatan;
        this.pot_pajak = pot_pajak;
        this.gaji = gaji;
    }

    public Long getId() {
        return this.id;
    }

    public Long getNip() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public String getJabatan() {
        return this.jabatan;
    }

    public String getPot_pajak() {
        return this.pot_pajak;
    }

    public Long getGaji() {
        return this.gaji;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNip(Long nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setPot_pajak(String pot_pajak) {
        this.pot_pajak = pot_pajak;
    }

    public void setGaji(Long gaji) {
        this.gaji = gaji;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Data))
            return false;
        Data data = (Data) o;
        return Objects.equals(this.id, data.id) && Objects.equals(this.nip, data.nip)
                && Objects.equals(this.nama, data.nama) && Objects.equals(this.alamat, data.alamat)
                && Objects.equals(this.jabatan, data.jabatan) && Objects.equals(this.pot_pajak, data.pot_pajak)
                && Objects.equals(this.gaji, data.gaji);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.nip, this.nama, this.alamat, this.jabatan, this.pot_pajak, this.gaji);
    }

    @Override
    public String toString() {
        return "Data pegawai{" + "id=" + this.id + ", NIP='" + this.nip + '\'' + ", nama='" + this.nama + '\''
                + ", alamat='" + this.alamat + '\'' + ", jabatan='" + this.jabatan + '\'' + ", pot_pajak='"
                + this.pot_pajak + '\'' + ", gaji='" + this.gaji + '\'' +  '}';
    }

}
