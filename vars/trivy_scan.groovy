def call(){
  sh "trivy fs --exit-code 0 --severity HIGH,CRITICAL --format json -o trivy-report.json"
  archiveArtifacts artifacts: 'trivy-report.json', fingerprint: true
}
