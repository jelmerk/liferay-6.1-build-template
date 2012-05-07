Liferay 6.1 ce project template
===============================

Description :

A set of build scripts that make it easy to start a liferay 6.1 project based on the community edition
To read more about why this template is organized the way it is, read the following [blog post](http://blog.orange11.nl/2012/05/03/liferay-sdk-development-best-practices/) on the orange11 blog

Getting started :

1. Download [ant](http://ant.apache.org/bindownload.cgi)

2. Set the following environment variables
  
   >ANT_HOME=/where/you/installed/ant
   >
   >ANT_OPTS=-Xmx1024m -XX:MaxPermSize=512m
   
3. Add ant to your path

4. Download and unzip the [build template](https://github.com/downloads/jelmerk/liferay-6.1-build-template/liferay-6.1-build-template.zip) on your local machine

5. Customize the template to suit your needs. Things you may want to change are

   The name of the portal and portal host in

   >liferay-plugins-sdk/ext/portal-ext/docroot/WEB-INF/ext-impl/src/portal-ext.properties

   The default locale and timezone in 

   >liferay-plugins-sdk/ext/portal-ext/docroot/WEB-INF/ext-impl/src/portal-ext.properties
   >
   >liferay-plugins-sdk/ext/portal-ext/docroot/WEB-INF/ext-impl/src/system-ext.properties
   >
   >etc/conf/development/portal/bin/setenv.bat
   >
   >etc/conf/development/portal/bin/setenv.sh
   >
   >etc/conf/nightly/portal/bin/setenv.sh
   >
   >etc/conf/production/portal/bin/setenv.sh

6. build the portal by issueing the following command in the template folder :

   ant clean build

7. Create the mysql database by issueing the following commands as the root mysql user

   drop database if exists liferay;

   create database liferay default character set utf8;

   grant all on liferay.* to liferay@localhost identified by 'liferay';

8. Start the portal by going to build/portal/apache-tomcat/bin and running

   on windows :

      >catalina.bat run

      or 

      >catalina.bat jpda run 

      to start up in debug mode
    
   on linux and osx :

      >./catalina.sh run

      or
    
      >./catalina.sh jpda run
    
   to start up in debug mode

9. To log in as administrator, go to http://localhost:8080 and log in with 

   >username : administrator@yourportal.com
   >
   >password : s3cr3t

   Or different credentials if you made changes to your portal-ext.properties file in step 5

10. Open the project in [intellij idea](http://www.jetbrains.com/idea/) and start working! 
    Intellij project files are included in the template

