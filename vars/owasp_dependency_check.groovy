def call(String odcInstallation){
  dependencyCheck additionalArguments: '--scan ./', odcInstallation: '${odcInstallation}'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
