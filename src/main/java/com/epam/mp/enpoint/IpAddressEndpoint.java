package com.epam.mp.enpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping(value = "/ip")
public class IpAddressEndpoint {

    @GetMapping
    public String createBucketInAccount() throws UnknownHostException {

        return InetAddress.getLocalHost().toString();
    }
}
