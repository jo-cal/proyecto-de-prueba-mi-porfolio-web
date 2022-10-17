
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.Banner;
import com.porfolioweb.porfolio.repository.BannerRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BannerService  implements iBannerService  {
    
@Autowired
public BannerRepo bannerRepo;
@Override
public List<Banner> getBanner() { List<Banner> listaBanner  = bannerRepo.findAll();return listaBanner ;}
@Override
public void saveBanner (Banner banner ) {bannerRepo.save(banner);}     
@Override
public void deleteBanner  (Long id) {bannerRepo.deleteById(id);}
@Override
public Banner findBanner (Long id) {Banner banner  = bannerRepo.findById(id).orElse(null);return banner ; }
@Override 
public Banner  buscarBanners(Long id) {return bannerRepo.findById(id). orElse(null);}

    
}
