package clubs.com.example.clubs.Service;

import clubs.com.example.clubs.Entity.Club;
import clubs.com.example.clubs.Repository.ClubRepository;
import clubs.com.example.clubs.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class ClubService implements IBaseService<Club> {

    @Autowired
    @Qualifier("clubRepository")
    private ClubRepository clubRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Club> getAll() {
        List<Club> all = clubRepository.findAll();
        if( all != null){
            all.stream().forEach(club -> {
                club.setManagerName(usersRepository.findById(club.getManagerId()).get().getName());
            });
        }
        return all;
    }

    @Override
    public void save(Club club) {
        clubRepository.save(club);
    }

    @Override
    public void update(Club club) {

        clubRepository.save(club);
    }

    @Override
    public void delete(List<Club> t) {

        clubRepository.delete((Club) t);
    }


}
