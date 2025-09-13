def call(String creds, String image, String image_tag){
  withCredentials([usernamePassword(credentialsId:creds, passwordVariable: 'dockerhubpass',usernameVariable: 'dockerhubuser')]){
      sh "docker login -u ${dockerhubuser} -p ${dockerhubpass} "
  }
    sh "docker push ${dockerhubuser}/${image}:${image_tag}"
}
