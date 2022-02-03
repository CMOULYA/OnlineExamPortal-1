package com.capg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.Model.Test;

public interface TestDAO extends JpaRepository<Test,Long> {

}
