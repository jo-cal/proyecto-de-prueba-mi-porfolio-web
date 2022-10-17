
package com.porfolioweb.porfolio.repository;

import com.porfolioweb.porfolio.models.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerRepo extends JpaRepository<Banner,Long>  {
    
}
