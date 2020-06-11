node {
   def mvnHome
   stage('Preparation') { 
      checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'git', url: 'git@github.com:adikampli/expense-app.git']]])
      mvnHome = tool 'M3'
   }
   stage('Build') {
      // Run the maven build
      withEnv(["MVN_HOME=$mvnHome"]) {
         if (isUnix()) {
            sh '"$MVN_HOME/bin/mvn" -f ./expense-config/pom.xml clean package'
            sh '"$MVN_HOME/bin/mvn" -f ./expense-eureka/pom.xml clean package'
            sh '"$MVN_HOME/bin/mvn" -f ./expense-zuul/pom.xml clean package'
            sh '"$MVN_HOME/bin/mvn" -f ./expense-stores/pom.xml clean package'
            sh '"$MVN_HOME/bin/mvn" -f ./expense-order/pom.xml clean package'
            sh '"$MVN_HOME/bin/mvn" -f ./expense-product/pom.xml clean package'
         } else {
            bat(/"%MVN_HOME%\bin\mvn" -f expense-config\pom.xml clean package/)
            bat(/"%MVN_HOME%\bin\mvn" -f expense-eureka\pom.xml clean package/)
            bat(/"%MVN_HOME%\bin\mvn" -f expense-zuul\pom.xml clean package/)
            bat(/"%MVN_HOME%\bin\mvn" -f expense-stores\pom.xml clean package/)
            bat(/"%MVN_HOME%\bin\mvn" -f expense-order\pom.xml clean package/)
            bat(/"%MVN_HOME%\bin\mvn" -f expense-product\pom.xml clean package/)
         }
      }
   }
   stage('Build Image') {
      // junit '**/target/surefire-reports/TEST-*.xml'
      if (isUnix()) {
            sh 'docker build -t expense-config -f ./expense-config/Dockerfile ./expense-config'
            sh 'docker build -t expense-eureka -f ./expense-eureka/Dockerfile ./expense-eureka'
            sh 'docker build -t expense-zuul -f ./expense-zuul/Dockerfile ./expense-zuul'
            sh 'docker build -t expense-stores -f ./expense-stores/Dockerfile ./expense-stores'
            sh 'docker build -t expense-order -f ./expense-order/Dockerfile ./expense-order'
            sh 'docker build -t expense-product -f ./expense-product/Dockerfile ./expense-product'
         } else {
            bat(/docker build -t expense-config -f expense-config\Dockerfile expense-config/)
            bat(/docker build -t expense-eureka -f expense-eureka\Dockerfile expense-eureka/)
            bat(/docker build -t expense-zuul -f expense-zuul\Dockerfile expense-zuul/)
            bat(/docker build -t expense-stores -f expense-stores\Dockerfile expense-stores/)
            bat(/docker build -t expense-order -f expense-order\Dockerfile expense-order/)
            bat(/docker build -t expense-product -f expense-product\Dockerfile expense-product/)
         }
      
   }
   stage('Results') {
      // junit '**/target/surefire-reports/TEST-*.xml'
      archiveArtifacts 'expense-config/target/*.jar'
      archiveArtifacts 'expense-eureka/target/*.jar'
      archiveArtifacts 'expense-zuul/target/*.jar'
      archiveArtifacts 'expense-stores/target/*.jar'
      archiveArtifacts 'expense-order/target/*.jar'
      archiveArtifacts 'expense-product/target/*.jar'
   }
}