Spring Boot "Hello World" Application for dockerizing, publishing to docker hub, and deploying to K8s using helm

Reference: http://www.masterspringboot.com/cloud/openshift/using-helm-charts-to-manage-your-spring-boot-applications-on-kubernetes/

Installation command:
helm install springbootdemo ./springbootdemo --namespace springbootdemo-helm --create-namespace