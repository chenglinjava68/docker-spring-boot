FROM java:8
MAINTAINER chenglin
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
        && echo 'Asia/Shanghai' >/etc/timezone
#容器中创建目录
RUN mkdir -p /usr/local/chenglin
#编译后的jar包copy到容器中创建到目录内
COPY target/docker-spring-boot-1.0.0.jar /usr/local/chenglin/app.jar
#指定容器启动时要执行的命令
ENTRYPOINT ["java","-jar","/usr/local/chenglin/app.jar"]
