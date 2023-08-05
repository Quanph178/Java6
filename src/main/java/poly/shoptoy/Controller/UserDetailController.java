package poly.shoptoy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poly.shoptoy.Entity.UsersEntity;
import poly.shoptoy.Service.UserService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/userdetail")
public class UserDetailController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public ResponseEntity<List<UsersEntity>> getListUser() {
        return ResponseEntity.ok(userService.getListUserDetail());
    }

    @GetMapping("/{username}")
    public ResponseEntity<Optional<UsersEntity>> getUserByUserName(@PathVariable String username) {
        Optional<UsersEntity> user = userService.getUsernameDetailByUsername(username);
        return ResponseEntity.ok(user);
    }

    @PostMapping("")
    public ResponseEntity<UsersEntity> createNewUser(@RequestBody UsersEntity users) {
        return ResponseEntity.ok(userService.createNewUser(users));
    }

    @PutMapping(value = "/{username}")
    public ResponseEntity<UsersEntity> updateUser(@RequestBody UsersEntity usersEntity, @PathVariable String username) {
        return ResponseEntity.ok(userService.updateUser(usersEntity, username));
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<UsersEntity> deleteUser(@PathVariable String username) {
        return ResponseEntity.ok(userService.deleteUser(username));
    }


}
