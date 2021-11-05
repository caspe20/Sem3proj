package com.example.Sem3proj;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfigBuilder;
import org.eclipse.milo.opcua.stack.client.DiscoveryClient;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;
import org.eclipse.milo.opcua.stack.core.util.EndpointUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "PLCConnection", value = "/PLCConnection")
public class PLCConnection extends HttpServlet{

    private final String port = "4840";
    private final String hostname = "127.0.0.1";

    public void doPost(HttpServletRequest req, HttpServletResponse res) {

        try {

            List<EndpointDescription> endpoints = DiscoveryClient.getEndpoints("opc.tcp://" + hostname + ":" + port).get();
            EndpointDescription configPoint = EndpointUtil.updateUrl(endpoints.get(0), hostname, Integer.parseInt(port));

            OpcUaClientConfigBuilder cfg = new OpcUaClientConfigBuilder();
            cfg.setEndpoint(configPoint);

            OpcUaClient client = OpcUaClient.create(cfg.build());
            client.connect().get();

        } catch (Throwable ex) {
            ex.printStackTrace();

        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "hejsa" + "</h1>");
        out.println("</body></html>");
    }

}
