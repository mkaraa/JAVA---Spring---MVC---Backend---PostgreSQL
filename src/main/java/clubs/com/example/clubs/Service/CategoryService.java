package clubs.com.example.clubs.Service;

import clubs.com.example.clubs.Entity.Category;
import clubs.com.example.clubs.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class CategoryService implements IBaseService<Category>{

    @Autowired
    @Qualifier("categoryRepository")
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        List<Category> all = categoryRepository.findAll();
        return all;
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void update(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void delete(List<Category> t) {
        categoryRepository.delete((Category) t);
    }
}
