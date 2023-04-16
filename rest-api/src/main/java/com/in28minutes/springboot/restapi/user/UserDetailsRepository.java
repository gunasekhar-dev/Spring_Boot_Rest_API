package com.in28minutes.springboot.restapi.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {

}
