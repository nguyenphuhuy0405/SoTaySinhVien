import java.io.Serializable;
import java.util.Objects;
/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phạm Trí Đức
 */
public class HoSo implements Serializable{
    String hoten,gioitinh,ngaysinh,diachi,lop,khoa,nganh,email,baoluu,ghichu;
    int sdt,diemrenluyen;
    public HoSo(){}

    public HoSo(String hoten, String gioitinh, String ngaysinh, String diachi, String lop, String khoa, String nganh, String email, String baoluu, String ghichu, int sdt, int diemrenluyen) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.lop = lop;
        this.khoa = khoa;
        this.nganh = nganh;
        this.email = email;
        this.baoluu = baoluu;
        this.ghichu = ghichu;
        this.sdt = sdt;
        this.diemrenluyen = diemrenluyen;
    }

    public String getHoten() {
        return hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getLop() {
        return lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public String getNganh() {
        return nganh;
    }

    public String getEmail() {
        return email;
    }

    public String getBaoluu() {
        return baoluu;
    }

    public String getGhichu() {
        return ghichu;
    }

    public int getSdt() {
        return sdt;
    }

    public int getDiemrenluyen() {
        return diemrenluyen;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBaoluu(String baoluu) {
        this.baoluu = baoluu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public void setDiemrenluyen(int diemrenluyen) {
        this.diemrenluyen = diemrenluyen;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.hoten);
        hash = 97 * hash + Objects.hashCode(this.gioitinh);
        hash = 97 * hash + Objects.hashCode(this.ngaysinh);
        hash = 97 * hash + Objects.hashCode(this.diachi);
        hash = 97 * hash + Objects.hashCode(this.lop);
        hash = 97 * hash + Objects.hashCode(this.khoa);
        hash = 97 * hash + Objects.hashCode(this.nganh);
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + Objects.hashCode(this.baoluu);
        hash = 97 * hash + Objects.hashCode(this.ghichu);
        hash = 97 * hash + this.sdt;
        hash = 97 * hash + this.diemrenluyen;
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
        if (this.sdt != other.sdt) {
            return false;
        }
        if (this.diemrenluyen != other.diemrenluyen) {
            return false;
        }
        if (!Objects.equals(this.hoten, other.hoten)) {
            return false;
        }
        if (!Objects.equals(this.gioitinh, other.gioitinh)) {
            return false;
        }
        if (!Objects.equals(this.ngaysinh, other.ngaysinh)) {
            return false;
        }
        if (!Objects.equals(this.diachi, other.diachi)) {
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
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.baoluu, other.baoluu)) {
            return false;
        }
        return Objects.equals(this.ghichu, other.ghichu);
    }
    
}
