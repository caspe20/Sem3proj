package com.example.Sem3proj.business.machine;

import com.sun.tools.javac.util.List;
import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfig;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfigBuilder;
import org.eclipse.milo.opcua.stack.client.DiscoveryClient;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;
import org.eclipse.milo.opcua.stack.core.util.EndpointUtil;

import java.util.ArrayList;

public class Machine {

    private int currentState;
    private float curMachSpeed;
    private Batch curBatch;

    // TODO update optimal speed of productType variables.
    private final ArrayList<ProductType> productTypes = new ArrayList<>(List.of(
            new ProductType(0, "Pilsner", 0.0d),
            new ProductType(1, "Wheat", 0.0d),
            new ProductType(2, "IPA", 0.0d),
            new ProductType(3, "Stout", 0.0d),
            new ProductType(4, "Ale", 0.0d),
            new ProductType(5, "Alcohol Free", 0.0d)
    ));

    // TODO constructor for this class - refrained 'cause maybe we need connection variables in constructor and need to discuss?

    // TODO test if PLC connection is working
    private final String port = "4840";
    private final String hostname = "127.0.0.1";
    public OpcUaClient connectToMachine(){
        // TODO This is copied from "PLCConnection" class. Maybe the class has become obsolete.
        try {

            java.util.List<EndpointDescription> endpoints = DiscoveryClient.getEndpoints("opc.tcp://" + hostname + ":" + port).get();
            EndpointDescription configPoint = EndpointUtil.updateUrl(endpoints.get(0), hostname, Integer.parseInt(port));

            OpcUaClientConfigBuilder cfg = new OpcUaClientConfigBuilder();
            cfg.setEndpoint(configPoint);

            OpcUaClient client = OpcUaClient.create(cfg.build());
            return client;
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private void writeBatchToProduction(){
    }

    // -------------------------------------------- [ Getter / Setter ] -------------------------------------------- //

    // ------- [ Getters only ] ------ //

    public int getCurrentState() {
        return currentState;
    }

    public float getCurMachSpeed() {
        return curMachSpeed;
    }

    public Batch getCurBatch() {
        return curBatch;
    }
}
