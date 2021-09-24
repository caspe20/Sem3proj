package milo;


import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfigBuilder;
import org.eclipse.milo.opcua.stack.client.DiscoveryClient;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;
import org.eclipse.milo.opcua.stack.core.util.EndpointUtil;

import java.util.List;


public class Write {


    public static void main(String[] args) {


        try
        {
            List<EndpointDescription> endpoints = DiscoveryClient.getEndpoints("opc.tcp://192.168.0.122:4840").get();
            EndpointDescription configPoint = EndpointUtil.updateUrl(endpoints.get(0),"192.168.0.122",4840);

            OpcUaClientConfigBuilder cfg = new OpcUaClientConfigBuilder();
            cfg.setEndpoint(configPoint);

            OpcUaClient client = OpcUaClient.create(cfg.build());
            client.connect().get();

            NodeId changeRequest = NodeId.parse("ns=6;s=::Program:Cube.Command.CmdChangeRequest");
            NodeId stout = NodeId.parse("ns=6;s=::Program:Cube.Command.Parameter[1].Value");
            NodeId speed = NodeId.parse("ns=6;s=::Program:Cube.Command.MachSpeed");
            NodeId start = NodeId.parse("ns=6;s=::Program:Cube.Command.CntrlCmd");


            client.writeValue(stout, DataValue.valueOnly(new Variant(3.0f))).get();

            client.writeValue(speed, DataValue.valueOnly(new Variant(199.0f))).get();



            client.writeValue(start, DataValue.valueOnly(new Variant(2))).get();
            client.writeValue(changeRequest, DataValue.valueOnly(new Variant(true))).get();


        }
        catch(Throwable ex)
        {
            ex.printStackTrace();
        }




    }

}
