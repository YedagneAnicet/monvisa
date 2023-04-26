package com.eburtis.monvisa.Service;

import com.eburtis.monvisa.Application.UserVo;
import com.eburtis.monvisa.Domain.User;
import com.eburtis.monvisa.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserVo create(UserVo userVo){
        User user = new User(null,userVo.getNom(),userVo.getPrenom(),userVo.getEmail(),userVo.getMdp());
        User saveUser = userRepository.save(user);
        return new UserVo(saveUser);
    }
}
