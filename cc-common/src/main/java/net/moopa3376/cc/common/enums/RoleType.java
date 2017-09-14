package net.moopa3376.cc.common.enums;

/**
 * Created by Moopa on 21/07/2017.
 * blog: moopa.net
 *
 * @autuor : Moopa
 */
public enum RoleType {
    ALL_USER(1,"all_user"),
    NORMAL_USER(2,"normal_user"),
    SHOP_ADMIN(3,"shop_admin"),
    ROOT(4,"root");



    private int role_id;
    private String rolename;


    RoleType(int role_id,String rolename){
        this.role_id = role_id;
        this.rolename = rolename;
    }

    public int getRole_id() {
        return role_id;
    }

    public String getRolename() {
        return rolename;
    }
}
