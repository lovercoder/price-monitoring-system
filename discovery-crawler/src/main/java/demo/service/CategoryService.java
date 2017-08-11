package demo.service;

import demo.domain.Category;

import java.util.List;

/**
 * Created by jiaxu on 8/4/17.
 */
public interface CategoryService {

    void saveCategory(Category category);

    List<Category> getAllCategories();
}
