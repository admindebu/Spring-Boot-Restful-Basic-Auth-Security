# Spring-Boot-Restful-Basic-Auth-Security
This is the simple demonstration of secure your restful web-service with basic auth. with the help of user name and password. 

# Follow Me on faceBook  :  https://www.facebook.com/TechTalkDebu
# Follow My YouTube Channel
# https://www.youtube.com/channel/UCYkLOAoRvirAUPXjcolTUSw

# Software Specification Details :

1. Java 8 
2. Maven 

# Authentication Details :
username : techtalk
password : debu
# Post APi is not Secure , except that others are secured
as Started with /api
# Post Body :
{
        "customerId": 1,
        "customerName": "TechTalk Hello guys",
        "customerGender": "MALE"
    }
    
Post Url : http://localhost:8080/api/customer   ( Not Secured. don't need basic auth )
Get Url : http://localhost:8080/customer ( Secured. need basic auth details - user name and password )

#Dependency Need to Add for security Only
     <!-- Spring Security-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
        </dependency>
        
        #YouTube #Link #Follow #Me : http://www.youtube.com/c/TechTalkDebu 
        Check the Video in my #Security playlist
