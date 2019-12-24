package login.mapper;

import login.entity.User;

/**
 * @author peng.liu
 * @data 2019/12/10 9:55
 */
public interface LoginMapper {

    int check(User user);

    int get(User user);
}
