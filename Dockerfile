# 基础镜像使用java
FROM registry-vpc.cn-shenzhen.aliyuncs.com/lz-cloud/centos7:latest
# 作者
MAINTAINER wangkc <wkclz@qq.com>
# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
WORKDIR /apps
VOLUME /tmp
# 将jar包添加到容器中并更名为app.jar
ADD target/*.jar app.jar
# 运行jar包
# RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar",'--spring.profiles.active=uat']
