
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.Banner;
import java.util.List;


public interface iBannerService {
    
public List<Banner> getBanner();

public void saveBanner(Banner banner  );

public void deleteBanner(Long id);

public Banner buscarBanners (Long id);

public Banner findBanner (Long id);

    
}
