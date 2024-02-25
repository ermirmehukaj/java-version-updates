package cydeo1.review;



public class RoleStatic {

    public static final RoleStatic ADMIN =new RoleStatic("Admin");
    public static final RoleStatic MENAGER =new RoleStatic("Menager");
    public static final RoleStatic EMPLOYE =new RoleStatic("Employe");

    public String value;
    private RoleStatic(String value) {
this.value = value;
    }
}
