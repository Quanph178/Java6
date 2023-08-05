package poly.shoptoy.Service;


import poly.shoptoy.Dto.UserDto;
import poly.shoptoy.Entity.UsersEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDto> getListUser();

    List<UsersEntity> getListUserDetail();

    UserDto getUserByUsername(String username);

    Optional<UsersEntity> getUsernameDetailByUsername(String username);

    UsersEntity createNewUser(UsersEntity users);

    UsersEntity updateUser(UsersEntity usersEntity, String username);

    UsersEntity deleteUser(String username);

}
