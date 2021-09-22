package milo;


import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfigBuilder;
import org.eclipse.milo.opcua.stack.client.DiscoveryClient;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;

import java.util.List;


public class Write {

    public static void main(String[] args) {
        try
        {
            List<EndpointDescription> endpoints = DiscoveryClient.getEndpoints("opc.tcp://LAPTOP-SB67LRQR:53530/OPCUA/SimulationServer").get();

            OpcUaClientConfigBuilder cfg = new OpcUaClientConfigBuilder();
            cfg.setEndpoint(endpoints.get(0));

            OpcUaClient client = OpcUaClient.create(cfg.build());
            client.connect().get();

            NodeId nodeId = NodeId.parse("ns=3;i=1008");
            client.writeValue(nodeId, DataValue.valueOnly(new Variant(75))).get();

        }
        catch(Throwable ex)
        {
            ex.printStackTrace();
        }

    }

}
