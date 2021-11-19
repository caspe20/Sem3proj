package com.example.Sem3proj;

import com.lambdaworks.redis.*;

public class ConnectToRedis {
    // TODO This is copied code from https://docs.redis.com/latest/rs/references/client_references/client_java/

    private static ConnectToRedis INSTANCE;
    private static RedisConnection connection;
    private static RedisClient client;

    private ConnectToRedis() {
        client = new RedisClient(
                RedisURI.create("redis://7yqu5RPq0ue7nzlNOGhmKoWen7jEPhDA@redis-17223.c56.east-us.azure.cloud.redislabs.com:17223"));
        connection = client.connect();

        System.out.println("Connected to redis");
    }

    public void close(){
        connection.close();
        client.shutdown();
        INSTANCE = null;
    }

    public static ConnectToRedis getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConnectToRedis();
        }
        return INSTANCE;
    }

    public void write(String key, String message){
        String[] values = message.split(",");
        for (String value: values) {
            connection.set(key, value);
        }
    }

    public void write(String key,int message){
        //String[] values = message.split(",");

        connection.set(key, Integer.toString(message));
    }

    public String read(String key){
        return connection.get(key);
    }

    public static void main(String[] args) {
        ConnectToRedis inst = ConnectToRedis.getInstance();
        inst.write("users","batch1 {\n'id':'x22'\n}");

        String value = inst.read("users");
        System.out.println(value);

        inst.close();
    }
}