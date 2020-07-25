import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class user_registration {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String familyname;
    private String email;
    private String password;
    public String role;
    public user_registration() {
    }
    public user_registration(String name, String familyname, String email, String password) {
        this.name = name;
        this.familyname = familyname;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
