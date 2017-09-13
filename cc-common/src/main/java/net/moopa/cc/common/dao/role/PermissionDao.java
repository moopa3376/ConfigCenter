package net.moopa.cc.common.dao.role;

import net.moopa.guard.model.permission.Permission;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Moopa on 20/07/2017.
 * blog: moopa.net
 *
 * @autuor : Moopa
 */
@Repository
public interface PermissionDao {

    public List<Permission> getPermissions();
}
