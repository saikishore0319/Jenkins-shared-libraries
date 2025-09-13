def call(){
  sh '''
        docker compose pull
        docker compose up -d
     '''
}
