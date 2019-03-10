# spring-boot-dubbo-example

An example for spring-boot + dubbo

## dubbo-origin

which use original dubbo configuration with `xml`.

- version dependencies

```xml
<dubbo.version>2.6.2</dubbo.version>
<zk.version>3.4.7</zk.version>
<zk.client.version>0.7</zk.client.version>
```

```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>dubbo</artifactId>
    <version>${dubbo.version}</version>
    <exclusions>
        <exclusion>
            <groupId>org.springframework</groupId>
            <artifactId>spring</artifactId>
        </exclusion>
    </exclusions>
</dependency>
 
<dependency>
    <groupId>org.apache.zookeeper</groupId>
    <artifactId>zookeeper</artifactId>
    <version>${zk.version}</version>
    <exclusions>
        <exclusion>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
        </exclusion>
    </exclusions>
</dependency>

<dependency>
    <groupId>com.101tec</groupId>
    <artifactId>zkclient</artifactId>
    <version>${zk.client.version}</version>
    <exclusions>
        <exclusion>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```

## dubbo-starter

which use spring-boot starter with dubbo

- version dependencies

```xml
<dependency>
    <groupId>com.alibaba.boot</groupId>
    <artifactId>dubbo-spring-boot-starter</artifactId>
    <version>0.2.0</version>
</dependency>
```

### curl your api

```bash
$ curl -XGET 'http://localhost:8081/api/example/login?username=xxx&password=xxx'

$ curl -XGET 'http://localhost:8091/api/example/login?username=xxx&password=xxx'
```
