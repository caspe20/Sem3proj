package milo;

import java.util.List;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfigBuilder;
import org.eclipse.milo.opcua.stack.client.DiscoveryClient;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;
import org.eclipse.milo.opcua.stack.core.util.EndpointUtil;
import org.slf4j.Logger;


public class Read {

    public static void main(String[] args) {
        try
        {
            List<EndpointDescription> endpoints = DiscoveryClient.getEndpoints("opc.tcp://192.168.0.122:4840").get();
            EndpointDescription configPoint = EndpointUtil.updateUrl(endpoints.get(0),"192.168.0.122",4840);

            OpcUaClientConfigBuilder cfg = new OpcUaClientConfigBuilder();
            cfg.setEndpoint(configPoint);

            OpcUaClient client = OpcUaClient.create(cfg.build());
            client.connect().get();

            NodeId nodeId = NodeId.parse("ns=6;s=::Program:Cube.Status.Parameter[4].Value");

            DataValue dataValue = client.readValue(0, TimestampsToReturn.Both, nodeId).get();
            System.out.println("DataValue= " + dataValue);

            Variant variant = dataValue.getValue();

            System.out.println("Variant= " + variant);

            double random = (double)variant.getValue();
            System.out.println("myVariable= " + random);

        }
        catch(Throwable ex)
        {
            ex.printStackTrace();
        }

    }


}
