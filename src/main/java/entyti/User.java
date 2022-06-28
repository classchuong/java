package entyti;


public class User {
   private  int id ;
   private  String fullName ;
   private  String email ;
   private  String password ;

   private  String role ;
    private    int     ProjectId  ;
   private  int ExpInYear ;
   private  String ProSkill ;

    public User(int id, String fullName, String email, String password, Role role, int projectId,String ProSkill) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;

        this.role = String.valueOf(role);
        ProjectId = projectId;
        this.ProSkill = ProSkill ;
    }

    public User() {

    }

    public User(int id, String fullName, String email, String password, Role role, int projectId, int expInYear) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;

        this.role = String.valueOf(role);
        ProjectId = projectId;
    this.ExpInYear = expInYear ;
    }

    @Override
    public  String  toString() {
        System.out.println( "User :" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", ProjectId=" + ProjectId +
                ", role=" + role ) ;
        if (role == "Manager"){
            System.out.println( "  ExpInYear = " + ExpInYear );


    }else if (role == "Employee"){
            System.out.println("ProSkill = " +  ProSkill
            ) ;
        }


        return "Welcome User : " + fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public int getProjectId() {
        return ProjectId;
    }

    public void setProjectId(int projectId) {
        ProjectId = projectId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }
}
