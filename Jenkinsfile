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
            sh '"$MVN_HOME/bin/mvn" -f ./expense-config/pom.xml -Dmaven.test.failure.ignore clean package'
            
         } else {
            bat(/"%MVN_HOME%\bin\mvn" -f expense-config\pom.xml -Dmaven.test.failure.ignore clean package/)
            
         }
      }
   }
   stage('Build Image') {
      // junit '**/target/surefire-reports/TEST-*.xml'
      if (isUnix()) {
            sh 'docker build -t expense-config -f ./expense-config/Dockerfile ./expense-config' 
         } else {
            bat(/docker build -t expense-config -f expense-config\Dockerfile expense-config/)
         }
      
   }
}