package com.liema.game.pack.mongo;

import com.liema.game.pack.entity.ActorBag;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class ActorBagDao {

    @Resource
    @Qualifier("gameMongoTemplate")
    private MongoTemplate gameMongoTemplate;

    public void updateActorBag(ActorBag pack){}


    public void insertActorBag(ActorBag card){

    }

    public ActorBag getSpecificBackpack(Long rid){ return null;}

}
