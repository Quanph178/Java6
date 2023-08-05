package poly.shoptoy.Service.Impl;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poly.shoptoy.Entity.CategoriesEntity;
import poly.shoptoy.Repository.CategoriesRepository;
import poly.shoptoy.Service.CategoriesService;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesServiceImp implements CategoriesService {
    @Autowired
    CategoriesRepository categoriesRepository;

    @Override
    public List<CategoriesEntity> getListCategories() {
        return categoriesRepository.findAll();

    }

    @Override
    public CategoriesEntity createCategory(CategoriesEntity categories) {
        return categoriesRepository.save(categories);
    }

    @Override
    public Optional<CategoriesEntity> getCategoriesById(Integer id) {
        return categoriesRepository.findById(id);
    }
    @Override
    public CategoriesEntity updateCategory(CategoriesEntity categories, Integer id){
        Optional<CategoriesEntity> categoriesEntity = categoriesRepository.findById(id);
        if(categoriesEntity.isPresent()){
            BeanUtils.copyProperties(categoriesEntity,categories);
            return categoriesRepository.save(categories);
        }
        return null;
    }
    @Override
    public CategoriesEntity deleteCategory(Integer id){
        Optional<CategoriesEntity> categoriesEntity = categoriesRepository.findById(id);
        if (categoriesEntity.isPresent()){
            categoriesRepository.deleteById(id);
        }
        return null;
    }
}
