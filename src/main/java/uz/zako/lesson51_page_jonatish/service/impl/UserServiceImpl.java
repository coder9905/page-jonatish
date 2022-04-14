package uz.zako.lesson51_page_jonatish.service.impl;// Author - Orifjon Yunusjonov
// t.me/coderr24

import uz.zako.lesson51_page_jonatish.entity.Address;
import uz.zako.lesson51_page_jonatish.entity.User;
import uz.zako.lesson51_page_jonatish.payload.UserRequest;
import uz.zako.lesson51_page_jonatish.repository.AddressRepository;
import uz.zako.lesson51_page_jonatish.repository.UserRepository;
import uz.zako.lesson51_page_jonatish.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final AddressRepository addressRepository;
    private final UserRepository userRepository;

    public UserServiceImpl(AddressRepository addressRepository, UserRepository userRepository) {
        this.addressRepository = addressRepository;
        this.userRepository = userRepository;
    }

    @Override
    public boolean save(UserRequest userRequest) {
        User users = new User();
        users.setFullName(userRequest.getFullName());
        users.setEmail(userRequest.getEmail());
        users.setPhoneNumber(userRequest.getPhoneNumber());
        Address address = new Address(userRequest.getLocation());
        users.setAddress(addressRepository.save(address));
//        users.setAddress(address);
        return userRepository.save(users) != null;
    }


}
