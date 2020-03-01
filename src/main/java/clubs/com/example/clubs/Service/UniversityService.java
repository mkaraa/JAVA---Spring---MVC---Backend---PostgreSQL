package clubs.com.example.clubs.Service;

import clubs.com.example.clubs.Entity.University;
import clubs.com.example.clubs.Repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class UniversityService implements IBaseService<University> {

    @Autowired
    @Qualifier("universityRepository")
    private UniversityRepository universityRepository;

    @Override
    public List<University> getAll() {
        List<University> all = universityRepository.findAll();
        return all;
    }

    @Override
    public void save(University university) {
        universityRepository.save(university);
    }

    @Override
    public void update(University university) {
        universityRepository.save(university);
    }

    @Override
    public void delete(List<University> t) {
        universityRepository.delete((University) t);
    }
}
