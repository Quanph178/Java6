package poly.shoptoy.Service;

import poly.shoptoy.Entity.CategoriesEntity;

import java.util.List;
import java.util.Optional;

public interface CategoriesService {
    List<CategoriesEntity> getListCategories();
    CategoriesEntity createCategory(CategoriesEntity categories);
    Optional<CategoriesEntity> getCategoriesById(Integer id);
    CategoriesEntity updateCategory(CategoriesEntity categories, Integer id);
    CategoriesEntity deleteCategory(Integer id);
}
