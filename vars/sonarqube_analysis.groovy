def call(String SonarQubeApi, String ProjectName, String ProjectKey){
  withSonarQubeEnv("${SonarQubeApi}") {
    sh """
           $SONARQUBE_SERVER/bin/sonar-scanner \
          -Dsonar.projectName=${ProjectName} \
            -Dsonar.projectKey=${ProjectKey} \
      """
      }
}
