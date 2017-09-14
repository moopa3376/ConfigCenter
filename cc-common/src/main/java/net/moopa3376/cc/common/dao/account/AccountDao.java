package net.moopa3376.cc.common.dao.account;


import net.moopa3376.guard.model.account.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Moopa on 03/05/2017.
 * blog: moopa.net
 *
 * @autuor : Moopa
 */
@Repository
public interface AccountDao {
    public int insertNewAccount(Account account);

    public Account getAccountByLoginname(String loginname);

    public Account getAccountByAccountId(int account_id);

    public int updatePassword(@Param("account_id") int account_id, @Param("newpass") String newpass);

    public int deleteExistAccount(String loginname);

    public int updateLoginTime(Account account);

    public Account getAccountByWeChatId(String open_id);
}
