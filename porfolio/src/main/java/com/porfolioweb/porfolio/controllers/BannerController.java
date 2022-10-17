
package com.porfolioweb.porfolio.controllers;

import com.porfolioweb.porfolio.models.Banner;
import com.porfolioweb.porfolio.service.iBannerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/banner")
@CrossOrigin(origins= "http://localhost:4200")

public class BannerController {
    
    @Autowired
    private iBannerService bannerService;

    @GetMapping("/all")    
    public List<Banner> getBanner() {return bannerService.getBanner();}
    
    @GetMapping("/{id}")
    public ResponseEntity <Banner> addBanner(@PathVariable("id") Long id){Banner banner = bannerService.buscarBanners(id);return new ResponseEntity<>(banner, HttpStatus.OK);}

    @PostMapping("/add") //para añadir    
    public void saveBanner(@RequestBody Banner banner ){bannerService.saveBanner(banner);}

    @DeleteMapping("/delete/{id}") //para borrar
    public ResponseEntity<?> deleteBanner(@PathVariable("id") Long id){bannerService.deleteBanner(id);return new ResponseEntity<>(HttpStatus.OK);}         

    
    @PutMapping("/update/{id}")
    public Banner  updateBanner(@PathVariable long id,@RequestBody Banner bannerDetails) {
    Banner updateBanner = bannerService.findBanner(id);
    updateBanner.setImagenBa(bannerDetails.getImagenBa());
    bannerService.saveBanner(updateBanner);return updateBanner;}



}
