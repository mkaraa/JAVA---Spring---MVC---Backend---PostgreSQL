package clubs.com.example.clubs.Service;

import clubs.com.example.clubs.Entity.Users;
import clubs.com.example.clubs.Repository.UniversityRepository;
import clubs.com.example.clubs.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class UserService implements IBaseService<Users> {

    @Autowired
    @Qualifier("userRepository")
    private UsersRepository usersRepository;

    @Autowired
    private UniversityRepository universityRepository;

    @Override
    public List<Users> getAll() {
        List<Users> all = usersRepository.findAll();
        if(all != null) {
            all.stream().forEach(users -> {
                users.setUniversityId(universityRepository.findById(users.getId()).get().getName());
            });
        }
        return all;
    }

    @Override
    public void save(Users users) {
        usersRepository.save(users);
    }

    @Override
    public void update(Users users) {
        usersRepository.save(users);
    }

    @Override
    public void delete(List<Users> t) {
        usersRepository.delete((Users) t);
    }
}
