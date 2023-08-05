package poly.shoptoy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poly.shoptoy.Entity.CategoriesEntity;
import poly.shoptoy.Service.CategoriesService;
import javax.servlet.annotation.WebListener;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/categories")
public class CategoriesController {
    @Autowired
    CategoriesService categoriesService;

    @GetMapping
    public ResponseEntity<List<CategoriesEntity>> getListCategories(){
        return ResponseEntity.ok(categoriesService.getListCategories());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<CategoriesEntity>> getCategoriesById(@PathVariable Integer id){
        return ResponseEntity.ok(categoriesService.getCategoriesById(id));
    }
    @PostMapping
    public ResponseEntity<CategoriesEntity> creatCategory(@RequestBody CategoriesEntity categoriesEntity){
        return ResponseEntity.ok(categoriesService.createCategory(categoriesEntity));
    }
    @PutMapping("/{id}")
    public ResponseEntity<CategoriesEntity> updateCategories(@RequestBody CategoriesEntity categoriesEntity,@PathVariable Integer id){
        return ResponseEntity.ok(categoriesService.updateCategory(categoriesEntity,id));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<CategoriesEntity> deleteCategory(@PathVariable Integer id){
        return ResponseEntity.ok(categoriesService.deleteCategory(id));
    }

}
