package com.github.pedroaugustoreis.springaop.data;

import com.github.pedroaugustoreis.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {


    @TrackTime
    public String retrieveSomething(){
        return "Dao1";
    }

}
