package poly.shoptoy.Service.Impl;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poly.shoptoy.Dto.UserDto;
import poly.shoptoy.Entity.UsersEntity;
import poly.shoptoy.Repository.UserRepository;
import poly.shoptoy.Service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<UserDto> getListUser() {
        List<UsersEntity> listUsers = userRepository.findAll();
        List<UserDto> listUserDto = new ArrayList<UserDto>();
        for (UsersEntity user : listUsers) {
            UserDto dto = new UserDto();
            BeanUtils.copyProperties(user, dto);
            listUserDto.add(dto);
        }
        return listUserDto;
    }

    @Override
    public List<UsersEntity> getListUserDetail() {
        return userRepository.findAll();
    }

    @Override
    public UserDto getUserByUsername(String username) {
        Optional<UsersEntity> userEntity = userRepository.findById(username);
        if (userEntity.isPresent()) {
            UserDto dto = new UserDto(userEntity.get().getUsername(), userEntity.get().getFullname(), userEntity.get().getEmail(), userEntity.get().isStatus(),userEntity.get().getImgUse());
            return dto;
        } else {
            return null;
        }
    }

    @Override
    public Optional<UsersEntity> getUsernameDetailByUsername(String username) {
        Optional<UsersEntity> userEntity = userRepository.findById(username);
        if (userEntity.isPresent()) {
            return userEntity;
        } else {
            return null;
        }
    }

    @Override
    public UsersEntity createNewUser(UsersEntity users) {
        return userRepository.save(users);
    }

    @Override
    public UsersEntity updateUser(UsersEntity usersEntity, String username) {
        Optional<UsersEntity> userUpdate = userRepository.findById(username);
        if (userUpdate.isPresent()) {
            BeanUtils.copyProperties(userUpdate, usersEntity);
            return userRepository.save(usersEntity);
        }
        return null;
    }

    @Override
    public UsersEntity deleteUser(String username) {
        Optional<UsersEntity> users = userRepository.findById(username);
        if (users.isPresent()) {
            userRepository.deleteById(username);
        }
        return null;
    }

}
