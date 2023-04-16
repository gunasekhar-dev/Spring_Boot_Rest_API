package com.in28minutes.springboot.restapi.user;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDetailsRestRepository extends PagingAndSortingRepository<UserDetails,Long> {

}
