#!/bin/sh

# 参数
DIST_PATH=/opt/dist
APP=shrimp-generate-backend



echo "开始..."

# 临时目录
TEMP_PATH=/opt/deploy_temp
mkdir -p $TEMP_PATH
cd $TEMP_PATH
echo "已创建临时目录$TEMP_PATH"

# 环境
export JAVA_HOME=/opt/jdk1.8
export PATH=$JAVA_HOME/bin:$PATH

# 代码
echo "准备拉取代码，可能需要验证信息..."
git clone https://github.com/shrimp-cloud/shrimp-generate-backend.git

# 编译
echo "准备编译..."
cd $TEMP_PATH/$APP/
/opt/maven3.6/bin/mvn clean -Dmaven.test.skip=true -pl lz-demo -am package

# 部署
echo "准备发布..."
cp $TEMP_PATH/$APP/lz-demo/target/*.jar $DIST_PATH/$APP/

# 启动
echo "重启应用..."
sh $DIST_PATH/$APP/service-uat.sh restart

# 清理遗留
rm -rf $TEMP_PATH

echo "=====================> 完成!"

cd ~

