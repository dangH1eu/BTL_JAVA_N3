/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.util.Objects;
import java.io.Serializable;


/**
 *
 * @author ExorcistV
 */
public class User implements Serializable {
    private String maNV;
    private String hoTen;
    private String soDienThoai;
    private String ngaySinh;
    private String queQuan;
    private String taiKhoan;
    private String matKhau;
    private String chucVu;

    public User(String maNV) {
        this.maNV = maNV;
    }

    public User(String maNV, String hoTen, String soDienThoai, String ngaySinh, String queQuan, String taiKhoan, String matKhau, String chucVu) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.chucVu = chucVu;
    }

    public User() {
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.maNV);
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
        final User other = (User) obj;
        return Objects.equals(this.maNV, other.maNV);
    }

    @Override
    public String toString() {
        return "User{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", soDienThoai=" + soDienThoai + ", ngaySinh=" + ngaySinh + ", queQuan=" + queQuan + ", taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + ", chucVu=" + chucVu + '}';
    }
    
}
