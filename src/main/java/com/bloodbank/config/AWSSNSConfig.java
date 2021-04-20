package com.bloodbank.config;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;

@Configuration
public class AWSSNSConfig {
	 public static final String SECRET_KEY = "2sVDGZBfei00zK9/WCB7bozIlruDMYpSrrf9dF0d";
	    public static final String ACCESS_KEY = "AKIA4VACHIE4DCVOQRNT";

	    @Primary
	    @Bean
	    public AmazonSNSClient getSnsClient() {
	        return (AmazonSNSClient) AmazonSNSClientBuilder.standard().withRegion(Regions.EU_WEST_1)
	                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(ACCESS_KEY,
	                        SECRET_KEY)))
	                .build();
	    }

}
