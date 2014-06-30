package org.wso2.jaggery.integration.tests.wsmock;

import javax.xml.ws.Endpoint;

public class MockServicePublisher {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:9960/ws/add", new AddServiceImpl());
        System.out.println("Server is published!");
    }
}
