package net.moopa.cc.common.dao.role;

import net.moopa.guard.model.role.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Moopa on 06/06/2017.
 * blog: moopa.net
 *
 * @autuor : Moopa
 */
@Repository
public interface RoleDao {
    public Role getRoleByRolename(String rolename);

    public Role getRoleByRoleId(int role_id);


    public List<Role> getRoles();
}
