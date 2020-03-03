# springboot-k8s

springboot mysql k8s  demo

# build

~ mvn clean package dockerfile:build -DskipTests 

# build

~ mvn clean package dockerfile:push 

# test
~ http://172.16.32.162:30010/user/insert

~ http://172.16.32.162:30010/user/get
