node {
   def mvnHome
   stage('Preparation') { 
      checkout([$class: 'GitSCM', branches: [[name: '*/jenkins']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'git', url: 'git@github.com:adikampli/expense-app.git']]])
      mvnHome = tool 'M3'
   }
   stage('Build') {
      // Run the maven build
      withEnv(["MVN_HOME=$mvnHome"]) {
         if (isUnix()) {
            sh '"$MVN_HOME/bin/mvn" -f ./expense-eureka/pom.xml -Dmaven.test.failure.ignore clean package'
         } else {
            bat(/"%MVN_HOME%\bin\mvn" -f expense-eureka\pom.xml -Dmaven.test.failure.ignore clean package/)
         }
      }
   }
   stage('Results') {
      // junit '**/target/surefire-reports/TEST-*.xml'
      archiveArtifacts 'expense-eureka/target/*.jar'
   }
}