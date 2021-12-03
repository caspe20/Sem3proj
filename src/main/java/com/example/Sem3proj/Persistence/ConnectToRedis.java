package com.example.Sem3proj.Persistence;

import com.example.Sem3proj.business.machine.Batch;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class ConnectToRedis {

    // Redis connection and password variables
    String redisHost = "redis-18471.c282.east-us-mz.azure.cloud.redislabs.com";
    int redisPort = 18471;
    String redisPassword = "lYFlHa9TsYX2OOlpcsLWcJVrjW0OMXy0";
    // Generic variables
    private final JedisPool jedisPool;
    public Batch batch;

    // ------------------------------------------- [ singleton pattern ] ------------------------------------------- //
    private static ConnectToRedis INSTANCE;


    public static ConnectToRedis getInstance(){
        if (INSTANCE == null){
            INSTANCE = new ConnectToRedis();
        }
        return INSTANCE;
    }

    private ConnectToRedis(){
        // TODO connection variables and execution in here
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        jedisPool = new JedisPool(poolConfig, redisHost, redisPort, 1000, redisPassword);
    }
    // --------------------------------------- [ Functionality & variables ] --------------------------------------- //

    public Jedis getConnection() {
        return jedisPool.getResource();
    }

    public void closeJedisPool() {
        jedisPool.close();
    }

    public static void main(String[] args) {
        getInstance().getConnection().flushDB();
        getInstance().getConnection().hset("batch1", "temperature", "23");
        getInstance().getConnection().hset("batch1", "humidity", "70");
    }

    public void sendBatchData(Batch batch){
        //TODO Send batch to database using prepared statements (for injection defense)
    }

}