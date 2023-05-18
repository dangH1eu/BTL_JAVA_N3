/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author ExorcistV
 */
public class User implements Serializable {
    private String account;
    private String password;
    private String role;
    private String userCode;
    private String userName;
    private String gender;
    private String adrress;
    private int phoneNumber;
    
    public User() {
        
    }

    public User(String account, String password, String role, String userCode, String userName, String gender, String adrress, int phoneNumber) {
        this.account = account;
        this.password = password;
        this.role = role;
        this.userCode = userCode;
        this.userName = userName;
        this.gender = gender;
        this.adrress = adrress;
        this.phoneNumber = phoneNumber;
    }
    
    public User(String userCode) {
        this.userCode = userCode;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.userCode);
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
        return Objects.equals(this.userCode, other.userCode);
    }

     
    
}
