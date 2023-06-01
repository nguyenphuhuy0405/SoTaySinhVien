/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author MyPC
 */
public class HoSo {
    private String hoTen, gioiTinh, diaChi, lop, khoa, nganh, sdt, email, soThich,baoLuu,ghiChu;
    private float diemRenLuyen;
    private LocalDate ngaySinh;

    public HoSo(String hoTen, String gioiTinh, String diaChi, String lop, String khoa, String nganh, String sdt, String email, String soThich, String baoLuu, String ghiChu, float diemRenLuyen, LocalDate ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.lop = lop;
        this.khoa = khoa;
        this.nganh = nganh;
        this.sdt = sdt;
        this.email = email;
        this.soThich = soThich;
        this.baoLuu = baoLuu;
        this.ghiChu = ghiChu;
        this.diemRenLuyen = diemRenLuyen;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public String getBaoLuu() {
        return baoLuu;
    }

    public void setBaoLuu(String baoLuu) {
        this.baoLuu = baoLuu;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public float getDiemRenLuyen() {
        return diemRenLuyen;
    }

    public void setDiemRenLuyen(float diemRenLuyen) {
        this.diemRenLuyen = diemRenLuyen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.hoTen);
        hash = 79 * hash + Objects.hashCode(this.gioiTinh);
        hash = 79 * hash + Objects.hashCode(this.diaChi);
        hash = 79 * hash + Objects.hashCode(this.lop);
        hash = 79 * hash + Objects.hashCode(this.khoa);
        hash = 79 * hash + Objects.hashCode(this.nganh);
        hash = 79 * hash + Objects.hashCode(this.sdt);
        hash = 79 * hash + Objects.hashCode(this.email);
        hash = 79 * hash + Objects.hashCode(this.soThich);
        hash = 79 * hash + Objects.hashCode(this.baoLuu);
        hash = 79 * hash + Objects.hashCode(this.ghiChu);
        hash = 79 * hash + Float.floatToIntBits(this.diemRenLuyen);
        hash = 79 * hash + Objects.hashCode(this.ngaySinh);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HoSo other = (HoSo) obj;
        if (Float.floatToIntBits(this.diemRenLuyen) != Float.floatToIntBits(other.diemRenLuyen)) {
            return false;
        }
        if (!Objects.equals(this.hoTen, other.hoTen)) {
            return false;
        }
        if (!Objects.equals(this.gioiTinh, other.gioiTinh)) {
            return false;
        }
        if (!Objects.equals(this.diaChi, other.diaChi)) {
            return false;
        }
        if (!Objects.equals(this.lop, other.lop)) {
            return false;
        }
        if (!Objects.equals(this.khoa, other.khoa)) {
            return false;
        }
        if (!Objects.equals(this.nganh, other.nganh)) {
            return false;
        }
        if (!Objects.equals(this.sdt, other.sdt)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.soThich, other.soThich)) {
            return false;
        }
        if (!Objects.equals(this.baoLuu, other.baoLuu)) {
            return false;
        }
        if (!Objects.equals(this.ghiChu, other.ghiChu)) {
            return false;
        }
        return Objects.equals(this.ngaySinh, other.ngaySinh);
    }
    
    
    
}
